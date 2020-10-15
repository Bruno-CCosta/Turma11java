package exercicios;

import myclass.Fornecedor;
import myclass.Pessoa;

public class Exercicio2 {

	public static void main(String[] args) {
		Fornecedor fornecedor1 = new Fornecedor ("Pernambucanas");
		Fornecedor fornecedor2 = new Fornecedor ("Ponto Frio","Rua 5", 08460.654);
		
		fornecedor2.setValorCredito(560.10);
		fornecedor2.setValorDivida(200.10);
		
		System.out.println("Saldo do "+fornecedor2.getNome()+" "+fornecedor2.obterSaldo());
		
		
	}

}
