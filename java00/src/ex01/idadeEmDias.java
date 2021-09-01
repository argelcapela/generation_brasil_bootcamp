package ex01;

import java.util.Scanner;

public class idadeEmDias {
	public static void main(String args[])
	{
		int qtdAnos;
		int qtdMeses;
		int qtdDias;
		int idade;
		Scanner read = new Scanner(System.in);
		
		System.out.printf("Qual a sua idade Brother?\n");
		System.out.printf("Em anos? ");
		qtdAnos = read.nextInt();
		System.out.printf("Em meses? ");
		qtdMeses = read.nextInt();
		System.out.printf("Em dias? ");
		qtdDias = read.nextInt();
		idade = (qtdAnos * 365) + (qtdMeses * 30) + qtdDias;
		System.out.printf("Valeu Brother!\nSua idade em dias é: " + idade);
		read.close();
	}
}
