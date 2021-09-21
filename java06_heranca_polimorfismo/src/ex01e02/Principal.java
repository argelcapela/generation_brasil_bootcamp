/*
1) 
Crie uma hierarquia de classes conforme abaixo 
com os seguintes atributos e comportamentos (observe a tabela),
utilize os seus conhecimentos e distribua as características de
forma que tudo o que for comum a todos os animais fique na classe Animal: 

2)
Implemente um programa que crie os 3 tipos de animais
definidos no exercício anterior e invoque o método 
que emite o som de cada um de forma polimórfica, 
isto é, independente do tipo de animal.
*/
package ex01e02;

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
