package br.com.generation.exercicios0207;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
Scanner ler = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.print("Digite o primeiro número: ");
		num1 = ler.nextInt();
		
		System.out.print("Digite o segundo número: ");
		num2 = ler.nextInt();
				
		System.out.print("Digite o terceiro número: ");
		num3 = ler.nextInt();
		
		  if((num1>num2) && (num1>num3)) {
	            if(num2>num3) {
	                System.out.println("A ordem crescente dos números é: " + num3 + ", " + num2 + " e " + num1 + ".");
	            }
	            else if(num3>num2) {
	                System.out.println("A ordem crescente dos números é: " + num2 + ", " + num3 + " e " + num1 + ".");
	            }
	        }
	        else if((num2>num1) && (num2>num3)) {
	            if(num1>num3) {
	                System.out.println("A ordem crescente dos números é: " + num3 + ", " + num1 + " e " + num2 + ".");
	            }
	            else if(num3>num1) {
	                System.out.println("A ordem crescente dos números é: " + num1 + ", " + num3 + " e " + num2 + ".");
	            }
	        }
	        else if((num3>num1) && (num3>num2)) {
	            if(num1>num2) {
	                System.out.println("A ordem crescente dos números é: " + num2 + ", " + num1 + " e " + num3 + ".");
	            }
	            else if(num2>num1) {
	                System.out.println("A ordem crescente dos números é: " + num1 + ", " + num2 + " e " + num3 + ".");
	            }
	        }
	    }
	
		
		
		
		
	
	
		
		
		
		

	}


