//Opera��es matem�ticas
package br.com.geekuniversity.secao06;

public class Programa15 {

	public static void main(String[] args) {
		int n1 = 5, n2 = 6, r;
		float res;
		
		//soma
		r = n2 + n1;
		System.out.println("A soma de " + n1 + " + " + n2 + " � igual a " + r);
		
		//subtra��o
		r = n2 - n1;
		System.out.println("A subtra��o de " + n2 + " - " + n1 + " � igual a " + r);

		//multiplica��o 
		r = n2 * n1;
		System.out.println("A multiplica��o de " + n2 + " x " + n1 + " � igual a " + r);

		//divis�o inteira
		r = n2 / n1;
		System.out.println("A divis�o inteira de " + n2 + " / " + n1 + " � igual a " + r);
		
		//divis�o real99
		res = n2 / n1;
		System.out.println("A divis�o real de " + n2 + " / " + n1 + " � igual a " + res);

		//modulo
		r = n2 % 2;
		res = n1 % 2;
		System.out.println("O resto da divis�o de " + n2 + " por 2, � igual a " + r);
		System.out.println("O resto da divis�o de " + n1 + " por 2, � igual a " + res);

	}

}
