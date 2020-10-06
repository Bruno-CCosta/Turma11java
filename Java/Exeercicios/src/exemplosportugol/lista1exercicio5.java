package exemplosportugol;

import java.util.Scanner;

public class lista1exercicio5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double  nota1 =0 , nota2=0 , nota3=0  , media=0;
		
		System.out.print(" Qual é sua primeira nota: ");
		nota1 = ler.nextDouble();
		
		System.out.print(" Qual é sua segunda nota: ");
		nota2 = ler.nextDouble();
		
		System.out.print(" Qual é sua terceira nota: ");
		nota3 = ler.nextDouble();
		
		media = nota1*2+nota2*3+nota3*5;
		
		System.out.print(" Sua media final é: "+media);



		
		
	}

}
