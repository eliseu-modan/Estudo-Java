package arrayseCollections;

public class ForEach {
  
	
	
	   public static void main(String[] args) {
		
		   double[] Notas = {1.0,5.6,8.4,6.9};
		   
		   double total = 0;
		   for(double notas  : Notas) {
			   total += notas;
		   }
		   System.out.println(total / Notas.length);
	}
}
