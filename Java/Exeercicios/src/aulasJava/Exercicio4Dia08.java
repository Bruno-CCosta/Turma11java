package aulasJava;

import java.util.Scanner;

public class Exercicio4Dia08 {

	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int idade;
		final int LIMITE = 150; //LIMITE É 150
		byte sexo; // (1-feminino / 2-masculino / 3-Outros)
		byte perfilPsi;//(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva)
		int pessoasCalma=0 ,  mulheresNervosas=0 , homensAgressivos=0 , outrosCalmos=0 , nervosasComMaisDe40=0 , calmasComMenosDe18=0;
		int contador = 1;
		int totalF, totalM, totalO;
		while (contador <= LIMITE) 
		{
			System.out.print("Qual a sua idade:");
			idade = ler.nextInt();
			
			System.out.println("Digite 1-Feminino / 2-Masculino / 3-Outros");
			sexo = ler.nextByte();
			
			System.out.println("Você se considera uma pessoa: 1-Calma / 2-Nervosa / 3-Agressiva");
			perfilPsi = ler.nextByte();
			
			if (perfilPsi ==1) {
			pessoasCalma=pessoasCalma+1;}
			
			if (perfilPsi ==2 && sexo==1) {
				mulheresNervosas = mulheresNervosas+1;}
			
			if (perfilPsi ==3 && sexo==2) {
				homensAgressivos = homensAgressivos+1;}
			
			if (perfilPsi ==1 && sexo==3) {
				outrosCalmos = outrosCalmos+1;}
			
			if (perfilPsi==2 && idade>40) {
				nervosasComMaisDe40 =nervosasComMaisDe40+1;}
			
			if (perfilPsi==1 && idade<18) {
				calmasComMenosDe18 = calmasComMenosDe18+1;}
			
			
			contador++;
			
		}
		System.out.printf("\nNúmero de pessoas calmas: %d", pessoasCalma);
		System.out.printf("\nNúmero de mulheres nervosas: %d", mulheresNervosas);
		System.out.printf("\nNúmero de homens agressivos: %d", homensAgressivos);
		System.out.printf("\nNúmero de outros calmos: %d", outrosCalmos);
		System.out.printf("\nNúmero de pessoas acima de 40 anos nervosas: %d", nervosasComMaisDe40);
		System.out.printf("\nNúmero de pessoas abaixo dos 18 anos calmas: %d", calmasComMenosDe18);
	
	}


}
