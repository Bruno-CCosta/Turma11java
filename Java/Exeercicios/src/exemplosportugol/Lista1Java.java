package exemplosportugol;

import java.util.Scanner;

public class Lista1Java {

	public static void main(String[] args) {
//1- Faça um programa que receba três inteiros e diga qual deles é o maior.
				Scanner ler = new Scanner(System.in);
				String txt;
				int x = 0 , y = 0 , z = 0;
				
				System.out.print("Qual o primeiro valor:");
				x = ler.nextInt();
				
				System.out.print("Qual o segundo valor:");
				y = ler.nextInt();
				
				
				System.out.print("Qual o terceiro valor:");
				z = ler.nextInt();

				txt = ((x>y)? ((x>z)?"O maior número é o primeiro , no valor de:"+ x : " O maior número é o terceiro , no valor de:"+ z) : ((y>z)?" O maior número é o segundo, no valor de:"+ y : " O maior número é o terceiro , no valor de:"+ z) );
				System.out.println(txt);


				
	
	
	
	
	
	
	}			

}
