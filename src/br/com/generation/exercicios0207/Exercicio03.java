package br.com.generation.exercicios0207;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double idade;
		
		System.out.print("Digite a idade ");
		idade = ler.nextDouble();
		
		if(idade <=9) {
			System.out.print("Idade Inválida!");
		}
		
		else if(idade >= 10 && idade <=14) {
			System.out.print("Categoria: Infantil"); }
		

		else if(idade >= 15 && idade <=17) {
			System.out.print("Categoria: Juvenil"); }
		


		else if(idade >= 18 && idade <=25) {
			System.out.print("Categoria: Adulto"); }
		

		else if(idade >= 26) {
			System.out.print("Idade Inválida!"); }
		
ler.close();
	} 

} 
