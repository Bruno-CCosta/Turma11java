package myclass;

public class Produto {

	private String nome;
	private int codigo;
	private double preco;
	private int estoque;
	
	
	
	
	public Produto() 
	{
		super();
	}


	public Produto(String nome, int codigo, double preco, int qtd) 
	{
		this.nome = nome;
		this.codigo = codigo;
		this.preco = preco;
		this.estoque = qtd;
	}

	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}



	public int getEstoque() {
		return estoque;
	}


	public void setEstoque(int qtd) {
		this.estoque = estoque;
	}


	public String toString() {
		return "Produto " + nome + ", \nCodigo=" + codigo + ", \nPreco=" + preco + ", \nEstoque=" + estoque
				;
	}
	
	
	
	
	
}