/*
4) Fa�a um sistema que leia um n�mero inteiro 
e mostre uma mensagem indicando se este n�mero
� par ou �mpar, e se � positivo ou negativo.
*/
package ex04;

import java.util.Scanner;

public class negativoPositivoParImpar {

	public static void main(String[] args) {
		int n;
		Scanner read;
		
		read = new Scanner(System.in);		
		System.out.println("Ol�!");
		System.out.println("Qual o n�mero?");
		n = read.nextInt();
		
		System.out.println("O n�mero inserido �: ");
		if (n < 0)
		{
			System.out.print("Esse n�mero � negativo e ");
			parOuImpar(n);
		}
		else
		{
			System.out.print("Esse n�mero � positivo e ");
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

