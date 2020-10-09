package aulasJava;

import java.util.Scanner;

public class Exercicio3Dia08 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int idade=0 , idade21=0 , idade50=0;
		
		while (idade!=-99) {
			System.out.print("Qual a sua idade:");
			idade = ler.nextInt();
			
			if (idade<21) { 
				idade21++;}
			 if (idade>50) 
				idade50++;}
			
			System.out.printf("Temos %d pessoas com menos de 21, e %d pessoas acima dos 50", idade21, idade50);
		

	}

}



