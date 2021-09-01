package ex05;

import java.util.Scanner;

public class mostreAContagem {

	public static void main(String[] args) {
		//vars
			Scanner read;
			int contagem;
			
			contagem = 233;
			read = new Scanner(System.in);
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
		read.close();
	}

}
