package Fundamentos.conversões;



import java.util.Scanner;

public class DesafioConversao {

	
	  // pode resolver pelo uso do entrada.next().replace()
	
	 public static void main(String[] args)  {
		
		 Scanner entrada = new Scanner(System.in);
		 
		 for(int j = 0; j < 3;j++) {
		 
		 System.out.println("Digite o Salario ");
		String salario = entrada.nextLine();
		 
		
		  String armazena = new String();
		 
		 int converteVirgula = salario.length();
		 for (int i = 0; i < converteVirgula; i++) {
			 if(salario.charAt(i) == ',') {
			  armazena += '.';
			 }else {
				 armazena += salario.charAt(i);
			 }
		 }
		 
		 double Recibo1 = Double.parseDouble(armazena);
		 double pagamento =  Recibo1 / 3;
		 System.out.println(pagamento);


		 }
		
		 
		 
		 
		
		 
		 
		 
		 
		 
		 
		 entrada.close();

	 }
}
