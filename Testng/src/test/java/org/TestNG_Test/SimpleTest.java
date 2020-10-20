package org.TestNG_Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Clase de pruebas de ejemplo. OJO a:
 * 	- No hace falta extender interfaz.
 *  - Aunque el ejemplo utiliza las convenciones JUnit, se puede utilizar el nombre de método que se desee. Lo importante son las annotations.
 *  - Un método de prueba puede pertenecer a uno o varios grupos.
 *  
 *  Annotations a tener en cuenta:
 *  @BeforeSuite: The annotated method will be run before all tests in this suite have run.
 *  @AfterSuite: The annotated method will be run after all tests in this suite have run.
 *  @BeforeTest: The annotated method will be run before any test method belonging to the classes inside the <test> tag is run.
 *  @AfterTest: The annotated method will be run after all the test methods belonging to the classes inside the <test> tag have run.
 *  @BeforeGroups: The list of groups that this configuration method will run before. This method is guaranteed to run shortly before the first test method that belongs to any of these groups is invoked.
 *  @AfterGroups: The list of groups that this configuration method will run after. This method is guaranteed to run shortly after the last test method that belongs to any of these groups is invoked.
 *  @BeforeClass: The annotated method will be run before the first test method in the current class is invoked.
 *  @AfterClass: The annotated method will be run after all the test methods in the current class have been run.
 *  @BeforeMethod: The annotated method will be run before each test method.
 *  @AfterMethod: The annotated method will be run after each test method. 
 * 
 * Ver documentacion en http://testng.org/doc/documentation-main.html
 * 
 * @author Jonatan
 *
 */



public class SimpleTest {

	@Test(groups = { "fast" })
	public void aFastTest() {
		System.out.println("******* Fast test");
	}

	@Test(groups = { "slow" })
	public void aSlowTest() {
		System.out.println("******* Slow test");
	}
	
	@Test(dataProvider = "dp")
	public void f(Integer n, String s) {
		System.out.println("******* Ejecucion data-provider");
	}
	
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("******* Ejecucion before method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("******* Ejecucion after method");
	}


	@DataProvider
	public Object[][] dp() {
		return new Object[][] {
				new Object[] { 1, "Objeto number one" },
				new Object[] { 2, "Objeto number two" },
		};
	}
	@BeforeClass
	public void beforeClass() {
		// code that will be invoked when this test is instantiated
		System.out.println("******* Before class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("******* After class");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("******* Before test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("******* After test");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before suite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After suite");
	}

}