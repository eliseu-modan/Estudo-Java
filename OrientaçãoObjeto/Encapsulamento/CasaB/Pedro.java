package OrientaçãoObjeto.Encapsulamento.CasaB;

import OrientaçãoObjeto.Encapsulamento.CasaA.Ana;

public class Pedro extends Ana{
	


	 void TestarAcesso() {
		 //segredo
		 //focadentrodecasa 
		 //formadefalar
		 //todossabem
		 
		// System.out.println(mae.segredo);
		// System.out.println(mae.FacoDentroDeCasa);
		 System.out.println(todosSabem); //acesso por protected herança
		 System.out.println(FormaDeFalar);//acesso public por herança

	 }
	
	
	
}
