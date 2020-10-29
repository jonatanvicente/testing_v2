package org.cd.service;

import org.cd.bo.Drink;
import org.cd.repository.IRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExternalResource;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.internal.verification.VerificationModeFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Unit test - Tests with Mockito
 * Integration test - Remove mocks (integration)
 */
@RunWith(SpringRunner.class)
public class CDServiceImplIntegrationTest {

    @TestConfiguration
    static class CDServiceIntegrationTestContextConfiguration {
        @Bean
        public ICDService cdServiceImpl() {
            return new CDServiceImpl();
        }
    }

    @Autowired
    private CDServiceImpl cdService;

    @MockBean
    private IRepository iRepository;

    @Before
    public void setUp() {
        Drink drink = new Drink();
        drink.setId_vino(1);
        drink.setCategoria("Agua");

        //condicionamos comportamiento
        Mockito.when(iRepository.findByCategoria(drink.getCategoria())).thenReturn(Optional.of(drink));
        Mockito.when(iRepository.findByCategoria("wrong_name")).thenReturn(null);
        Mockito.when(iRepository.findAll()).thenReturn(initMockDrinks());
    }


/*    @Test
    public void wrongNameTest(){
        Drink found = cdService.
    }*/


    @Test
    public void verifyFindAllTest(){
        List<Drink> list = cdService.getAllTypes();
        assertThat(list.size()).isEqualTo(10);
        assertThat(list.get(0).getCategoria()).isEqualTo("****Vino de pruebas, garrafón");
        verifyFindAllIsCalledOnce();
    }

    private void verifyFindByNameIsCalledOnce(String categoria) {
        Mockito.verify(iRepository, VerificationModeFactory.times(1)).findByCategoria(categoria);
        Mockito.reset(iRepository);
    }

    private void verifyFindAllIsCalledOnce() {
        Mockito.verify(iRepository, VerificationModeFactory.times(1)).findAll();
        Mockito.reset(iRepository);
    }

    private List<Drink> initMockDrinks(){
        List<Drink> lista = new ArrayList<Drink>();

        Drink tv;
        for(int i=0; i<10; i++){
            tv = new Drink();
            tv.setId_vino(i);
            tv.setCategoria("****Vino de pruebas, garrafón");
            lista.add(tv);
        }
        return lista;
    }


}
