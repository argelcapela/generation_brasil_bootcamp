package ex01;

public class Principal {

	public static void main(String[] args) {
		//input
		Cachorro 	dog1 	= 	new Cachorro("Caramelo", 	5);
		Cavalo		panga1 	= 	new Cavalo	("Pé-de-Pano", 	8);
		Preguica	bicho1	=	new	Preguica("The Flash",	6);	
		
		dog1.emitirSom();
		panga1.emitirSom();
		bicho1.emitirSom();
	}

}
