package br.com.generation.exercicios0207;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero1, numero2, numero3;
		
		System.out.print("Digite o primeiro n�mero: ");
		numero1 = ler.nextInt();
		
		System.out.print("Digite o segundo n�mero: ");
		numero2 = ler.nextInt();
				
		System.out.print("Digite o terceiro n�mero: ");
		numero3 = ler.nextInt();
		
		if(numero1 > numero2 && numero1 > numero3) {
			System.out.println("O maior n�mero �: " + numero1);
		}
		else if(numero2 > numero1 && numero2 > numero3) {
			System.out.println("O maior n�mero �: " + numero2);
		}
		
		else if(numero3 > numero1 && numero3 > numero2) {
			System.out.println("O maior n�mero �: " + numero3);
		}
		
		else if(numero3 == numero1 && numero3 == numero2) {
			System.out.println("Todos os n�meros s�o iguais! " + "N�mero: " + numero1);
		}

	}

}
