package OrientaçãoObjeto.Composição.DesafioComposicao;

import java.util.ArrayList;

public class Compra {

	
	final ArrayList<Item> itens = new ArrayList<>();
	
	Compra(){
		
	}
     
	 void adicionarItem(Produto p, int qtde) {
		
		 this.itens.add(new Item(p, qtde));
		 
	 }
	 void adicionarItem(String nome,double preço,int qtde) {
		 var produto = new Produto(nome, preço);
		 this.itens.add(new Item(produto,qtde));
	 }
	 
	 double obterVrTotal() {
		 double total =0;
		 
		 for(Item item: itens) {
			 total += item.quantidade * item.produto.preco;
		 }
		 
		 return total;
				 
				 
		
	 }

	 

}
