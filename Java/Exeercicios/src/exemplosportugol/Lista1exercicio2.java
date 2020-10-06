package exemplosportugol;

import java.util.Scanner;

public class Lista1exercicio2 
{
    
	public static void main(String[] args) 
	{		Scanner ler = new Scanner(System.in);

		int anos;
		int meses;
		int dias;
		
		System.out.print("Qual a sua idade em dias ? ");
		dias = ler.nextInt();
		
		anos= (dias/365);
		meses= (dias%5365)/30;
		dias= (dias%365)%30;
	
		System.out.printf("Anos: "+anos+ "\nMeses: "+meses+ "\nDias: "+dias);

		

	}

}
