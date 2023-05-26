package arrayseCollections;

import java.util.Arrays;

public class Exercicios {

	
	   public static void main(String[] args) {
		
       double[] NotasDoAluno = new double[4];
       
       NotasDoAluno[0] = 7.9;
       NotasDoAluno[1] = 8.5;
       NotasDoAluno[2] = 5.8;
       NotasDoAluno[3] = 8.6;
       
       

       System.out.println(Arrays.toString(NotasDoAluno));
       
       double total = 0;
       for(int i = 0 ;i < NotasDoAluno.length;i++) {
    	   total += NotasDoAluno[i];
       }
       
       System.out.println(total / NotasDoAluno.length);
	}
}
