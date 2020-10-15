package ExericiciosDia14;

public class Cliente {
	public String nome;
	public int cpf;
	public int rg;
 
 public Cliente (String nome, int cpf , int rg) {
	 this.nome = nome;
	 this.cpf = cpf;
	 this.rg = rg;
	 
 }
 public String getCli1()  {
	 
	 String Cli1 = nome+"  " +cpf+ "  "+rg;
	 return Cli1;
 }
		
 
}
