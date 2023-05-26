package classe;

public class ProdutoTeste {

	
	 public static void main(String[] args) {
		
		 
		 //construtor passando parametros 
		 Produto p1 = new Produto("Notebook" , 4356.89);
		
		
		 
		 System.out.println(p1.nome);
		 System.out.println(p1.preco);
		


		 //construtor sem parametros implicito
		 var p2 = new Produto();
		 p2.nome = "Computador";
		 p2.preco = 12.56;
	
		 
		System.out.println(p2.nome);
		System.out.printf("Produto desconto %.2f ",Produto.desconto);
		 double precoFinal = p1.precoComDesconto();
		 double precoFinal2 = p2.precoComDesconto(0.1);

		 double mediaCarrinho = (precoFinal + precoFinal2) / 2;
		 System.out.printf("Média do Carrinho é R$:%.2f. : ",mediaCarrinho);
		 
		 
		 
	}
}
