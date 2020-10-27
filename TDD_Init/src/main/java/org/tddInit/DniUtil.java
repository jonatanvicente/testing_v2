package org.tddInit;

import java.util.HashMap;
import java.util.Map;

public class DniUtil{


	public static void main(String ar[]){
	   System.out.println(calcNif(53041447));
	}


	private static Map<Integer, String> letras = new HashMap<Integer, String>();
	
	public static String calcNif(int dni){
		
		initParameters();
		int numero = dni%23;
		
		return (letras.containsKey(numero) ? (letras.get(numero)) : "");
		
	}
	
	private static void initParameters(){
		
		letras.put(0, "T");
		letras.put(1, "R");
		letras.put(2, "W");
		letras.put(3, "A");
		letras.put(4, "G");
		letras.put(5, "M");
		letras.put(6, "Y");
		letras.put(7, "F");
		letras.put(8, "P");
		letras.put(9, "D");
		letras.put(10, "X");
		letras.put(11, "B");
		letras.put(12, "N");
		letras.put(13, "J");
		letras.put(14, "Z");
		letras.put(15, "S");
		letras.put(16, "Q");
		letras.put(17, "V");
		letras.put(18, "H");
		letras.put(19, "L");
		letras.put(20, "C");
		letras.put(21, "K");
		letras.put(22, "E");
	}
	
	
}