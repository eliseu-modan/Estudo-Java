package Fundamentos.controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	
	   public static void main(String[] args) {
		
		   
		   
		   Scanner entrada = new Scanner(System.in);
		   
		   System.out.println("Digite um dia da semana");
		   String dia = entrada.nextLine();
		   
		   if(dia.equalsIgnoreCase("segunda")) {
			   System.out.println("Valor 1");
		   }else if(dia.equalsIgnoreCase("terça")
				   || dia.equalsIgnoreCase("terca")){
			   System.out.println("valor 2");
		   }else if(dia.equalsIgnoreCase("quarta")) {
			   System.out.println("valor3");
		   }
		   else if(dia.equalsIgnoreCase("quinta")) {
			   System.out.println("valor4");
		   }else if(dia.equalsIgnoreCase("sexta")) {
			   System.out.println("valor 5");
		   }else if (dia.equalsIgnoreCase("sabado")) {
			   System.out.println("valor 6");
		   }else if(dia.equalsIgnoreCase("domingo")) {
			   System.out.println("valor 7");
		   }
		   
		   entrada.close();
	}
}
