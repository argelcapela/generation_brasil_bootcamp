package ex00;

import java.util.Scanner;

public class oVetorcomecaComOZero {

	public static void main(String[] args) {
		//vars
			Scanner read;
			String nomes[][] = new String[2][2];
			int x;
			int y;
			String carretaFuracao[] = new String[6];
			
		
			read = new Scanner(System.in);
		//input
			x = 0;
			y = 0;
			while (x < 2)
			{
				while (y < 2)
				{
					System.out.print("Nomes["+x+"]["+y+"] : ");
					nomes[x][y] = read.next();
					y++;
				}
				y = 0;
				x++;
			}
			
		//processing 
			x = 0;
			y = 0;
			System.out.println("\nOs nomes são: ");
			while (x < 2)
			{
				while (y < 2)
				{
					System.out.print(nomes[x][y] + " ");
					y++;
				}
				System.out.println();
				y = 0;
				x++;
			}
		//output
	}

}
