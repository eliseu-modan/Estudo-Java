package classe;

public class Data {

	
	   int dia;
	   String mes;
	   int ano;
	   
	   
	   
	   Data(){
		   dia = 1;
		   mes ="Janeiro";
		   ano = 1970;
	   }
	   
	   Data(int dia , String mes , int ano){
		   this.dia = dia;
		   this.mes = mes;
		   this.ano = ano;
		   
	   }
	   
	String formatarData() {
	String format  = dia + "/" + mes + "/" + ano;	
	 return format;
	 
	   }
	
	
	void imprimirDateFormat() {
		System.out.printf("\n%d/%s/%d",dia,mes,ano);
	}
}
 