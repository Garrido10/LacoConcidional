package br.com.generation.exercicios0207;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
Scanner ler = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.print("Digite o primeiro n�mero: ");
		num1 = ler.nextInt();
		
		System.out.print("Digite o segundo n�mero: ");
		num2 = ler.nextInt();
				
		System.out.print("Digite o terceiro n�mero: ");
		num3 = ler.nextInt();
		
		  if((num1>num2) && (num1>num3)) {
	            if(num2>num3) {
	                System.out.println("A ordem crescente dos n�meros �: " + num3 + ", " + num2 + " e " + num1 + ".");
	            }
	            else if(num3>num2) {
	                System.out.println("A ordem crescente dos n�meros �: " + num2 + ", " + num3 + " e " + num1 + ".");
	            }
	        }
	        else if((num2>num1) && (num2>num3)) {
	            if(num1>num3) {
	                System.out.println("A ordem crescente dos n�meros �: " + num3 + ", " + num1 + " e " + num2 + ".");
	            }
	            else if(num3>num1) {
	                System.out.println("A ordem crescente dos n�meros �: " + num1 + ", " + num3 + " e " + num2 + ".");
	            }
	        }
	        else if((num3>num1) && (num3>num2)) {
	            if(num1>num2) {
	                System.out.println("A ordem crescente dos n�meros �: " + num2 + ", " + num1 + " e " + num3 + ".");
	            }
	            else if(num2>num1) {
	                System.out.println("A ordem crescente dos n�meros �: " + num1 + ", " + num2 + " e " + num3 + ".");
	            }
	        }
	    }
	
		
		
		
		
	
	
		
		
		
		

	}


