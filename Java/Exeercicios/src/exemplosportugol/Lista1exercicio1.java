package exemplosportugol;

import java.util.Scanner;

public class Lista1exercicio1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int anos;
		int meses;
		int dias;
		int res ;
		
		System.out.print("Qual a sua idade ? ");
		anos = ler.nextInt();
		
				System.out.print("Quantos meses ? ");
				meses = ler.nextInt();
				
				System.out.print("Quantos dias ? ");
				dias = ler.nextInt();
				
				res= (anos*350)+(meses+30+dias);
				System.out.printf("Sua idade em dias é: "+res);


			

}
}