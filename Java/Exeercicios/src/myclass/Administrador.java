package myclass;

public class Administrador extends Pessoa {
	private int ajudaDeCusto ;

	public Administrador(String nome, String telefone, int ajudaDeCusto) {
		super(nome, telefone);
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public int getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(int ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	
	
}
