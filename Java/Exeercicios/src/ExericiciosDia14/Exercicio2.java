package ExericiciosDia14;

public class Exercicio2 {

	public static void main(String[] args) {
		Aviao nave = new Aviao ();
		
		nave.nome = "Boeing 777";
		nave.numAsas = 2;
		nave.velocidade = 900;
		
		System.out.println("Nome da aeronave: "+nave.nome);
		System.out.println("Quantidade de asas: "+nave.numAsas);
		System.out.println("Velocidade atual da aeronave �: "+nave.velocidade);
		
		nave.irParaFrente();
		System.out.println("A Aeronave est� "+nave.estado);
		
		nave.VirarDireita();
		System.out.println("A aeronave est� "+nave.estado);
		
		nave.Subir();
		System.out.println("A aeronave est� "+nave.estado);
		
		nave.VirarEsquerda();
		System.out.println("A aeronave est� "+nave.estado);
		
		nave.Descer();
		System.out.println("A aeronave est� "+nave.estado);
	}

}
