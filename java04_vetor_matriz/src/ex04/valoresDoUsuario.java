/*
4)

A) Crie um programa que receba valores do usuário 
para preencher uma matriz 3X3,

B) e em seguida,exiba a soma dos valores 

C) dela e a soma dos valores da 
primeira diagonal, ou seja, diagonal principal.
*/
package ex04;

import java.util.Scanner;

public class valoresDoUsuario {

	public static void main(String[] args) {
		// vars
			Scanner read;
			int x;
			int y;
			int valores[][] = new int[3][3];
			int soma;
			int somaDiagonais;
			
			read = new Scanner(System.in);
			x = 0;
			y = 0;
			soma = 0;
			somaDiagonais = 0;
		// input or processing
			System.out.println("Insira os valores na matriz: ");
			while (x < 3)
			{
				while (y < 3) 
				{
					System.out.printf("Matriz[%d][%d]: ", x, y);
					valores[x][y] = read.nextInt();
						soma += valores[x][y];
						if (x == y)
							somaDiagonais += valores[x][y];
					y++;
				}
				System.out.println();
				y = 0;
				x++;
			}
		// output
			x = 0;
			y = 0;
			System.out.println("Os valores inseridos pelo usuário são: ");
			while (x < 3)
			{
				while (y < 3) 
				{
					System.out.print(valores[x][y] + " ");
					y++;
				}
				System.out.println();
				y = 0;
				x++;
			}
			System.out.println("A soma de todos os valores é: " + soma);
			System.out.println("A soma das diagonais principais é: " + somaDiagonais);
			read.close();
	}

}
