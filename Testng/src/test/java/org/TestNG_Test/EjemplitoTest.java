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
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import junit.framework.Assert;


public class EjemplitoTest {


	private final int DATA_TEST = 9;



	@BeforeMethod
	public void beforeMethod() {
	}

	@AfterMethod
	public void afterMethod() {
	}


	@DataProvider
	public Object[][] dp() {
		return new Object[][] {
			new Object[] { 1, "a" },
			new Object[] { 2, "b" },
		};
	}
	@BeforeClass
	public void beforeClass() {
	}

	@AfterClass
	public void afterClass() {
	}

	@BeforeTest
	public void beforeTest() {
	}

	@AfterTest
	public void afterTest() {
	}

	@BeforeSuite
	public void beforeSuite() {
	}

	@AfterSuite
	public void afterSuite() {
	}

	@Test(dataProvider = "dp")
	public void f(Integer n, String s) {
	}

	@Test
	public void multiplicaPorCinco() {
		Assert.assertNotNull(Ejemplito.multiplicaPorCinco(DATA_TEST));
		Assert.assertEquals(Ejemplito.multiplicaPorCinco(DATA_TEST), DATA_TEST*5);
	}

	@Test
	@Parameters({"param_test"})
	public void multiplicaPorCuatro(int paramTest) {
		Assert.assertNotNull(Ejemplito.multiplicaPorCuatro(paramTest));
		Assert.assertEquals(Ejemplito.multiplicaPorCuatro(paramTest), paramTest*4);
	}

	@Test
	public void multiplicaPorDos() {
		Assert.assertNotNull(Ejemplito.multiplicaPorDos(DATA_TEST));
		//Assert.assertEquals(Ejemplito.multiplicaPorDos(DATA_TEST), DATA_TEST*5);//error intencionado
	}

	@Test(dependsOnMethods={"multiplicaPorDos"})
	@Parameters({"param_test"})
	public void multiplicaPorNueve(int paramTest) {
		Assert.assertNotNull(Ejemplito.multiplicaPorNueve(paramTest));
		Assert.assertEquals(Ejemplito.multiplicaPorNueve(paramTest), paramTest*9);
	}

	//ejecuta el test para tantos elementos como tenga el dataProvider. Soporta Map
	@Test(dataProvider = "provideNumbers")
	public void testProvideData(int number, int expected) {
		Assert.assertEquals(number + 10, expected);
	}

	@DataProvider(name = "provideNumbers")
	public Object[][] provideData() {

		return new Object[][] { 
			{ 10, 20 }, 
			{ 100, 110 }, 
			{ 200, 210 } 
		};
	}

	@Test
	public void multiplicaPorOcho() {
	}

	@Test
	public void multiplicaPorSeis() {
	}

	@Test
	public void multiplicaPorSiete() {
	}

	@Test
	public void multiplicaPorTres() {
	}
}
