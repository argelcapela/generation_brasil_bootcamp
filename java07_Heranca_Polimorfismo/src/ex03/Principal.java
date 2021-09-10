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
import java.util.Iterator;
import java.util.Scanner;

public class Principal {

	public static void limpa()
	{
		for (int i = 0; i < 100;i++)
		{
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// vars
			Scanner leia = new Scanner(System.in);
			String 	codProduto;
			int		qtdProduto;
			char 	op;
			
			boolean	continuarComprando = true;
		
		
		// input
			ArrayList<Produto> produtos = new ArrayList<Produto>();
			produtos.add(new Produto("G1-1", "Notebook Acer Gamer  ", 4700, 10));			
			produtos.add(new Produto("G1-2", "Smart TV LG 55	  ", 2799, 10));
		
		// processing
		do 
		{
			limpa();
			for(Produto p : produtos)			
				System.out.println(p.toString());
			
			System.out.print("\n\nInsira o código do produto que deseja comprar: ");
			codProduto = leia.next();			
			
			System.out.print("Qual a quantidade que você deseja desse produto?: ");
			qtdProduto = leia.nextInt();
			
			for(Produto p : produtos)
			{
				if (p.getCod().toLowerCase().equals(codProduto))
				{
					limpa();
					p.comprar(qtdProduto);
				}
			}
			
			
			for(Produto p : produtos)			
				System.out.println(p.toString());
			
			System.out.print("\n\nContinuar comprando? (s-sim | n-não): ");
			op = leia.next().charAt(0);
			if (Character.toString(op).toLowerCase().equals("n"))
			{
				System.out.println("Até Breve!");
				break;
			}
			
		
		} while(continuarComprando);
			
			
		
	}

}
