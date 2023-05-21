//Tipos de dados alfanuméricos
//caracteres e strings
package br.com.geekuniversity.secao06;

public class Programa13 {
	public static void main(String[] args) {
		//Tipos primitivos
		char letra0 = 'a'; //aspas simples (aspas duplas ele considera string)
		char letra1 = 65; //A 
		char letra2 = 97; //a
		
		System.out.println("letra " + letra0);
		System.out.println("letra " + letra1);
		System.out.println("letra " + letra2 + "\n");
		//string nom + "adsa"; Não existe o tipo primitivo string em Java
		
		/*for(char i = 97; i < 129; i++){
			System.out.println(i);
		}
		*/
		//Tipos não primitivos
		Character letra3 = 'A';
		String nome = "Luana";
		
		System.out.println(letra3);
		System.out.println(nome);
		
		System.out.println("char/Character " + Character.SIZE + " bits");
		
		System.out.println("valor min char/Character " + Character.MIN_VALUE + " bits");
		System.out.println("valor max char/Character " + Character.MAX_VALUE + " bits");

		System.out.println("Tamanho da String " + nome.length());
		
		System.out.println("Nome " + (Character.SIZE * nome.length()) + " bits");
		//para conseguir ver o tamanho de memória da str
		//pois não é permitido o .SIZE
	}

}
