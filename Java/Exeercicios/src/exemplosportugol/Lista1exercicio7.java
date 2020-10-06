package exemplosportugol;

import java.util.Scanner;

public class Lista1exercicio7 
{

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		int a , b , c , d , e , f;
		double x=0 , y=0;
		
		System.out.print(" informe o Valor de A : ");
		a = ler.nextInt();
		
		System.out.print(" informe o Valor de B : ");
		b = ler.nextInt();
		
		System.out.print(" informe o Valor de C : ");
		c = ler.nextInt();
		
		System.out.print(" informe o Valor de D : ");
		d = ler.nextInt();
		
		System.out.print(" informe o Valor de E : ");
		e = ler.nextInt();

	
		System.out.print(" informe o Valor de F : ");
		f = ler.nextInt();
		
		x = (((c*e)-(b*f))/((a* e)-(b*d)));
		y =  ( ( (a*f) - (c*d) ) / ( (a* e) - (b*d) ) );
		
		System.out.printf("O valor de X é:%.2f\n", x);
		System.out.printf("O valor de Y é:%.2f\n", y);
		
		
	}

}
