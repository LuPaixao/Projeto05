//Tipos de dados
// Númericos (Inteiros e Reais)
package br.com.geekuniversity.secao06;

public class Programa11 {

	public static void main(String[] args) {
		//Tipos primários/primitivos
		long num0 = 54; //Inteiro muito grande *9999999999999999 
		int num1 = 4; //Inteiro *999999999999
		short num2 = 4; //Inteiro (curto/baixo/menor) *99999999
		byte num5 = 4; //Menor ainda *99999
		char num8 = 4; 
		
		
		//Tipos não primários/primitivos
		Long num7 = (long) 999999999; //cast
		Integer num3 = 98; //usado p/ fazer conversão exemplo 7
		Short num4 = 7; //usualmente p/ fazer conversões de um tipo p/ outro
		Byte num6 = 9;
		Character num9 = 65;
		
		
		System.out.println("long -> Num0 = " + num0);
		System.out.println("int -> Num1 = " + num1);
		System.out.println("short -> Num2 = " + num2);
		System.out.println("byte -> Num5 = " + num5);
		System.out.println("char -> Num8 = " + num8 );
		System.out.println("Long -> Num0 = " + num0);
		System.out.println("Integer -> Num3 = " + num3);
		System.out.println("Short -> Num4 = " + num4);
		System.out.println("Byte -> Num6 = " + num6 );
		System.out.println("Character -> Num9 = " + num9 + "\n");
		
		System.out.println("long/Long " + Long.SIZE + " bits");
		System.out.println("int/Integer " + Integer.SIZE + " bits");
		System.out.println("short/Short " + Short.SIZE + " bits");
		System.out.println("byte/Byte " + Byte.SIZE + " bits \n");

		System.out.println("Valor max long/Long " + Long.MAX_VALUE);
		System.out.println("Valor max int/Integer " + Integer.MAX_VALUE);
		System.out.println("Valor max short/Short " + Short.MAX_VALUE);
		System.out.println("Valor max byte/Byte " + Byte.MAX_VALUE + "\n");
		
		System.out.println("Valor min long/Long " + Long.MIN_VALUE);
		System.out.println("Valor min int/Integer " + Integer.MIN_VALUE);
		System.out.println("Valor min short/Short " + Short.MIN_VALUE);
		System.out.println("Valor min byte/Byte " + Byte.MIN_VALUE);


	}

}
