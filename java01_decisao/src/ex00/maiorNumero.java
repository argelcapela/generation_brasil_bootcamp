/*
1) Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior. 
 */
package ex00;

import java.util.Scanner;

public class maiorNumero {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double maiorNumero;
		double temp;
		int temp2;
		int i;
		
		maiorNumero = 0;
		temp2 = 0;
		i = 0;
		
		while (i < 3)
		{
			System.out.println("Insira o n�mero # " + (i + 1) + ":");
			temp = read.nextDouble();
			
			if (temp > maiorNumero)
			{
				maiorNumero = temp;
				temp2 = i;
			}
			i++;
		}
		System.out.println("O maior n�mero foi #"+ (temp2 + 1) +" e o seu valor � : " + maiorNumero);
		read.close();
	}

}
