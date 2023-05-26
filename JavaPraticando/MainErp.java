package JavaPraticando;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MainErp {

	
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		 
		  for(int i = 1; i < 10;) {
		
		 System.out.println("\n\nDigite  a opção :\n 1 -Cadastrar Produto \n 2 - "
		 		+ "Cadastrar Quantidade no Estoque \n 3 - Cadastrar Usuario ");
           int serviço = entrada.nextInt();
           
           String erro =  "Numero Não Informado";
       
         switch(serviço) {
         case 1 : CadastroProdutos  Produto = new CadastroProdutos();
			
                System.out.println("Digite o Nome do Produto");
                     entrada.nextLine();
                     String nome =  Produto.nomeProduto = entrada.nextLine();
         
         
                System.out.println("\nDigite o Valor do Produto");
                   int valorProduto = Produto.ValorProduto = entrada.nextInt();
                   entrada.nextLine();
                   
                   
                   System.out.println("\nDigite a Descrição do Produto");
                     String descriçao =Produto.descriçaoProduto = entrada.nextLine();
                     
                     
				 System.out.println("\nDigite o Imposto do Produto");
				    Produto.impostoProduto = entrada.nextDouble();
			  	System.out.printf("\nNome do Produto :%s \nValor do Produto : %d "
						+ "\nValor Total com Imposto : %s  \n Descrição do Produto : "
						+ " %s ",nome,valorProduto,Produto.ProdutoCalculado(),descriçao);
			  	entrada.nextLine();
			  	
			  	
			break;
			
         case 2 : 
        	 Estoque Estocar = new Estoque();
		    	System.out.println("\n\nDigite a Quantidade no Estoque");
		         Estocar.QtdeEstoque = entrada.nextInt();
		           System.out.println("Quantidade no Estoque : " + Estocar.LotaçãoEstoque() );
		           
		           
		           
		           
		           System.out.println("Digite s para Verificar todo  Estoque");
		           entrada.nextLine();
		           String Verifica = entrada.nextLine();
		            if(Verifica.equals("s")) {
		            	
		   
		           ArrayList<Estoque> listaNoEstoque = new ArrayList<>();
		           
		           listaNoEstoque.add(new Estoque("Computador"));
		           listaNoEstoque.add(new Estoque("Celular"));
		           listaNoEstoque.add(new Estoque("Televisão"));
		           listaNoEstoque.add(new Estoque("Smartphonex5"));
		           listaNoEstoque.add(new Estoque("Microondas"));
		           listaNoEstoque.add(new Estoque("Geladeira"));
		           listaNoEstoque.add(new Estoque("Copo"));
		           
		           

		           for(Estoque verificar : listaNoEstoque) {
		        	   System.out.println(verificar.VerificarEstoque);
		           }
		          
		            }
		        
		        
		         
		        break;
		    
		        
         case 3 : 
        	 CadastroDeUsuario CdUsuario = new CadastroDeUsuario();
        	 
        	 String[] dadosCliente = new String[5];
        	 
        	    entrada.nextLine();
        	      System.out.println("Digite o Nome do Usuario");
        	      dadosCliente[0] =  CdUsuario.nome = entrada.nextLine();
        	 
        	      System.out.println("Digite o CPF do Usuario");
        	       dadosCliente[1] =  CdUsuario.CPF = entrada.nextLine();
        	 
        	      System.out.println("Digite o RG do Usuario");
        	       dadosCliente[2] =   CdUsuario.RG = entrada.nextLine();
        	         
        	      System.out.println("Digite a Idade do Usuario");
                  int usuario =  CdUsuario.Idade = entrada.nextInt();
        	         String UserCliente = String.valueOf(usuario);
        	         dadosCliente[3] = UserCliente;
        	         
        	      System.out.println("Digite o Código do Usuario");
        	       int ide =  CdUsuario.id = entrada.nextInt();
        	          String codigoCliente =String.valueOf(ide);
        	          dadosCliente[4] = codigoCliente;
        	          
        	          
        	      System.out.println(Arrays.toString(dadosCliente));
        	    
        	       entrada.nextLine();
 
        	 break;
        	 
        	 default : System.out.println(erro); ;
        	 
        	}
           
         String sair = " ";
         
           System.out.println("\n\nDigite Sair para Sair do Programa\nou Digite qualquer numero para continuar");
            sair = entrada.nextLine();
            
            if(sair.equals("sair")) {
            	System.out.println("Sistema Encerrado .");
            	i = 11;
            }else {
              i++;            	
            }
           
	
		  }
			
		
			
		    
		     
		   
		         
		         
		         
		         
	}
}
