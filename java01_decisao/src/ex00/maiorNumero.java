/*
1) Faça um programa que receba três inteiros e diga qual deles é o maior. 
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
			System.out.println("Insira o número # " + (i + 1) + ":");
			temp = read.nextDouble();
			
			if (temp > maiorNumero)
			{
				maiorNumero = temp;
				temp2 = i;
			}
			i++;
		}
		System.out.println("O maior número foi #"+ (temp2 + 1) +" e o seu valor é : " + maiorNumero);
		read.close();
	}

}
