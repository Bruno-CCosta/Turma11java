package aulasJava;

import java.util.Scanner;

public class Exercicio3Dia09 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		
		final int LIMITE = 3;
		int[][] NumerosMatriz = new int [LIMITE][LIMITE];
		int x = 0, y = 0, maior10=0;
		
		for(x=0; x < LIMITE; x++) {
			for(y=0; y < LIMITE; y++) {
			System.out.printf("Linha %d Coluna %d - Informe um valor: ", x,y);
			NumerosMatriz[x][y] = ler.nextInt();
			}
		}
		
		for(x=0; x < LIMITE; x++) {
			for(y=0; y < LIMITE; y++) {
				System.out.printf("\nLinha %d Coluna %d - Valor: %d ", x,y,NumerosMatriz[x][y]);
				if(NumerosMatriz[x][y] > 10) {
					maior10++;
					
				}
			}
		}
		
		System.out.printf("\n\nQuantidade de valores maiores que 10: %d ", maior10);
	}

}
