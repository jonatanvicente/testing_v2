package org.cd.config;

import static org.assertj.core.api.Assertions.assertThat;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.cd.bo.TiposVinos;
import org.cd.dao.IGenericDAO;
import org.cd.service.CDService;
import org.cd.service.ExternalService;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-test-config.xml")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

//Integration Test
public class ConfigTest{
	
	@PersistenceContext
	EntityManager entityManager;
	@Autowired
	private IGenericDAO<TiposVinos> dao;
	@Autowired
	private TiposVinos tv;
	@Autowired
	private CDService cdService;
	@Autowired
	private ExternalService externalService;
	
	@Test
	public void initEntitiesDatabase(){
		assertThat(entityManager).isNotNull().isInstanceOf(EntityManager.class);
		assertThat(dao).isNotNull().isInstanceOf(IGenericDAO.class);
		assertThat(tv).isNotNull().isInstanceOf(TiposVinos.class);
	}
	
	
	@Test
	public void initQueriesTest(){
		Query allTiposVinosQuery = entityManager.createNamedQuery("CD.allTiposVinos");
		Query findTiposVinosQuery = entityManager.createNamedQuery("CD.findTiposVinos");
		assertThat(allTiposVinosQuery).isNotNull();
		assertThat(findTiposVinosQuery).isNotNull();
		
	}
	
	public void initEntitiesService(){
		assertThat(cdService).isNotNull().isInstanceOf(CDService.class);
		assertThat(externalService).isNotNull().isInstanceOf(CDService.class);
	}
	
	
}