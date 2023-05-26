package classe;

public class Produto {

	
	 String nome;
	 double preco;
	 static double desconto = 0.25;
	 
	 Produto(String nomeInicial, double precoInicial){
		 nome = nomeInicial;
		 preco = precoInicial;
		
	 }
	 Produto(){
		 
	 }
	 
	 double precoComDesconto(double descontoGerente) {
		 
		 double valorDesconto = preco * (1- desconto + descontoGerente) ;
		 return valorDesconto;
	 }
     double precoComDesconto() {
		 
		 double valorDesconto = preco * (1- desconto ) ;
		 return valorDesconto;
	 }

}
