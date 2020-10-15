package ExericiciosDia14;

public class Exercicio3 {

	public static void main(String[] args) {
		Eletronico eletron = new Eletronico();
		
	eletron.tensao = 127;
	
	eletron.ligar();

	System.out.println("Seu equipamento funciona em: "+eletron.tensao+ " Volts");
	
	
	eletron.desligar();
	}

}
