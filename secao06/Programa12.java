//Tipos de dados
// N�mericos (Inteiros e Reais)
package br.com.geekuniversity.secao06;

public class Programa12 {
	public static void main(String[] args) {
		//tipos prim�rios/primitivos
		//Por padr�o, os n�meros reais s�o considerados double
		float preco1 = 23.4f; //menor espa�o *999.999
		double preco2 = 32.4; //maior espa�o que o float *99.9999999999999
		
		//tipos n�o prim�rios/primitivos
		Float preco3 = 44.5f; //ocupa mais espa�o em memoria, e o float � mais rapido
		Double preco4 = 43.5; 
		
		System.out.println("float -> preco1 =" + preco1);
		System.out.println("double -> preco2 =" + preco2);
		System.out.println("Float -> preco3 =" + preco3);
		System.out.println("Double -> preco4 =" + preco4);
		
		System.out.println("int/Integer " + Integer.SIZE + " bits");
		System.out.println("short/Short " + Short.SIZE + " bits");
		System.out.println("byte/Byte " + Byte.SIZE + " bits \n");
		
		System.out.println("Valor max int/Integer " + Integer.MAX_VALUE);
		System.out.println("Valor max short/Short " + Short.MAX_VALUE);
		System.out.println("Valor max byte/Byte " + Byte.MAX_VALUE + "\n");
		
		System.out.println("Valor min int/Integer " + Integer.MIN_VALUE);
		System.out.println("Valor min short/Short " + Short.MIN_VALUE);
		System.out.println("Valor min byte/Byte " + Byte.MIN_VALUE);
		
	}
}
