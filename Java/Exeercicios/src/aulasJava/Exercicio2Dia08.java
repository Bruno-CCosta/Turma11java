package aulasJava;

import java.util.Scanner;

public class Exercicio2Dia08 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num , numPar=0 ,numImpar=0;
		
		for (int x = 1; x <11;x++)
		{
			System.out.print("Digite o "+x+"º numero:");
		num = ler.nextInt();
		
		if (num % 2 == 0) {
		
			numPar++;
			}
		else if (num % 2 == 1){
			numImpar++;
		}
		}
		
	System.out.printf("Quantidade de numeros pares é:"+numPar);
	System.out.println("\n");
	System.out.printf("Quantidade de numeros impares é:"+numImpar);

	
	}
}


