package Fundamentos.controle;

public class DesafioFor {

	public static void main(String[] args) {
		
//		String valor = "#";
//		for(boolean i = true; i != false ; i =true) {
//			System.out.println(valor);
//			valor += "#";
//		}
		for(String v = "#" ; !v.equals("######"); v +="#") {
			System.out.println(v);
		}
	}
}
