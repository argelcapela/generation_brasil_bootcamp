/*
8) Construa um sistema para ler uma vari�vel 
num�rica N e imprimi-la somente se a mesma for maior que 100,
caso contr�rio imprimi-la com o valor zero.
*/
package ex08;

import java.util.Scanner;

public class nMaiorQue100 {

	public static void main(String[] args) {
		//vars
		Scanner read;
		int N;
		//input
		read = new Scanner(System.in);
		System.out.println("Qual o valor de N?");
		N = read.nextInt();
		//processing
		if (N > 100)
		{
			//output
			System.out.println("N � maior que 100");
			System.out.println("O valor de N � " + N);
		}
		else
		{
			N = 0;
			System.out.println("N � menor que 100, transformado em 0!");
			System.out.println("O valor de N � " + N);
		}
		read.close();
	}

}
