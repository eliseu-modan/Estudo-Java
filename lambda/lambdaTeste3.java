package lambda;

import java.util.function.BinaryOperator;

public class lambdaTeste3 {

	
	
	 public static void main(String[] args) {
		
		 BinaryOperator<Double> calc = (x , y ) ->{return x + y; };
		 System.out.println(calc.apply(2.0, 2.3));
		 
		 calc = ( x , y) -> {return x * y; };
		 System.out.println(calc.apply(2.3,	2.3));
		 
		 
	}
}
