package Fundamentos.tiposPrimitivos;

public class TipoString {

	
	 public static void main(String[] args) {
		
		 
		// algumas funções de notação ponto é para transformar um dado 
		 //outras funções da notação ponto é para apresentar um valor 
		 
		System.out.println("Olá pessoal".charAt(2));
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.endsWith("dia"));
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.length());
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 1235.256;
		
		String dados = String.format("o senhor %s %s Tem %d e Ganha = %.2f "
				,nome ,sobrenome, idade , salario);
		
		System.out.println(dados);
		
		
		
		
		


}
}