package org.cd.dao;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;

import org.cd.bo.TiposVinos;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-test-config.xml")
@TestExecutionListeners({DependencyInjectionTestExecutionListener.class})
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class TiposVinosDAOTest{

	@Autowired
	public IGenericDAO<TiposVinos> dao;	
	@Autowired
	private TiposVinos tv;
	
	@Before
	public void initTest(){
		assertThat(dao).isNotNull();
	}

	@Test
	public void saveOrUpdateTest(){
		//save
		final int NEW_ID = 21;
		final String NEW_CATEGORY = "Somontano";
		
		tv.setId_vino(NEW_ID);
		tv.setCategoria(NEW_CATEGORY);
		dao.saveOrUpdate(tv);
		assertThat(dao.find(NEW_ID)).isNotNull();
		assertTrue((((TiposVinos)dao.find(NEW_ID)).getId_vino() == NEW_ID));
		assertTrue((((TiposVinos)dao.find(NEW_ID)).getCategoria() == NEW_CATEGORY));
		
		
		//update
		final int OLD_ID = 4;
		tv.setId_vino(OLD_ID);
		tv.setCategoria(NEW_CATEGORY);
		dao.saveOrUpdate(tv);
		assertThat(dao.find(OLD_ID)).isNotNull();
		assertTrue((((TiposVinos)dao.find(OLD_ID)).getCategoria() == NEW_CATEGORY));
		
	}
	
	
	@Test
	public void findTest(){

		//aleatorio
		final int ID_TEST = 5;
		assertThat(dao.find(ID_TEST)).isNotNull();
		assertTrue((((TiposVinos)dao.find(ID_TEST)).getId_vino() == ID_TEST));
	}
	
	
	
	
	@Test
	public void getAllTest(){
		assertThat(dao.getAll()).isNotNull().isNotEmpty();
	}




	@Test(expected = javax.persistence.NoResultException.class)
	public void removeTest(){
		
		final int ID_TEST = 9;
		dao.remove(ID_TEST);
		dao.find(ID_TEST);
	}







}