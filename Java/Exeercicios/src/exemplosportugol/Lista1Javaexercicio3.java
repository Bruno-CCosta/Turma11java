package exemplosportugol;

import java.util.Scanner;

public class Lista1Javaexercicio3 {

		public static void main(String[] args) 
		{
			/*
			 * Faça um programa que receba a idade de uma pessoa
			 * e mostre na saída em qual categoria ela se encontra:
			10-14 infantil
			15-17 juvenil
			18-25 adulto
			 */
			
			int idade = 0;
			
			Scanner ler = new Scanner(System.in);
			
			
			System.out.print("Olá amigo(a), qual é a sua idade:");
			idade = ler.nextInt();
			
			
			if(idade < 10) 
			{
				System.out.printf("Você tem: %d anos, e infelizmente ainda não trabalhamos com sua faixa etaria", idade);

			}
			else if(idade >= 10 && idade <15)
			{
				System.out.printf("Você tem: %d anos, você esta na categoria Infantil! ", idade);

			} 
			else if(idade < 18) 
			{
				System.out.printf("Você tem: %d anos, você esta na categoria Juvenil! ", idade);
			}
			else if(idade < 26) 
			{
				System.out.printf("Você tem: %d anos, você esta na categoria Adulto! ", idade);

			}
			else 
			{
				System.out.printf("Você tem: %d anos, e hoje não temos uma categoria para sua faixa etaria ", idade);

			}
			
			
		}
	}