package JavaPraticando;

public class CadastroProdutos {

	
	    String nomeProduto;
	    int ValorProduto;
	    double impostoProduto;
	    String descriçaoProduto;



  String ProdutoCalculado() {
	  ValorProduto = this.ValorProduto;
	  impostoProduto = this.impostoProduto;
	
	  double valor = 0;
         valor =  impostoProduto * ValorProduto / 100;
            double ValorComImposto = valor + ValorProduto ;
            String imposto = String.valueOf(ValorComImposto);
            return imposto;  
}

     
}