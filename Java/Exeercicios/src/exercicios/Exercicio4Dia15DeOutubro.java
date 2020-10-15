package exercicios;

import myclass.Administrador;

public class Exercicio4Dia15DeOutubro {

	public static void main(String[] args) {
		Administrador admin = new Administrador("Bruno", "70707070" , 2500);
		admin.setTelefone("70707070");

		System.out.println("Nome: " + admin.getNome());
		System.out.println("Telefone: " + admin.getTelefone());
		System.out.printf("Ajuda de Custo: R$ %d", admin.getAjudaDeCusto());
	}

}
