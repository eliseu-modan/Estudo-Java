package lambda;

public class CalculoTeste {

	
	public static void main(String[] args) {
		
		
		calculo calcular = new Soma();
		calculo multiplicar = new Multiplicar();
		
		System.out.println(calcular.executar(2, 3));
		
		calcular = new Multiplicar();
		
		System.out.println(calcular.executar(2, 3));
	}
}
