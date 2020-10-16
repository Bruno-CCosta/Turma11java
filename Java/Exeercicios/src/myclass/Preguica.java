package myclass;

public class Preguica extends Animal{

	private boolean subirArvores = false;
	
	public Preguica() 
	{
		
	}
	
	
	public Preguica(String nome, int idade, boolean subirArvores) {
		super(nome, idade);
		this.subirArvores = subirArvores;
	}




	public boolean isSubirArvores() {
		return subirArvores;
	}


	public void setSubirArvores(boolean subirArvores) {
		this.subirArvores = subirArvores;
	}


	public void emitirSom() {
System.out.println("ZzzzZzzz");		
	}

	public void subindoNaArvore() {
		setSubirArvores(true);
	}
	
	
	
}
