package arrayseCollections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetIncludes {

	
	public static void main(String[] args) {
		
		
		//Set<String> lista = new HashSet<>();
		Set<String> lista = new TreeSet<>();

		lista.add("Teste");
		lista.add("Teste2");
		lista.add("Teste3");
		lista.add("Teste4");
		
		
		for(String candidato : lista) {
		    System.out.println(candidato);
		    
		    Set<Integer> lista2 = new TreeSet<>();

			lista2.add(1);
			lista2.add(2);
			lista2.add(3);
			lista2.add(4);
			
			
			for(Integer candidato2 : lista2) {
			    System.out.println(candidato2);
		}
	}

	}}
