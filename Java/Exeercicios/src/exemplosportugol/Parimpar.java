package exemplosportugol;

import java.util.Scanner;

public class Parimpar {

	public static void main(String[] args) {
     Scanner ler = new Scanner(System.in);
		
		int num;
		System.out.print("Digite um n�mero: ");
		num = ler.nextInt();
		
		if ((num > 0) && ((num % 2) ==0 )) 
		{
		  
			System.out.println("O n�mero "+ num + " � par!");
		
		}
		
		else if ((num > 0) && ((num % 2) == 1 ))
		{
			System.out.println("O n�mero "+ num + " � �mpar!");
			
		}
		else if (num < 0) 
		{
			System.out.println("O n�mero � negativo.");
		}
		else 
		{
			System.out.println("Voc� digitou zero, que � nulo.");
		}
		
		
	}


	}


