package Fundamentos.tiposPrimitivos;

public class TiposPrimitivos {

	
	   public static void main(String[] args) {
		//informações do funcionario
		   
		 //tipos numéricos
		    byte anosDeEmpresa = 23;
		    short numeroDeVoos = 542;
		    int id= 56789;
		    long pontosAcumulados = 3_134_845_223L;
		    
		    //Tipos numéricos reais
		   float salario = 11_445.44F;
		   double vendasAcumuladas = 2_991_797_103.01;
		   
		   // tipo booleano
		   
		   
		   boolean estaDeFerias = false;
		   char status = 'A';
		   
		   // DIAS DE EMPRESA
		   
		   System.out.println(anosDeEmpresa * 365);
		   System.out.println(numeroDeVoos / 2);
		   System.out.println(pontosAcumulados / vendasAcumuladas);
		   System.out.println(id  +  ": ganha ->"+ salario );
		   System.out.println("Férias?" +  estaDeFerias);
		   System.out.println("status : " + status);
		   
		   
		  

		   
	} 
}
