package banco;

public class contaCorrente extends contaBancaria{
	
	//ATRIBUTO
	private int  talonario = 0;
	
	//CONSTRUTOR
	
	public contaCorrente(String numConta, double saldo, int talonario) {
		super(numConta, saldo);
		this.talonario = talonario;
	}



	//M�TODO
	public int emiteTalonario() {
		talonario = talonario++;
		return talonario;
	}

}