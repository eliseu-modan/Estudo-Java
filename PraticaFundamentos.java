

import javax.swing.JOptionPane;

public class PraticaFundamentos {

	public static void main(String[] args) {

		// dados de um funcionario
		
		final String CPF = "488.065.985-65";
		final String RG = "49.020.548-56";
		var salario = 1258.654D;
		String nome = "Eliseu Modanesi Junior";
		String empresa = "Mundi Alimentos";
		String tempoDeEmpresa = "10 Anos";
		String cargo = "motorista";

		// exibindo os dados

		double somaSalarial = salario * 12 * 10;
		String dadosFuncionario = String.format(
				"CPF : %s \nRG : %s \nSalario : %.2f \nnome : %s "
						+ " \nEmpresa : %s \nTempo de Empresa : %s \nCargo : %s",
				CPF, RG, somaSalarial, nome, empresa, tempoDeEmpresa, cargo);

		System.out.println(dadosFuncionario);

		// Modificando dados ou sabendo alguma informalção sobre eles

		System.out.printf("Modificando ou buscando Informações : %s\n", nome.compareToIgnoreCase(empresa));

		//Wrapper Objetos para Tipos primitivos 
		Short Wrapper = 10;
		Byte wrapper2 = 20;
		Long wrapper3 = 100L;

		Integer wrapper4 = 1200;
		Double wrapper5  = 12.0;
		Boolean wrapper6 = Boolean.parseBoolean("true");
		
		//Conversoes em Java tipo wrapper para string
		
		System.out.println("Transformando numéricos em String");
		Integer salario1 = 10000;
		System.out.println("Tamanho da String :"+salario1.toString().length());
		int salario2 = 1000;
		System.out.println("Tamanho da String :"+ Integer.toString(salario2).length());
		int salario3 = 45;
		System.out.println(("" + salario3).length());
		
		//Convertendo String para numérico
		
		String valor1 = JOptionPane.showInputDialog(
				"Digite o Primeiro Valor");
		
		String valor2 = JOptionPane.showInputDialog(
				"Digite o Segundo Valor");
		
		String valor3 = JOptionPane.showInputDialog(
				"Digite o Segundo Valor");
		
		double Valor1Convertido = Double.parseDouble(valor1);
		System.out.println(Valor1Convertido);
		
		double Valor2Convertido = Double.parseDouble(valor1);
		System.out.println(Valor2Convertido);
		
		double Valor3Convertido = Double.parseDouble(valor1);
		System.out.println(Valor3Convertido);
		
		double soma = Valor1Convertido + Valor2Convertido + Valor3Convertido ;
		
		System.out.println("valores somados " + soma);

	}
}
