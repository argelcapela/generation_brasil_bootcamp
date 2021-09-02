/*
times[]
SPFC
SANTOS
PALMEIRAS
CORINTHIANS
pontos[] - inteiros
rode os times e pergunte:
G-ganhou, P-Perdeu ou E-empatou:
g=3, p=0, e=1
3 rodadas com todos os times
ao final mostra o nome de cada time E total de pontos
*/
package ex00;

import java.util.Scanner;

public class Times {

	public static void main(String[] args) {
		//vars
			Scanner read;			
			String carretaFuracao[] = new String[6];
			String times[] = new String[4];
			int pontos[] = new int[4];
			int resultado;
			int x;
			int y;
			
			read = new Scanner(System.in);
		//input
			times[0] = "SPFC";
			times[1] = "SANTOS";
			times[2] = "PALMEIRAS";
			times[3] = "CORINTHIANS";	
			x = 0;
			y = 0;
		//processing 
			while (x < 3)
			{
				System.out.println("Rodada número #" + (x + 1));
				System.out.println("Quais foram os resultados dos times?");
				System.out.println("G=Ganhou(3pts) | P = Perdeu(0pts) | E=Empatou(1pts)");
				
				while (y < 4)
				{
					System.out.print(times[y] + ": ");
					resultado = read.next().toUpperCase().charAt(0);
					if (resultado == 'G')
					{
						pontos[y] += 3;
					}
					else if (resultado == 'P')
					{
						pontos[y] += 0;
					}
					else if (resultado == 'E')
					{
						pontos[y] += 1;
					}
					else
					{
						System.out.println("Opção Inválida!");
					}
					y++;
				}
				System.out.println();
				y = 0;
				x++;
			}
		//output
			x = 0;
			System.out.println("PLACAR:");
			System.out.println("TIME\t\tPONTOS");
			while (x < 4)
			{
				System.out.print(times[x] + "\t");
				
				if(x < 2)
					System.out.print("\t");
					
				System.out.print(pontos[x] + "\n");
				x++;
			}
	}

}
