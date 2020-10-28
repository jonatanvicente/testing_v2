package org.Initial_Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value=Parameterized.class)
public class ParameterizedTest{

	private double expected;
	private double valueOne;
	private double valueTwo;

	
	public ParameterizedTest(double expected, 
			double valueOne, double valueTwo) {
		this.expected = expected;
		this.valueOne = valueOne;
		this.valueTwo = valueTwo;
	}

	
	@Parameters 
	public static Collection<Integer[]> getTestParameters() {
		return Arrays.asList(new Integer[][] {
			{2, 1, 1},  //resultado esperado, valor, valor   
			{3, 2, 1},     
			{4, 3, 1},
			{5, 4, 1}, 
			{6, 5, 1}, 
		});
	}

	

	@Test
	public void sumTest() {
		Ejemplito ej = new Ejemplito();
		System.out.println("******* Ejecutado test: "+valueOne+" + "+valueTwo);
		assertEquals(expected, ej.sum(valueOne, valueTwo), 0);
	} 
}

