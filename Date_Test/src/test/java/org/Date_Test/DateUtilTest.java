package org.Date_Test;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value=Parameterized.class)
public class DateUtilTest {

	public Boolean expected;
	public Date valueOne;
	public Date valueTwo;
	public String s;

	
	public DateUtilTest(Boolean expected, Date valueOne, Date valueTwo) {
		this.expected = expected;
		this.valueOne = valueOne;
		this.valueTwo = valueTwo;
	}
	
	
	@Parameters 
	public static Collection<Object[]> getDateParameters() throws ParseException{
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy");
		String dOne = "22-01-1975";
		String dTwo = "01-01-2000";
		String dThree = "08-04-1989";
		String dFour = "05-06-2018";
		String dFive = "03-05-2018";
		String dSix = "03-05-2018";
		
		Date dateOne = sdf.parse(dOne);
		Date dateTwo = sdf.parse(dTwo);
		Date dateThree = sdf.parse(dThree);
		Date dateFour = sdf.parse(dFour);
		Date dateFive = sdf.parse(dFive);
		Date dateSix = sdf.parse(dSix);
		
		return Arrays.asList(
			new Object[]{new Boolean(false), dateOne, dateTwo},
			new Object[]{new Boolean(false), dateThree, dateFour},
			new Object[]{new Boolean(true), dateFive, dateSix}			
		);
	}
	
	
	@Test
	public void dateTest(){
		
		assertEquals(expected, Utils.isSameDay(valueOne, valueTwo));
		
	}
		
}
