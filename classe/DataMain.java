package classe;

public class DataMain {

	
	 public static void main(String[] args) {
		
		 Data Data1 = new Data(12,"ouctober",1879);
		 Data1.imprimirDateFormat();
		 
		 
		 
		 Data Data2 = new Data();
		 
		 
		 System.out.println("\n" +Data2.formatarData());
		 Data2.imprimirDateFormat();
	}
}
