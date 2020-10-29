package banco;

public class contaCorrente extends contaBancaria{
	
	//ATRIBUTO
	private int  talonario = 0;
	
	//CONSTRUTOR
	
	public contaCorrente(String numConta, double saldo, int talonario) {
		super(numConta, saldo);
		this.talonario = talonario;
	}



	//MÉTODO
	public int emiteTalonario() {
		talonario = talonario++;
		return talonario;
	}

}