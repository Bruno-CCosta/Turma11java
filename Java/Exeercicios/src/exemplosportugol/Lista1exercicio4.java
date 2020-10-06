package exemplosportugol;

import java.util.Scanner;

public class Lista1exercicio4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int a , b , c;
		double d , f , g;
		
		System.out.print("Qual o valor de A?  ");
		a = ler.nextInt();
		
		System.out.print("Qual o valor de B?  ");
		b = ler.nextInt();

		
		System.out.print("Qual o valor de C?  ");
		c = ler.nextInt();

		d = Math.pow(a, b+2);
		f = Math.pow(b, c+2);
		g = (d+f)/2;
		
		System.out.print("Resultado? "+ d);

		

		
		
	
	}

}
