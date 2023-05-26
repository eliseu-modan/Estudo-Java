package Fundamentos.tiposPrimitivos;

public class NotacaoPonto {

	
	    public static void main(String[] args) {
			
	    	
	    	String s = "Bom dia X";
	    	s = s.replace("X" , "Senhora");
	    	s = s.toUpperCase();
	    	s = s.concat("!!!");
	    	
	    	System.out.println(s);
	    	
	    	 // modo mais simplficado que transforma dados de String
	    	  // varias chamadas em cadeias sendo todas Strings
	    	System.out.println("Junior  ".concat(s));
	    	String y = "Bom Dia X"
	    			.replace("X", "Gui")
	    			.toUpperCase()
	    			.concat("!!!");
	    	System.out.println(y);
	    	
	    	//Tipos Primitivos não tem operado ponto
	    	
		}
}
