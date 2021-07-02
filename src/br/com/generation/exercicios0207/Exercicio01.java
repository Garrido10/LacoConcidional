package br.com.generation.exercicios0207;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero1, numero2, numero3;
		
		System.out.print("Digite o primeiro número: ");
		numero1 = ler.nextInt();
		
		System.out.print("Digite o segundo número: ");
		numero2 = ler.nextInt();
				
		System.out.print("Digite o terceiro número: ");
		numero3 = ler.nextInt();
		
		if(numero1 > numero2 && numero1 > numero3) {
			System.out.println("O maior número é: " + numero1);
		}
		else if(numero2 > numero1 && numero2 > numero3) {
			System.out.println("O maior número é: " + numero2);
		}
		
		else if(numero3 > numero1 && numero3 > numero2) {
			System.out.println("O maior número é: " + numero3);
		}
		
		else if(numero3 == numero1 && numero3 == numero2) {
			System.out.println("Todos os números são iguais! " + "Número: " + numero1);
		}

	}

}
