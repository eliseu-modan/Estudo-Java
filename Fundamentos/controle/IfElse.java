package Fundamentos.controle;

import javax.swing.JOptionPane;

public class IfElse {

	
	       public static void main(String[] args) {
			
	    	   String valor =JOptionPane.showInputDialog(
	    			   "Informe o número");
	    	   int numero = Integer.parseInt(valor);
	    	   
	    	   if(numero % 2 == 0 ) {
	    		   System.out.println("Numero Par!");
	    	   }
	    	   if(numero % 2 == 1) {
	    		   
	    		   System.out.println("Numeor Impar");
	    	   }
	    	   if(numero % 2 == 0 ) {
	    		   System.out.println("Numero Par!");
	    	   }else {
	    		   System.out.println("Numeor Impar");

	    	   }
		}
}
