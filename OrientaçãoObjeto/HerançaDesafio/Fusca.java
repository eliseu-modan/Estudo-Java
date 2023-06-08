package OrientaçãoObjeto.HerançaDesafio;

public class Fusca extends Carro {

	
	@Override
	int Acelerar() {
		velocidadeAtual += 4;
		
		return velocidadeAtual;
		}
	
	@Override
	int freiar() {
           velocidadeAtual -=  4;
            if(velocidadeAtual < 0) {
            	velocidadeAtual = 0;
            	freiar = 0;
            }
		return velocidadeAtual;
	}
}
