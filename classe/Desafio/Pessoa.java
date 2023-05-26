package classe.Desafio;

public class Pessoa {

	
	   String nome;
	   double peso;
	   
	   Pessoa(String nome, double peso){
		   this.nome= nome;
		   this.peso = peso;
	   }
	   
	   void comer(comida comida) {
		   if(comida!= null) {
			   this.peso += comida.peso;
		   }
	   }
	   
	   String apresentar() {
		   return "Ola eu sou o joao" + nome + "e tenho " + peso + "kgs";
	   }
}
