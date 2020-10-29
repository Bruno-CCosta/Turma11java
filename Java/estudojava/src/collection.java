import java.util.HashSet;
import java.util.Set;

//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collection;

public class collection {

	public static void main(String[] args) {
		Set<videoAulaPessoa> conjunto = new HashSet<videoAulaPessoa>();
		videoAulaPessoa a = new videoAulaPessoa ("João" , "Java" , 6.9); 
		videoAulaPessoa b = new videoAulaPessoa ("José" , "Pyton" , 7.9); 
		videoAulaPessoa c = new videoAulaPessoa ("Jonas" , "HTML" , 8.9); 
		videoAulaPessoa d = new videoAulaPessoa ("Joaquim" , "Front " , 9.9); 
		conjunto.add(a);
		conjunto.add(b);
		conjunto.add(c);
		conjunto.add(d);
System.out.println(conjunto);
		
		
		
		/*Collection <String> nomes = new ArrayList();
		nomes.add("Brunno");
		nomes.add("Breno");
		nomes.add("Bruna");
		nomes.add("Bruno");
		nomes.add("Brunna");
		for (String name : nomes) {
			System.out.println("Lista de nomes: "+name);

		}
		
		
		//Collection <String> nomes2 = Arrays.asList("Primo", "Prima");
		//nomes.addAll(nomes2);
		//System.out.println("Lista de nomes: "+nomes);

		
		System.out.println("Tem o nome Brunna: "+nomes.contains("Brunna"));
		System.out.println("lista"+nomes);
		System.out.println("Lista de nomes: "+nomes);
		nomes.clear();
		System.out.println("l"+nom0es);*/
	}

}
