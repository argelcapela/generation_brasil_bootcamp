/*
8) Construa um sistema para ler uma variável 
numérica N e imprimi-la somente se a mesma for maior que 100,
caso contrário imprimi-la com o valor zero.
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
			System.out.println("N é maior que 100");
			System.out.println("O valor de N é " + N);
		}
		else
		{
			N = 0;
			System.out.println("N é menor que 100, transformado em 0!");
			System.out.println("O valor de N é " + N);
		}
		read.close();
	}

}
