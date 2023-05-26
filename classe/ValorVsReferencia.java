package classe;

public class ValorVsReferencia {

	    int a = 3;
	    static int b = 4;
	 
	 public static void main(String[]  args) {
		 
		 
		 //referenciar um objeto e atribuir a outro objeto ambos apontam para o mesmo endereço 
		 //valor em tipos primitivos cria um novo endereço na memória 
		
		  ValorVsReferencia acessarA = new ValorVsReferencia();
		 System.out.println(acessarA.a);
		 
		 System.out.println(b);
		 
		 double a = 2 ;
		 double b = a ;//Atribuição por valor
		 
		 a++;
		 b--;
		 
		 System.out.println(a +" "+ b);
		 
		 Data d1 = new Data(1,"julho", 2022);
		 Data d2 = d1 ;
		 
		 d1.dia = 31;
		 d2.mes = "august";
		 
		 d1.ano=2023;
		 System.out.println(d1.formatarData());
		 System.out.println(d2.formatarData());
		 
		 voltarDataPadrao(d2);
		 
		 System.out.println(d1.formatarData());
		 System.out.println(d2.formatarData());
		 
		 
	}
	 
	 static void voltarDataPadrao(Data d) {
		 d.dia = 11;
		 d.mes = "Julho";
		 d.ano = 2029;
	 }
}
