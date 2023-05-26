package Fundamentos.controle;

public class SwitchSemBreak {

	public static void main(String[] args) {

		String faixa = "branca";

		switch (faixa.toLowerCase()) {

		case "preta":
			System.out.println("sei o Bassai-dai ..");
		case "marrom":
			System.out.println("sei o Tekki Shodan");
		case "roxa":
			System.out.println("sei o Hei kodan");
		case "verde":
			System.out.println("sei o hei Godan");
		case "laranja":
			System.out.println("sei o Heian sandan");
		case "vermelha":
			System.out.println("sei o heian nidan");
		case "amarela":
			System.out.println("sei o heian shodan");
			break;
		default:
			System.out.println("nao sei nada");
		}
		System.out.println("FIM !");
	}
}
