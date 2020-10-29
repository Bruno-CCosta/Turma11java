package banco;

public class contaBancaria {

	//ATRIBUTOS
	private String numConta;
	private double saldo;
	
	
	//CONSTRUTOR
	public contaBancaria(String numConta, double saldo) {
		this.numConta = numConta;
		this.saldo = saldo;
	}
	//ENCAPSULAMENTO

	public String getNumConta() {
		return numConta;
	}
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void extrato () {
		double extrato = saldo;
	}
	
	public void seuSaldo( ) {
		System.out.println("Seu saldo: ");
	}
	
	public double credite (double credito) {
		saldo = saldo + credito;
		return this.saldo;
	}
	
	public double debite (double debito) {
		saldo = saldo - debito;
		return this.saldo;
	}
		
	
	}


