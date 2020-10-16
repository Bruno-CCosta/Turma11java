package exercicios;

import myclass.Animal;
import myclass.Cachorro;
import myclass.Cavalo;
import myclass.Preguica;

public class Exercicio1Dia16DeOutubro {

	public static void main(String[] args) {

		Animal cachorro = new Cachorro();
		cachorro.setNome("Scooby");
		cachorro.setIdade(5);
		System.out.println(cachorro.getNome());
		cachorro.emitirSom();
		
		System.out.println();
		
		
		Animal cavalo = new Cavalo();
		cavalo.setNome("Horse");
		cavalo.setIdade(5);
		System.out.println(cavalo.getNome());
		cavalo.emitirSom();
		
		System.out.println();
		
		Animal preguica = new Preguica();
		preguica.setNome("Pregui�a");
		preguica.setIdade(5);
		System.out.println(preguica.getNome());
		preguica.emitirSom();
		
		
		
		//Para eu utilizar um m�todo que s� tem na classe pregui�a n�o posso instanciar como animal
		Preguica preguica1 = new Preguica();
		preguica1.setNome("Preguicinha espec�fica");
		preguica1.setIdade(25);
		preguica1.emitirSom();
		preguica1.subindoNaArvore();
		
		
		
	}
	}