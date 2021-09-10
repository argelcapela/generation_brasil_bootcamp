/*
	3)
	Crie uma um programa para trabalhar com estoque de uma loja, 
	o programa deverá trabalhar com Collection do tipo 
	List do Java para manipular os dados desse estoque, 
	o programa deverá atender as seguintes funcionalidades:
		
		-> Armazenar dados da List;
		-> Remover dados da list;
		-> Atualizar dados da list;
		-> Apresentar todos os dados da list;

*/
package ex03;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		//vars
			ArrayList<Produto> produtos = new ArrayList<Produto>();
			produtos.add(new Produto("G1-1", "Notebook Acer Gamer", 4700, 10));
			
			produtos.add(new Produto("G1-2", "Smart TV LG 55", 2799, 10));
		

	}

}
