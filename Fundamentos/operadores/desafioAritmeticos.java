package Fundamentos.operadores;

public class desafioAritmeticos {

	 public static void main(String[] args) {
		
//		 int a = 3 * 4 - 10;
//		 double b = Math.pow(a ,3);
//		 
//		 System.out.println(b);
		 
		var a = 6*(3+2);
		var b =Math.pow(a, 2);
		var c = b / 6 ;
		System.out.println("Expressão A " + c);
	
		
	   
		var d = 4 * 5 / 2;
	    var e = Math.pow(d, 2);
	    System.out.println("Expressão B " + e);
	    
	    
	    var divisao1 = c - e;
	    var resultado1 = Math.pow(divisao1, 3);
	    System.out.println(resultado1);
	    
	    var divisao2 = Math.pow(10, 3);
	    System.out.println(divisao2);
	    
	    var resultadoFinal = resultado1 / divisao2;
	    System.out.println("Resultado final " + resultadoFinal);
	    
	    
	    
	
	
		
	} 
}
