package utilidades;

import java.util.Scanner;

public class QuartoPrograma 
{

	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		

		
		String nome;
		double salario;
		int ano , idade =0;
		
		
		System.out.print("Qual é seu nome: ");
		nome = tec.next();
		
		
		System.out.print("Qual seu ano de nascimento: ");
		ano = tec.nextInt();
		
		System.out.print("Qual é seu salario: ");
		salario = tec.nextDouble();
		
		idade = (2020-ano);
		
		System.out.printf("Oi %s, sua idade é %d e seu salario atual é %.2f " , nome , idade , salario);
	}


}
