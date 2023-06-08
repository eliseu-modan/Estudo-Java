package OrientaçãoObjeto.HerançaDesafio;

public class MainCarro {

	
	
	public static void main(String[] args) {
		
		
		Carro Carro1 = new Carro();
		
		Carro1.Acelerar();
		System.out.println("Acelereou " + Carro1.velocidadeAtual);
		Carro1.Acelerar();
		System.out.println("Acelerou " + Carro1.velocidadeAtual);
		Carro1.Acelerar();
		System.out.println("Acelerou " + Carro1.velocidadeAtual);

		Carro1.freiar();
		System.out.println("Freiou " + Carro1.velocidadeAtual);

		Carro1.freiar();
		System.out.println("Freiou " + Carro1.velocidadeAtual);
		Carro1.freiar();
		System.out.println("Freiou " +Carro1.velocidadeAtual);
		Carro1.freiar();
		System.out.println("Freiou " +Carro1.velocidadeAtual);
		
		Carro1.Acelerar();
		System.out.println("Fusca Acelerou " + Carro1.velocidadeAtual);
		Carro1.Acelerar();
		System.out.println("Fusca Acelerou " + Carro1.velocidadeAtual);
		Carro1.Acelerar();
		System.out.println("Fusca Acelerou " +Carro1.velocidadeAtual);
		
		
	    Ferrari Ferrari1 = new Ferrari();
		
		Ferrari1.Acelerar();
		System.out.println("Ferrari Acelerou : " + Ferrari1.velocidadeAtual);
		Ferrari1.Acelerar();
		System.out.println("Ferrari Acelerou : "+ Ferrari1.velocidadeAtual);

		Ferrari1.Acelerar();
		System.out.println("Ferrari Acelerou :" + Ferrari1.velocidadeAtual);
		
		Ferrari1.freiar();
		System.out.println("Ferrari freiou " + Ferrari1.velocidadeAtual);
		
		
		Fusca Fusca1 = new Fusca();
		
		Fusca1.Acelerar();
		
		System.out.println("Fusca acelerou :" + Fusca1.velocidadeAtual);
		Fusca1.Acelerar();

		System.out.println("Fusca acelerou :" + Fusca1.velocidadeAtual);

		Fusca1.freiar();
		System.out.println("Fusca freiou : " + Fusca1.velocidadeAtual);
		
		Fusca1.freiar();
		System.out.println("Fusca freiou : " + Fusca1.velocidadeAtual);
		Fusca1.freiar();
		System.out.println("Fusca freiou : " + Fusca1.velocidadeAtual);
	
		Fusca1.Acelerar();
		System.out.println("Fusca acelerou :" + Fusca1.velocidadeAtual);
		

	
	}
}
