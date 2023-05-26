package classe.Desafio;

public class Jantar {

	
	
	public static void main(String[] args) {
		
		
		comida C1 = new comida("Arroz", 0.2333);
		comida C2 = new comida("Feijao", 5.85888);
		
		Pessoa p = new Pessoa("Joao",89.8);
		
		System.out.println(p.apresentar());
		
		p.comer(C1);
		
		System.out.println(p.apresentar());
		
		p.comer(C2);
	
		System.out.println(p.apresentar());
		

	}
}
