package ExericiciosDia14;
import java.util.Scanner;

import classeAula.Alunos;
import classeAula.Proffesores;
public class Exercicio1 {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		Cliente c1 = new Cliente ("Bruno", 425555715, 494931569);
		System.out.print("Qual seu nome: \n");
		c1.nome = leia.next();
		System.out.print("Qual seu rg: \n");
		c1.rg = leia.nextInt();
		System.out.print("Qual seu cpf: \n");
		c1.cpf = leia.nextInt();
		System.out.println(c1.getCli1());
 
		
	}

}
