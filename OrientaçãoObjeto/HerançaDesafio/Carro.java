package OrientaçãoObjeto.HerançaDesafio;

public class Carro {

	
	int velocidadeAtual;
	int acelerar = 0;
	int freiar;
	
	
	int Acelerar() {
    acelerar = acelerar + 5;
    velocidadeAtual =acelerar;
    
	 if(velocidadeAtual < 0 ) {
		 velocidadeAtual = 0;
	 }
		
	return velocidadeAtual;
	}


   
	int freiar() {
    velocidadeAtual = velocidadeAtual - 5;
    acelerar = acelerar - 5;
    	if(velocidadeAtual < 0) {
    		acelerar = 0;
    		velocidadeAtual=0;
    	}
    	
    	return velocidadeAtual;
    }

    
}