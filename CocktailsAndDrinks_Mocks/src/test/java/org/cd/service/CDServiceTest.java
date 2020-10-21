package org.cd.service;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.doCallRealMethod;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.cd.bo.TiposVinos;
import org.cd.dao.TiposVinosDAOImpl;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.internal.stubbing.answers.CallsRealMethods;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(locations = "classpath:spring-test-config.xml")
@RunWith(MockitoJUnitRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CDServiceTest {
	
	@InjectMocks
	@Autowired
	private CDService cdService;
	
	@Spy
	private ExternalService externalService;

	@Mock
	private TiposVinosDAOImpl dao;
	
	@Before
    public void initMocks(){
        MockitoAnnotations.initMocks(this);
    }
	
	
	@Test
	public void getAllTiposVinosTest(){
		
		//Mockito expectations (stubbing, condicionado de respuesta)
		when(dao.getAll()).thenReturn(initMockTiposVinos());
		//trazamos retorno 
		trace(cdService.getAllTiposVinos());
		
		//verificación número de invocaciones hasta este punto al método getAll()
		verify(dao, times(1)).getAll();

		//ejecución del test y assertion
		assertThat(cdService.getAllTiposVinos()).doesNotContainNull();
		
	}
	
	@Test(expected = AssertionError.class)
	public void priceTest(){
		int ID_TIPO_VINO_TEST = 10;
		
		//preparacion comportamiento spy
		doReturn(0).when(externalService).getStocks(ID_TIPO_VINO_TEST);
		
		System.out.println("\r\n");
		System.out.println("*******Spy inyecta price: "+cdService.getPrice(ID_TIPO_VINO_TEST));
		
		
		//permitimos invocacion real a metodo
		doCallRealMethod().when(externalService).getStocks(ID_TIPO_VINO_TEST);
		System.out.println("*******Invocacion real a metodo: "+cdService.getPrice(ID_TIPO_VINO_TEST));
		System.out.println("\r\n");
		
		//ejecucion test (forzamos error esperado)
		assertThat(cdService.getPrice(ID_TIPO_VINO_TEST)).isLessThan(0);
		
	}
	
	
	
	private List<TiposVinos> initMockTiposVinos(){
		List<TiposVinos> lista = new ArrayList<TiposVinos>();
		
		TiposVinos tv;
		for(int i=0; i<10; i++){
			tv = new TiposVinos();
			tv.setId_vino(i);
			tv.setCategoria("****Vino de pruebas, garrafón");
			lista.add(tv);
		}
		return lista;
	}
	
	
	private void trace(List<TiposVinos> tipos){
		System.out.println("\r\n");
		System.out.println("******************************"+tipos == null);
		System.out.println("**********************************Size: "+tipos.size());
		TiposVinos vino;
		for(int i=0; i<tipos.size(); i++){
			vino = tipos.get(i);
			System.out.println("******************************"+vino.getCategoria());
		}
		System.out.println("\r\n");
	}


}
