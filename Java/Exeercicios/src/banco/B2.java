package banco;

import java.util.Scanner;


public class B2 {

	public static String senha;
	public static int numero;
	public static char conta;

	
	public static void main(String[] args) {
		
Scanner leia = new Scanner(System.in);
		
		System.out.println("Bem vindo ao B2 o seu novo banco digital!!!");
		
		
		System.out.println();
		
		System.out.print("Digite o n�mero da sua conta: ");
		numero = leia.nextInt();
		System.out.print("Digite sua senha: ");
		senha = leia.next();
		System.out.println();
		System.out.print("Digite o tipo da sua conta \n1 - Conta Corrente  \n2 - Conta Poupan�a \n3 - Conta Empresa  \n4 - Conta Especial");
		conta = leia.next().charAt(0);
		
		System.out.println();
			
		if (conta == '1') {
			 System.out.println("Voc� acessou a Conta Corrente:");}
			 
		else if (conta == '2') {
				 System.out.println("Voc� acessou a Conta poupan�a:");
			 }
		else if (conta == '3') {
				 System.out.println("Voc� acessou a Conta Empresa:");
			 } 
		else if (conta == '4') {
				 System.out.println("Voc� acessou a Conta Especial:");
			 }
		
			  else {
				 System.out.println("Voc� n�o digitou corretamente , digite novamente!!!!");
				  } 
		 
		
		
		
		
		leia.close();
	}


}
	


