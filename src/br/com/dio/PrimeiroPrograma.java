package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Gato gato = new Gato();
		Livros livros = new Livros();
		System.out.println(gato);
		System.out.println(livros) ;

		int a = 1;
		int b = 2;
		System.out.println("Hello World! " + (a+b));
	
	}

}

class Livros {
	private String nome;
	private String npag;
}