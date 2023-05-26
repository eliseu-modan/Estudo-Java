package JavaPraticando;

public class Estoque {

	
	   int QtdeEstoque;
	   String VerificarEstoque;
	   
	   
	    Estoque(String VerificarEstoque){
	    	this.VerificarEstoque = VerificarEstoque;
	    }
	   
	   
	   public Estoque() {
			// TODO Auto-generated constructor stub
		}


	int LotaçãoEstoque() {
		   if(this.QtdeEstoque >= 100) {
			   System.out.println("Estoque Lotado");
			   this.QtdeEstoque = 100;
		   }
		   else{
			   int completarEstoque = 100 - QtdeEstoque;
			   System.out.println("Espaço disponivel : " + completarEstoque );
			   
		   }
		   return this.QtdeEstoque;
	   }
	   
}
