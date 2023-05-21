//Tipos de dados
// Númericos (Inteiros e Reais)
package br.com.geekuniversity.secao06;

public class Programa12 {
	public static void main(String[] args) {
		//tipos primários/primitivos
		//Por padrão, os números reais são considerados double
		float preco1 = 23.4f; //menor espaço *999.999
		double preco2 = 32.4; //maior espaço que o float *99.9999999999999
		
		//tipos não primários/primitivos
		Float preco3 = 44.5f; //ocupa mais espaço em memoria, e o float é mais rapido
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
