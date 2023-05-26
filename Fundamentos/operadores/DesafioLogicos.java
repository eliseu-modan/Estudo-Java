package Fundamentos.operadores;

import java.util.Scanner;

public class DesafioLogicos {

	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		//Trabalho na terça( v ou f)
		//verdadeiro compra a tv no shop de 32 e a familia vai pro shop comer sorvete
		//falso sem tv e a familia vai pro shop
		//Trabalho na quinta(v ou f)
		//verdadeiro compra a tv de 50 e a familia vai pro shop comer sorvete
		//falso sem tv e a familia vai pro shop
		//sem os dois trabalaho sem tv e sem sorvete e a familia fica saudavel
		
		System.out.println("Digite TRUE OR FALSE");
	   var  trabalho1 = entrada.nextBoolean();
	   var trabalho2 = entrada.nextBoolean();
	   if(trabalho1 && trabalho2) {
		   System.out.println("to buy  a TV of 32 and go at the mall to eat sorvete!!");
	   }else{
		   System.out.println("I'dont buy a TV 32,");
	   }
	   if(trabalho1 ^ trabalho2) {
		   System.out.println("to buy  a TV of 50 and go at the mall to eat sorvete !!");
	   }else{
		   System.out.println("I'dont buy a TV 50,");
	   }
	   
	   if(trabalho1 || trabalho2 == true) {
		   System.out.println("Lets go at the mall to eat sorvete");
	   }else
		   System.out.println("I'dont buy none TV and my family no go at the mall to eat sorvete ,"
		   		+ "lets to stay saudavel");
	   
	   
	}
}
