package exercicios;

import java.util.ArrayList;
import java.util.List;

import myclass.Produto;

public class Exercicio3Dia16DeOutubro extends Produto {

	

	public static void main(String[] args) {
		

		
			int index;
			List <Produto> lista = new ArrayList<>();

				
				
				Produto produto1 = new Produto("Playstation 5 ", 0, 4999.99, 10);
				Produto produto2 = new Produto("SmartTV", 1, 2500.00, 10);
				Produto produto3 = new Produto("Smartphone",2, 2000.99, 10);
				Produto produto4 = new Produto("Xbox", 3, 3800.99, 10);
				Produto produto5 = new Produto("Tablet", 4, 1500.99, 10);
				
				
				lista.add(produto1);
				lista.add(produto2);
				lista.add(produto3);
				lista.add(produto4);
				lista.add(produto5);
				
				System.out.println("Estoque atual");
				for (Produto produto : lista) 
				{
					System.out.println(produto.toString());
					System.out.println("\n");
				}
				
				lista.remove(produto4);
				lista.remove(produto2);
				System.out.println("Estoque no momento");
				for (Produto produto : lista) 
				{
					System.out.println(produto.toString());
					System.out.println("\n");
					
	}

	}}
