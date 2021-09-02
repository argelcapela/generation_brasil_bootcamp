/*
5 - Faça um programa que mostre uma contagem na tela de 233 a 456,
só que contando de 3 em 3 quando estiver entre 300 e 400 e 
de 5 em 5 quando não estiver. (Primeiro Ele mostra depois ele exibe!)
*/
package ex05;

public class mostreAContagem {

	public static void main(String[] args) {
		//vars
			int contagem;
			
			contagem = 233;
		//input
			do
			{
				System.out.println(contagem);
				
				if (contagem >= 300 && contagem <= 400)
				{
					contagem += 3;
				}
				else
				{
					contagem += 5;
				}
			} 
			while(contagem <= 456);
	}

}
