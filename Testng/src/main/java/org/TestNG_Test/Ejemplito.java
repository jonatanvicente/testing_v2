package org.TestNG_Test;

public class Ejemplito {

	final static int NUMBER = 2;

	public static void main(String ar[]){
		multiplicaPorDos(NUMBER);
		multiplicaPorTres(NUMBER);
		multiplicaPorCuatro(NUMBER);
		multiplicaPorCinco(NUMBER);
		multiplicaPorSeis(NUMBER);
		multiplicaPorSiete(NUMBER);
		multiplicaPorOcho(NUMBER);
		multiplicaPorNueve(NUMBER);
	}
	/**
	 * Método que multiplica por dos un número.
	 * @param numero. El número a plumiticar por dos.
	 * @return int. El número plumiticado por dos.
	 */
	public static int multiplicaPorDos(int numero){return numero*2;}
	public static int multiplicaPorTres(int numero){return numero*3;}
	public static int multiplicaPorCuatro(int numero){return numero*4;}
	public static int multiplicaPorCinco(int numero){return numero*5;}
	public static int multiplicaPorSeis(int numero){return numero*6;}
	public static int multiplicaPorSiete(int numero){return numero*7;}
	public static int multiplicaPorOcho(int numero){return numero*8;}
	public static int multiplicaPorNueve(int numero){return numero*9;}


}
