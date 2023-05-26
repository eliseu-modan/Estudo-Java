package arrayseCollections;

import java.util.HashSet;
import java.util.Set;

public class messySet {

	  
	  @SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		  
		  @SuppressWarnings("rawtypes")
		HashSet conjunto = new HashSet();
		  
		  conjunto.add(1.2);
		  conjunto.add(true);
		  conjunto.add("Teste");
		  conjunto.add(1);
		  conjunto.add('x');
		  
		  
		  conjunto.add("Teste");
		  System.out.println("Tamanho é "+conjunto.size());

		  System.out.println(conjunto.remove("Teste"));
		  System.out.println("Tamanho é "+conjunto.size());
		  System.out.println(conjunto.contains(1.2));
		  
		  Set nums = new HashSet();
		  nums.add(1);
		  nums.add(3);
		  nums.add("Ola");
		  
		  System.out.println(nums);
		  System.out.println(conjunto);
		  
		  conjunto.addAll(nums);
		  
		  System.out.println(conjunto);
		  
		  conjunto.clear();
		  System.out.println(conjunto);
	}
}
