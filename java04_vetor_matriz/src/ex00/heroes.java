package ex00;

import java.util.Scanner;

public class heroes {

	public static void main(String[] args) {
		//vars
			Scanner read;
			int idHeroi;
			String carretaFuracao[] = new String[6];
			int pontos[] = new int[6];
			String resposta;
		
			read = new Scanner(System.in);
		//input
			idHeroi = 0;
			resposta = "";
			carretaFuracao[0] = "Fof�o";
			carretaFuracao[1] = "Mickey";
			carretaFuracao[2] = "Capit�o Am�rica";
			carretaFuracao[3] = "Popeye";
			carretaFuracao[4] = "Homem-Aranha";
			carretaFuracao[5] = "Lanterna Verde do Agreste[ED]";
		//processing 
			for (int x = 0; x < 6; x++)
			{
				System.out.println("Her�i: " + (x + 1) + " - " + carretaFuracao[x]);
				System.out.println("Avalia��o: 1 - Iniciante  2 - Em Devenvolvimento  3 - Proeficiente  4 - Avan�ado ");
				pontos[x] = read.nextInt();
			}
			System.out.println("Qual Her�i voc� quer saber o n�vel? (1 e 6)");
			idHeroi = read.nextInt();
			idHeroi -= 1;
			
			if (pontos[idHeroi] == 1)
			{
				resposta = "Iniciante";
			}
			else if (pontos[idHeroi] == 2)
			{
				resposta = "Em Devenvolvimento";
			}
			else if (pontos[idHeroi] == 3)
			{
				resposta = "Proefiente";
			}
			else if (pontos[idHeroi] == 4)
			{
				resposta = "Avan�ado";
			}
		//output
			System.out.println("O personagem escolhido foi " + carretaFuracao[idHeroi] + " e o mesmo � " + resposta);
	}

}
