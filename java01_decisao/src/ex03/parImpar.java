/*
4) Fa�a um sistema que leia um n�mero inteiro 
e mostre uma mensagem indicando se este n�mero
� par ou �mpar, e se � positivo ou negativo.
*/
package ex03;

import java.util.Scanner;

public class parImpar {

	public static void main(String[] args) {
		int n;
		Scanner read;
		
		read = new Scanner(System.in);		
		System.out.println("Ol�!");
		System.out.println("Qual o n�mero?");
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
		System.out.print("O n�mero inserido � ");
		if ((n * (-1)) % 2 == 0)
		{
			System.out.printf("par, sua raiz quadrada �: %.2f" , Math.sqrt(n));
		}
		else
		{
			System.out.printf("impar, esse n�mero ao quadrado �: %.2f" , Math.pow(n, 2));
		}
		return (n);
	}
}

