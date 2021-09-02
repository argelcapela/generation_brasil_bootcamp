package ex00;

import java.util.Scanner;

public class idade {
	public static void main(String args[])
	{
		//vars
		Scanner leia = new Scanner(System.in); // instanciamento
		String nome;
		int anoNascimento;
		int anoAtual = 2021;
		
		// input
		System.out.println("Digite o nome: ");
		nome = leia.next();
		System.out.println("Digite o ano de nascimento: ");
		anoNascimento = leia.nextInt();
		
		// out
		System.out.println(nome.toUpperCase() + " sua idade é " + (anoAtual-anoNascimento) + " anos.");
		System.out.println("O seu nome tem " + nome.length() + " caracteres!");
		leia.close();
	}
}
