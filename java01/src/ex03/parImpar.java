/*
4) Faça um sistema que leia um número inteiro 
e mostre uma mensagem indicando se este número
é par ou ímpar, e se é positivo ou negativo.
*/
package ex03;

import java.util.Scanner;

public class parImpar {

	public static void main(String[] args) {
		int n;
		Scanner read;
		
		read = new Scanner(System.in);		
		System.out.println("Olá!");
		System.out.println("Qual o número?");
		n = read.nextInt();
		
		if (n < 0)
		{
			parOuImpar(n);
		}
		else
		{
			parOuImpar(n);
		}
		read.close();
	}
	
	public static int parOuImpar(int n)
	{
		System.out.print("O número inserido é ");
		if ((n * (-1)) % 2 == 0)
		{
			System.out.printf("par, sua raiz quadrada é: %.2f" , Math.sqrt(n));
		}
		else
		{
			System.out.printf("impar, esse número ao quadrado é: %.2f" , Math.pow(n, 2));
		}
		return (n);
	}
}

