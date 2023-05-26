package Fundamentos.tiposPrimitivos;

public class Temperatura {

	public static void main(String[] args) {
		final double FATOR = 5 / 9.0;
		final double AJUSTE = 32;
	  final  double fahrenheit = 86;
	    double celsius = (fahrenheit - AJUSTE) * FATOR;
	    
	    System.out.println("O resultado é " + celsius + "°C.");
	}
}
