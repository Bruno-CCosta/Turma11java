package myclass;

public class Cachorro extends Animal {
	
	private String raca;

	public Cachorro() {

	}

	public Cachorro(String nome, int idade, String raca) {
		super(nome, idade);
		this.raca = raca;
	}

	public String getnome() {
	return  super.getNome();
	}
	
	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	@Override
	public void emitirSom() {
System.out.println("AU, AU , AU, AUUUUUUUUU");		
	}

	
	
	
	

}
