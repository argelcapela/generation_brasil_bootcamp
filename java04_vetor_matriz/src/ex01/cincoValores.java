/*
1) Fa�a um programa que crie um vetor por leitura com 5
valores de pontua��o de uma atividade e o escreva em seguida.
Encontre ap�s a maior pontua��o e a apresente. 
*/
package ex01;

import java.util.Scanner;

public class cincoValores {

	public static void main(String[] args) {
		// vars
			Scanner read;
			double maiorValor;
			double valores[] = new double[5];
			int i;
			
			read = new Scanner(System.in);
			maiorValor = 0;
			i = 0;
		// input and processing
			System.out.println("Entre com os valores da Atividade:");
			while (i < 5)
			{
				System.out.println("Pontua��o #"+ (i + 1) + " : ");
				valores[i] = read.nextDouble();
				if (valores[i] > maiorValor)
					maiorValor = valores[i];
				i++;
			}
		// output
			System.out.println("A maior pontua��o foi: " + (int)maiorValor);
			read.close();
	}

}
