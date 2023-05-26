package arrayseCollections;

import java.util.ArrayList;

public class List {

	
	
	
	
	public static void main(String[] args) {
		
		
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1  = new Usuario("Ana");
		lista.add(u1);
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Guilherme"));
		lista.add(new Usuario("Matheus"));
		lista.add(new Usuario("Gustavo"));
		lista.add(new Usuario("Lucas"));
		lista.add(new Usuario("Carlos"));
		
		lista.remove(1);
		
		System.out.println("identificar usuario na lista :"+ lista.get(3).nome);
		System.out.println(lista.remove(new Usuario("Lucas")));

		for(Usuario listUsers : lista ) {
			System.out.println(listUsers.toString());
		}
		
	}
}
