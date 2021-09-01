/*
5) A Secretaria de Meio Ambiente que controla o 
�ndice de polui��o mant�m 3 grupos de ind�strias 
que s�o altamente poluentes do meio ambiente.

O �ndice de polui��o aceit�vel varia de 0,05 at� 0,25.

Se o �ndice sobe para 0,3 as ind�strias do 1� grupo s�o 
intimadas a suspenderem suas atividades, 

se o �ndice crescer para 0,4 as industrias do 1� e 2� grupo s�o intimadas a suspenderem 
suas atividades,

se o �ndice atingir 0,5 todos os grupos devem ser notificados a paralisarem suas atividades. 

Fa�a um sistema que leia o �ndice de polui��o medido e emita a notifica��o adequada aos diferentes 
grupos de empresas.

// �ndice aceit�vel
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
		System.out.println("Bem Vindo ao Polu�metro: ");
		System.out.println("Por favor, informe o seu �ndice de polui��o!");
		ipa = read.nextDouble();
		
		System.out.println("A notifica��o do Polu�metro � a seguinte: ");
		if (ipa >= 0.3 && ipa < 0.4)
		{
			System.out.println("As ind�strias do 1� grupo devem suspender suas atividades, imediatamente!");
		}
		else if (ipa >= 0.4 && ipa < 0.5)
		{
			System.out.println("As ind�strias dos grupo 1 e 2 devem suspender suas atividades, imediatamente!");
		}
		else if (ipa >= 0.5)
		{
			System.out.println("As ind�strias de todos os grupos devem encerrar as suas atividades, IMEDIATAMENTE!");
		}
		else
		{
			if (ipa >= 0.25 && ipa < 0.5)
			{
				System.out.println("Est� tudo bem!");
			}
			else
			{
				System.out.println("Valor inv�lido!");
			}
		}
		System.out.print("\n\n");
		read.close();
	}

}
