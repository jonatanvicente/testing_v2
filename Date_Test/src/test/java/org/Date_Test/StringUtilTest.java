package org.Date_Test;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Collection;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(value=Parameterized.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StringUtilTest {

	public Boolean expected;
	public String s;


	public StringUtilTest(String expected, String value) {
		this.expected = new Boolean(expected);
		this.s = value;
	}


	@Parameters 
	public static Collection<String[]> getStringParameters() throws ParseException{

		final String stringOne =   "%$&)=#@|=&/'·$";
		final String stringTwo =   "@~¬][-abcdew(";
		final String stringThree = "<>{[-.,}[^*¡'?";
		final String stringFour =  "k&%2·#¬·(ç^";

		//conjunto de resultado de los tests (mismo resultado para todos)
		return Arrays.asList(
				new String[]{"false", stringOne},
				new String[]{"false", stringTwo},
				new String[]{"false", stringThree},
				new String[]{"false", stringFour});
	}

	@Test
	public void alphaTest(){
		assertNotNull(s);
		assertEquals(expected, Utils.isAlphanumeric(s));
	}

	@Test
	public void blankTest(){
		assertNotNull(s);
		assertEquals(expected, Utils.isBlank(s));
	}

	@Test
	public void emptyTest(){
		assertNotNull(s);
		assertEquals(expected, Utils.isEmpty(s));
	}

	@Test
	public void upperCaseTest(){
		assertNotNull(s);
		assertEquals(expected, Utils.isAllUpperCase(s));
	}

}
