package arrayseCollections;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioForEach {

	
	 public static void main(String[] args) {
		 
		 Scanner entrada = new Scanner(System.in);			 
		 
		 System.out.println("Quantas Notas: ");
		 
		 int qtdNotas = entrada.nextInt();
		 System.out.println(qtdNotas);
		 
		 double[] notas = new double[qtdNotas];
		 
	
		 
		 for (int i = 0; i < notas.length; i++) {
			System.out.println("Informe a Nota " + (i + 1) + ":");
			notas[i] = entrada.nextDouble();
		}
		 System.out.println(Arrays.toString(notas));
		 
		 double total = 0;
		 for(double nota : notas) {
			 total += nota;
			 
		 }
		 double media = total / notas.length;
		 System.out.println("A média é " + media);
		 entrada.close();
	}
}
