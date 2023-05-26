package Fundamentos.conversões;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		
		double a = 1.12345678888;//implicita
		System.out.println(a);
		
		
		//pode gerar perca de Informação conversão explicita (cast)
		
		float b = (float)1.123456788888;
		System.out.println(b);
		
		 //Java armazena verificando tipos e não quantidades
		int c = 128;
		byte d = (byte) c;
		System.out.println(d);
	}
}
