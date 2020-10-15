package exercicios;

import myclass.Operario;

public class Exercicio5Dia15DeOutubro {

	public static void main(String[] args) {
Operario op = new Operario("José", "975965648", 1500.00, 15);
		
		System.out.println("DADOS DO OPERÁRIO");
		System.out.println("Nome: " + op.getNome());
		System.out.println("Telefone: " + op.getTelefone());
		System.out.printf("Valor de Produção: R$ %.2f", op.getValorProducao());
		System.out.println();
		System.out.printf("Comissão: %.2f%%", op.getComissao());
		System.out.println();
		System.out.printf("Vencimento Base: R$ %.2f", op.calcularVencimentoBase());
	}

	}


