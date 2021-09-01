/*
4) Faça um sistema que leia um número inteiro 
e mostre uma mensagem indicando se este número
é par ou ímpar, e se é positivo ou negativo.
*/
package ex04;

import java.util.Scanner;

public class negativoPositivoParImpar {

	public static void main(String[] args) {
		int n;
		Scanner read;
		
		read = new Scanner(System.in);		
		System.out.println("Olá!");
		System.out.println("Qual o número?");
		n = read.nextInt();
		
		System.out.println("O número inserido é: ");
		if (n < 0)
		{
			System.out.print("Esse número é negativo e ");
			parOuImpar(n);
		}
		else
		{
			System.out.print("Esse número é positivo e ");
			parOuImpar(n);
		}
		read.close();
	}
	
	public static int parOuImpar(int n)
	{
		if ((n * (-1)) % 2 == 0)
			System.out.print("par\n\n");
		else
			System.out.print("impar\n\n");
		return (n);
	}
}

