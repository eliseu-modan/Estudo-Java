package arrayseCollections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	
	
	   public static void main(String[] args) {
		
		   
		   Queue<String> fila = new LinkedList<>();
		   
		  /* .add() lançará uma exceção caso a fila esteja cheia.

		   .offer() retorna falso caso a fila esteja cheia */
	
	   fila.add("Ana");
	   fila.offer("Bia");
	   fila.offer("Aline");
	   fila.offer("Gabriel");
	   fila.offer("lucas");
	   fila.offer("matheus");
	   
	   //fila.size()
       //fila.clear()
	  //fila.empty()
	   //fila.contains()
	   System.out.println(fila.peek());
	   System.out.println(fila.element());

	   System.out.println(fila.poll());
	   System.out.println(fila.remove("Bia"));
	   System.out.println(fila);
	   
	   }
}
