package aulasJava;

import java.util.Scanner;

public class ExemploInversãoDeValores {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int a=0, b=0;
		System.out.print("LEIA A: ");
		a = leia.nextInt();
		System.out.print("LEIA B: ");
		b = leia.nextInt();
		System.out.printf("\nVALORES ANTES DA INVERSÃO\n A: %d B:%d", a,b);
		a ^= b;
	    b ^= a;
	    a ^= b;

		System.out.printf("\nVALORES APÓS A INVERSÃO\n A: %d B:%d", a,b);
		
		

	}

}
