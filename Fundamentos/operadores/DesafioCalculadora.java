package Fundamentos.operadores;

import java.util.Scanner;

public class DesafioCalculadora {

	  
	 public static void main(String[] args) {
		
		 Scanner entrada = new Scanner(System.in);

		 System.out.println("Digite o Primeiro Numero");
		 String Valor1 = entrada.nextLine().replace(",",".");
		
		 
		 System.out.println("Digite o Segundo Numero");
		 String Valor2 = entrada.nextLine().replace(",", ".");
		 
		 double Valor1D =  Double.parseDouble(Valor1);
		 double Valor2D =  Double.parseDouble(Valor2);
		 
		 System.out.println("Digite a operação + - * /");
		 String Simbolo = entrada.nextLine();	
		 
		 
		 
  double resultado = Simbolo.equals("+") ? Valor1D + Valor2D : 0 ;
         resultado = Simbolo.equals("-") ? Valor1D - Valor2D : resultado ;
		 resultado = Simbolo.equals("/") ? Valor1D / Valor2D : resultado ;
	     resultado = Simbolo.equals("*") ? Valor1D * Valor2D : resultado ;
	
		System.out.printf(" %.2f %s %.2f = %.2f ",Valor1D, Simbolo , Valor2D ,resultado);
		 
		 entrada.close();
		
		 
		 
		 
	}
}
