package exercicios;

import myclass.Operario;

public class Exercicio5Dia15DeOutubro {

	public static void main(String[] args) {
Operario op = new Operario("Jos�", "975965648", 1500.00, 15);
		
		System.out.println("DADOS DO OPER�RIO");
		System.out.println("Nome: " + op.getNome());
		System.out.println("Telefone: " + op.getTelefone());
		System.out.printf("Valor de Produ��o: R$ %.2f", op.getValorProducao());
		System.out.println();
		System.out.printf("Comiss�o: %.2f%%", op.getComissao());
		System.out.println();
		System.out.printf("Vencimento Base: R$ %.2f", op.calcularVencimentoBase());
	}

	}


