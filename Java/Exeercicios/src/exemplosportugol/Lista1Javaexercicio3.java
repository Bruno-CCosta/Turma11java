package exemplosportugol;

import java.util.Scanner;

public class Lista1Javaexercicio3 {

		public static void main(String[] args) 
		{
			/*
			 * Fa�a um programa que receba a idade de uma pessoa
			 * e mostre na sa�da em qual categoria ela se encontra:
			10-14 infantil
			15-17 juvenil
			18-25 adulto
			 */
			
			int idade = 0;
			
			Scanner ler = new Scanner(System.in);
			
			
			System.out.print("Ol� amigo(a), qual � a sua idade:");
			idade = ler.nextInt();
			
			
			if(idade < 10) 
			{
				System.out.printf("Voc� tem: %d anos, e infelizmente ainda n�o trabalhamos com sua faixa etaria", idade);

			}
			else if(idade >= 10 && idade <15)
			{
				System.out.printf("Voc� tem: %d anos, voc� esta na categoria Infantil! ", idade);

			} 
			else if(idade < 18) 
			{
				System.out.printf("Voc� tem: %d anos, voc� esta na categoria Juvenil! ", idade);
			}
			else if(idade < 26) 
			{
				System.out.printf("Voc� tem: %d anos, voc� esta na categoria Adulto! ", idade);

			}
			else 
			{
				System.out.printf("Voc� tem: %d anos, e hoje n�o temos uma categoria para sua faixa etaria ", idade);

			}
			
			
		}
	}