package Fundamentos.operadores;

public class Ternario {

	  public static void main(String[] args) {
		
		  double media = 4;
		  String resultadoRepuracao = media >= 5.0 ? "em recuperação." : "Reprovado.";
		  String resultado = media >= 7.0 ? "aprovado." : resultadoRepuracao;
		  
		  System.out.println("O aluno está " + resultado);
	}
}
