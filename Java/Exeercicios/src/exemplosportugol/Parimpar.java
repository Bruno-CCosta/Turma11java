package exemplosportugol;

import java.util.Scanner;

public class Parimpar {

	public static void main(String[] args) {
     Scanner ler = new Scanner(System.in);
		
		int num;
		System.out.print("Digite um número: ");
		num = ler.nextInt();
		
		if ((num > 0) && ((num % 2) ==0 )) 
		{
		  
			System.out.println("O número "+ num + " é par!");
		
		}
		
		else if ((num > 0) && ((num % 2) == 1 ))
		{
			System.out.println("O número "+ num + " é ímpar!");
			
		}
		else if (num < 0) 
		{
			System.out.println("O número é negativo.");
		}
		else 
		{
			System.out.println("Você digitou zero, que é nulo.");
		}
		
		
	}


	}


