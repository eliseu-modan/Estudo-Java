package OrientaçãoObjeto.Composição.DesafioComposicao;

public class Sistema {

	
	public static void main(String[] args) {
		
		
        Compra compra1 = new Compra();
           	compra1.adicionarItem("fdewfdwe",1,100);
           	compra1.adicionarItem(new Produto("Notebook ", 2000), 2);
           	
           	Compra compra2 = new Compra();
           	compra2.adicionarItem("fdewfdwe",2,100);
           	compra2.adicionarItem(new Produto("Notebook ", 1000), 1);
           	
           	Cliente cliente = new Cliente("Maria Julia");
           	
           	cliente.compras.add(compra1);
           	cliente.compras.add(compra2);
		
           	System.out.println(cliente.obterValorTotal());
	}
}
