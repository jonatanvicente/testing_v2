package org.fixtures;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExternalResource;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


public class FixturesTest {

	
	static class ExpensiveExternalResource extends ExternalResource {
		 
        ExpensiveExternalResource() {
            System.out.println("Constructor static ExpensiveExternalResource");
        }
        @Override
        protected void after() {
            System.out.println("After static ExpensiveExternalResource");
        };
 
        @Override
        protected void before() throws Throwable {
        	System.out.println("Before static ExpensiveExternalResource");
        };
    };
	
	@BeforeClass
	public static void setUpClass(){
		System.out.println("SetUp class");
	}
		
	@AfterClass
	public static void tearDownClass(){
		System.out.println("Tear Down Class");
	}
	
	@Before
	public void setUp(){
		System.out.println("Inicialización previa a test");
	}
		
	@After
	public void tearDown(){
		System.out.println("Tear down posterior a test");
	}
	
	
	@Test
	public void testOne() {
		System.out.println("Ejecucion de test NUMBER ONE");
	}
	
	@Test
	public void testTwo() {
		System.out.println("Ejecucion de test NUMBER TWO");
	}
	
	@Rule
    public ExternalResource resource = new ExpensiveExternalResource();
 
    @ClassRule
    public static ExternalResource staticResource = new ExpensiveExternalResource();
 
	

}
