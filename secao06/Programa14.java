//Tipos booleanos
package br.com.geekuniversity.secao06;

public class Programa14 {

	public static void main(String[] args) {
		//Tipos primitivos
		boolean verdadeiro = true;
		boolean falso = false;		
		
		//Tipos n�o primitivos
		Boolean v = true;
		Boolean f = false;
		
		System.out.println("Verdadeiro " + verdadeiro);
		System.out.println("Falso " + falso);	
		System.out.println("v " + v);
		System.out.println("f " + f);
		// .SIZE vai dar ou 0 p/falso e 1 p/verdadeiro
		
		if(verdadeiro) {//n�o necess�rio por == true, pois ele ja verifica
			System.out.println("� Verdadeiro");
		}else {
			System.out.println("� falso");
		}
	}
}
