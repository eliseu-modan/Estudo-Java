package OrientaçãoObjeto.Composição;

public class Item {

	
	String nome;
	int quantidade;
	double preco;
	public Compra compra;
	
	Item(){
		
	}
	Item(String nome, int quantidade, double preco) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}


}
