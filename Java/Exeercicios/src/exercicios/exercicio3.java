package exercicios;

import myclass.Empregado;

public class exercicio3 {

	public static void main(String[] args) {

		Empregado fun1 =  new Empregado ("Bruno", "Bruno", 5 , 1250 , 5000);
		
		System.out.println("Nome: "+fun1.getNome());
		System.out.println("Qual seu setor na empresa: "+fun1.getCodigoSetor());
		System.out.printf("\nPercentagem de impostos: R$ %.2f%%", fun1.getSalarioBase());
		System.out.printf("\nSalário Base: R$ %.2f", fun1.getImposto());
		System.out.printf("\nSalário Final: R$ %.2f", fun1.calcularSalario());



		
				
		
	}

}
