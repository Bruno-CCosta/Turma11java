package exemplosportugol;

import java.util.Scanner;

public class Lista1exercicio3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int tempoFesta =0;
				int segundos =0;
				int minutos =0;
				int horas =0;
				
				System.out.print("O evento durou quantos segundo? ");
				tempoFesta = ler.nextInt();
				
				horas = tempoFesta/3600;
				minutos = (tempoFesta%3600)/60;
				segundos = (tempoFesta%3600)%60;
						
				System.out.println("Total de horas "+horas);
				System.out.println("Total de minutos "+minutos);
				System.out.println("Total de segundos "+segundos);

				
				

				
				

	}

}
