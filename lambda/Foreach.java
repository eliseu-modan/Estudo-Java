package lambda;

import java.util.Arrays;
import java.util.List;

public class Foreach {

	
	 
	public static void main(String[] args) {
		
		
		List<String> Aprovados = Arrays
				.asList("gui" , "Juh" , "Ana" , "Isa");
		
		System.out.println("For Each Tradicional");
		
		for(String nome : Aprovados) {
			System.out.println(nome);
		}
			System.out.println("For Each Function Lambdas");
			
		Aprovados.forEach(nomes->System.out.println("Aprovados : "+ nomes));
		
		System.out.println("\n\nMethod References");
		
		Aprovados.forEach(System.out::println);
		
		Aprovados.forEach(nome -> imprimirNomes(nome));
		Aprovados.forEach(Foreach::imprimirNomes);
		
		
	}
	static void imprimirNomes(String nome) {
		System.out.println("oi meu nome é : " + nome);
	}
	
}
