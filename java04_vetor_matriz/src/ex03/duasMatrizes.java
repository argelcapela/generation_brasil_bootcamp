/*
 
3) Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:

a) Uma matriz M1 cujos elementos serão as somas dos elementos 
de mesma posição das matrizes N1 e N2;

b) Uma matriz M2 cujos elementos serão as diferenças dos elementos 
de mesma posição das matrizes N1 e N2.

*/
package ex03;

import java.util.Scanner;

public class duasMatrizes {

	public static void main(String[] args) {
		// vars
			Scanner read;
			int N1[][] = new int[4][6];
			int N2[][] = new int[4][6];
			int M1[][] = new int[4][6];
			int M2[][] = new int[4][6];
			int x;
			int y;
			
			x = 0;
			y = 0;
			read = new Scanner(System.in);
		// input
			// Ler matriz N1
			System.out.println("Vamos começar a leitura da Matriz N1:");
			System.out.println("Entre com os valores da matriz N1:");
			
			while (x < 4)
			{
				while (y < 6)
				{
					System.out.printf("N1[%d][%d]: ", x, y);
					N1[x][y] = read.nextInt();
					y++;
				}
				System.out.println();
				y = 0;
				x++;
			}
			// Ler matriz N2
				x = 0;
				y = 0;
				System.out.println("Entre com os valores da matriz N2:");
				
				while (x < 4)
				{
					while (y < 6)
					{
						System.out.printf("N2[%d][%d]: ", x, y);
						N2[x][y] = read.nextInt();
						y++;
					}
					System.out.println();
					y = 0;
					x++;
				}		
		// processing e output		
				// M1
					x = 0;
					y = 0;
					System.out.println("\nM1 (N1 + n1)\n");				
					while (x < 4)
					{
						while (y < 6)
						{
							M1[x][y] = N1[x][y] + N2[x][y];
							System.out.print(M1[x][y] + " ");
							y++;
						}
						System.out.println();
						y = 0;
						x++;
					}
					System.out.print("\n");
				// M2
					x = 0;
					y = 0;
					System.out.println("\nM2 (N1 - n1)\n");				
					while (x < 4)
					{
						while (y < 6)
						{
							M2[x][y] = N1[x][y] - N2[x][y];
							System.out.print(M2[x][y] + " ");
							y++;
						}
						System.out.println();
						y = 0;
						x++;
					}
			read.close();
	}

}
