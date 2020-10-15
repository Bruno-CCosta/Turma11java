package myclass;

public class Fornecedor extends Pessoa {
	
	
	private double valorCredito;
	private double valorDivida;
	
	public Fornecedor(String nome, String telefone, double valorCredito) {
		super(nome, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
	
	public Fornecedor(String nome) {
	}

	public double obterSaldo() {
		return valorCredito - valorDivida;
		
	}

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
} 
