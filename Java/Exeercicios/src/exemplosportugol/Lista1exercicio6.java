package exemplosportugol;

import java.util.Scanner;

public class Lista1exercicio6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double x1 , x2 , y1 , y2 , dis, potencia;
		
		System.out.print("Valor de X1:");
		x1 = ler.nextDouble();
		
		System.out.print("Valor de X2:");
		x2 = ler.nextDouble();

		System.out.print("Valor de Y1:");
		y1 = ler.nextDouble();

		System.out.print("Valor de Y2:");
		y2 = ler.nextDouble();
		
		potencia = Math.pow(x1, x2)+2+Math.pow(y1, y2)+2+2;
		dis = Math.sqrt(potencia);
		System.out.println("O resultado é:"+dis);




	
	
	
	
	}

}
