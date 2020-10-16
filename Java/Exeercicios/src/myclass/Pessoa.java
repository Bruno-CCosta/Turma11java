package myclass;

public class Pessoa {

	//ATRIBUTOS
	private String nome;
	private String endereco;
	private String telefone;
	
	
	//CONSTRUTORES
	public Pessoa () {
		
	}
	
public Pessoa (String nome) {
		
	}
	
	//SOBRECARGA DO CONTRUTOR
public Pessoa (String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}
	//SOBRECARGA DO CONTRUTOR
	public Pessoa (String nome, String endereco, String telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	//ENCAPSULAR
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String string) {
		
		
	}
	
	
}
