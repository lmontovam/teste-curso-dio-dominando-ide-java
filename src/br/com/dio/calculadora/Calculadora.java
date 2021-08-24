package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("A: ");
		a = scan.nextInt();
		System.out.println("B:  ");
		b = scan.nextInt();
		
		int soma = soma(a,b);
		int substracao = substracao(a,b);
		int multiplicacao = multiplicacao(a,b);
		float divisao = divisao(a,b);
		
		System.out.println(soma);
		System.out.println(substracao);
		System.out.println(multiplicacao);
		System.out.println(divisao);
		
	}
	
	public static int soma(int a, int b) {
		return a + b; 
	}
	
	public static int substracao(int a, int b) {
		return a - b; 
	}
	
	public static float divisao(float a, float b) {
		return a / b; 
	}
	
	public static int multiplicacao(int a, int b) {
		return a * b; 
	}

}
