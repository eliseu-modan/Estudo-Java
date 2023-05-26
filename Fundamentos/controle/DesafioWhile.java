package Fundamentos.controle;

import java.util.Scanner;

public class DesafioWhile {

	
	  public static void main(String[] args) {
		
		  Scanner entrada = new Scanner(System.in);
            
	String sair = "";
		  double media = 0;
		  double cont = 0;
		  
		   do {
		  System.out.println("\nDigite a Nota  do Aluno");
		  double NotaDoAluno = entrada.nextDouble();
		  if(NotaDoAluno < 10 && NotaDoAluno > 0 ) {
			  
		 
			 media = NotaDoAluno + media;
			 double armazena = media ;
			 System.out.printf("\n soma das notas %.2f ",armazena);
			 
			 cont = cont+1;
			 System.out.printf("\n Notas Validas : %.2f",cont);
			 
			 System.out.printf("\nMédia das Notas %.2f ", armazena / 2);
			  
		  }
		  else {
			  System.out.println("Nota Invalida");
		  }
		   }
		    while(!sair.equals("sair"));
		  
		  
		  
	
		   entrada.close();
		   
	  }
}
