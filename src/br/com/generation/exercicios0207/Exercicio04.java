package br.com.generation.exercicios0207;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num, resposta;
		
		System.out.print("Digite um n�mero: ");
		num = leia.nextInt();
		resposta = num % 2;
		
		if(resposta == 0) {
			System.out.print("Este n�mero � par!\n");
			System.out.print(Math.sqrt(num));
		}
		else {
			System.out.print("Este n�mero � �mpar!\n");
			System.out.print(Math.pow(num, 2));
		}
		

	}

}
