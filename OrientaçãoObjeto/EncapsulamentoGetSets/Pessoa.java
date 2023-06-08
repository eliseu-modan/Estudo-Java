package OrientaçãoObjeto.EncapsulamentoGetSets;

public class Pessoa {

	
	public static void main(String[] args) {
		
		
		TestePessoa pessoa = new TestePessoa();
		
		pessoa.setIdade(51);
		System.out.println("Idade : " + pessoa.getIdade()) ;
		
		pessoa.setNome("eliseu");
		System.out.println("Nome : "+ pessoa.getNome());
	}
}
