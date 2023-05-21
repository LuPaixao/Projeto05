//Operações matemáticas
package br.com.geekuniversity.secao06;

public class Programa15 {

	public static void main(String[] args) {
		int n1 = 5, n2 = 6, r;
		float res;
		
		//soma
		r = n2 + n1;
		System.out.println("A soma de " + n1 + " + " + n2 + " é igual a " + r);
		
		//subtração
		r = n2 - n1;
		System.out.println("A subtração de " + n2 + " - " + n1 + " é igual a " + r);

		//multiplicação 
		r = n2 * n1;
		System.out.println("A multiplicação de " + n2 + " x " + n1 + " é igual a " + r);

		//divisão inteira
		r = n2 / n1;
		System.out.println("A divisão inteira de " + n2 + " / " + n1 + " é igual a " + r);
		
		//divisão real99
		res = n2 / n1;
		System.out.println("A divisão real de " + n2 + " / " + n1 + " é igual a " + res);

		//modulo
		r = n2 % 2;
		res = n1 % 2;
		System.out.println("O resto da divisão de " + n2 + " por 2, é igual a " + r);
		System.out.println("O resto da divisão de " + n1 + " por 2, é igual a " + res);

	}

}
