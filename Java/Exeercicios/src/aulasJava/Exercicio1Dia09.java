package aulasJava;

import java.util.Scanner;

public class Exercicio1Dia09 {

	public static void main(String[] args) {

Scanner ler = new Scanner(System.in);

		
		final int LIMITE = 6;
		int[] Y = new int [LIMITE];
		int totalPosicoes = 0;
		
		for(int x=0; x < LIMITE;x++) {
			System.out.print("Informe os números para o vetor (1, 0, 5, -2, -5, 7): ");
			Y[x] = ler.nextInt();
			
			
	
		}
		totalPosicoes = (Y[0]+Y[1]+Y[5]);
		System.out.printf("A soma das posições Y[0], Y[1] e Y[5] é: %d \n", totalPosicoes);
		
		System.out.print("Altere o vetor da posição 4 para o valor 100: ");
		Y[4] = ler.nextInt();
		
		for(int x=0; x < LIMITE;x++) {
			System.out.printf("\n%d posição do Vetor Y: %d ", x,Y[x]);
			
		}
		
		
		
	}

}