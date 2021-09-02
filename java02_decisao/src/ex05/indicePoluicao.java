/*
5) A Secretaria de Meio Ambiente que controla o 
índice de poluição mantém 3 grupos de indústrias 
que são altamente poluentes do meio ambiente.

O índice de poluição aceitável varia de 0,05 até 0,25.

Se o índice sobe para 0,3 as indústrias do 1º grupo são 
intimadas a suspenderem suas atividades, 

se o índice crescer para 0,4 as industrias do 1º e 2º grupo são intimadas a suspenderem 
suas atividades,

se o índice atingir 0,5 todos os grupos devem ser notificados a paralisarem suas atividades. 

Faça um sistema que leia o índice de poluição medido e emita a notificação adequada aos diferentes 
grupos de empresas.

// Índice aceitável
0.5 todos fechem agora
0.4 1 e 2 fecha agora
0.3 grupo 1 fecha agora
...
0.25
*/
package ex05;

import java.util.Scanner;

public class indicePoluicao {

	public static void main(String[] args) {
		Scanner read;
		double ipa;
		
		read = new Scanner(System.in);
		ipa = 0;
		System.out.println("Bem Vindo ao Poluômetro: ");
		System.out.println("Por favor, informe o seu índice de poluição!");
		ipa = read.nextDouble();
		
		System.out.println("A notificação do Poluômetro é a seguinte: ");
		if (ipa >= 0.3 && ipa < 0.4)
		{
			System.out.println("As indústrias do 1º grupo devem suspender suas atividades, imediatamente!");
		}
		else if (ipa >= 0.4 && ipa < 0.5)
		{
			System.out.println("As indústrias dos grupo 1 e 2 devem suspender suas atividades, imediatamente!");
		}
		else if (ipa >= 0.5)
		{
			System.out.println("As indústrias de todos os grupos devem encerrar as suas atividades, IMEDIATAMENTE!");
		}
		else
		{
			if (ipa >= 0.25 && ipa < 0.5)
			{
				System.out.println("Está tudo bem!");
			}
			else
			{
				System.out.println("Valor inválido!");
			}
		}
		System.out.print("\n\n");
		read.close();
	}

}
