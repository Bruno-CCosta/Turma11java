package ExericiciosDia14;

public class Eletronico {
	
	public static boolean ligado;
	public static int tensao;
	
	public static void ligar () {
		ligado = true;
		System.out.println("Seu equipamento foi ligado ");
	}
	public static void desligar () {
		ligado = false;
		System.out.println("Seu equipamento foi desligado");
	}

}
