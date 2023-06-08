package lambda;

public class lambdaTeste2 {

	
	
	public static void main(String[] args) {
		
		
		calculo calcularSoma = ( x, y) -> { return x + y; };
		
	           	System.out.println(calcularSoma.executar(2, 3));
		
		calcularSoma = (x , y) -> x * y;
		
		         System.out.println(calcularSoma.executar(2, 3));
		
	}
}
