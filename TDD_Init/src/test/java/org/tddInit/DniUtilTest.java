
package org.tddInit;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class DniUtilTest{

	private Map<Integer, String> assign = new HashMap<Integer, String>();


	@BeforeMethod
	public void init(){
		initHashMap();
	}

	//algoritmo numero 23: resto de dni/23
	@Test()
	@Parameters({"dni"})
	public void testDni(int dni){

		//ejecución
		String character = DniUtil.calcNif(dni);

		//comprobación
		String verify = getLetter(dni);
		assertThat(character).isNotNull();
		Assert.assertEquals(character, verify);

	}


	@Test(dataProvider = "multipleTests")
	public void testMultipleDni(int dni, String result){
		String character = DniUtil.calcNif(dni);
		assertThat(character).isNotNull();
		Assert.assertEquals(character, result);

	}

	@DataProvider(name = "multipleTests")
	private Object[][] provideData(){

		Properties props = new Properties();
		try{
			props.load(this.getClass().getResourceAsStream("loadTest.properties"));
		}catch(IOException ioe){System.out.println(ioe.getMessage());}

		Object[][] values = new Object[props.size()][2];
		
		
		Set keys = props.keySet();
		String key;
		int cont = 0;
		Iterator it = keys.iterator();
		
		while(it.hasNext()){
			key = (String)it.next();
			values[cont][0] = Integer.parseInt(key);
			values[cont][1] = props.getProperty(key);
			cont++;
		}
		
		return values;

	}


	private String getLetter(int dni){
		int number = dni % 23;
		return (assign.containsKey(number) ? (assign.get(number)) : "");

	}

	private void initHashMap(){
		assign.put(0, "T");
		assign.put(1, "R");
		assign.put(2, "W");
		assign.put(3, "A");
		assign.put(4, "G");
		assign.put(5, "M");
		assign.put(6, "Y");
		assign.put(7, "F");
		assign.put(8, "P");
		assign.put(9, "D");
		assign.put(10, "X");
		assign.put(11, "B");
		assign.put(12, "N");
		assign.put(13, "J");
		assign.put(14, "Z");
		assign.put(15, "S");
		assign.put(16, "Q");
		assign.put(17, "V");
		assign.put(18, "H");
		assign.put(19, "L");
		assign.put(20, "C");
		assign.put(21, "K");
		assign.put(22, "E");
	}
}



