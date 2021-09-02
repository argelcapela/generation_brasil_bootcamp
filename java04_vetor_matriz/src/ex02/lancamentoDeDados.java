/*
2) 
	A) *Um dado é lançado 10 vezes e o valor correspondente é anotado. 
	Faça um programa que gere um vetor com os lançamentos, escreva esse vetor.*
	
	B) *A seguir determine e imprima a média aritmética dos lançamentos,* 
	
	C)*contabilize e apresente também *quantas foram as ocorrências da maior pontuação.*
*/
package ex02;

import java.util.Scanner;

public class lancamentoDeDados {

	public static void main(String[] args) {
		// vars
			Scanner read;
			int lancamentos[] = new int[10];
			double mediaDosLancamentos;
			int qtdOcorrenciasMaiorLancamento;
			char start;
			int maiorLancamento;
			
			read = new Scanner(System.in);
			mediaDosLancamentos = 0;
			qtdOcorrenciasMaiorLancamento = 0;
			maiorLancamento = 0;
			start = 0;
		// input e processing
			System.out.println("Podemos começar o lançamento? (y - sim ou n - não)");
			start = read.next().toCharArray()[0];
			if (start == 'y')
			{
				// realizar lançamentos
				for (int l = 0; l < 10; l++)
				{
					// sorteia (mínimo, máximo); no JAVA			
					lancamentos[l] = (int) ((Math.random() * (7 - 1)) + 1);
					
					
					mediaDosLancamentos += lancamentos[l];				
					// acumula maior número
					if (lancamentos[l] > maiorLancamento)
						maiorLancamento = lancamentos[l];
				}
				// calcula a ocorrência do maior lançamento
				for (int l = 0; l < 10; l++)
				{
					// exibe lançamentos
					System.out.println("Lançamento #" + (l + 1) + " deu: " + lancamentos[l]);
					// vai contando a ocorrência do maior número
					if (lancamentos[l] == maiorLancamento)
						qtdOcorrenciasMaiorLancamento++;
				}
				// calcula a média
					mediaDosLancamentos /= 10;				
				// exibe a média
					System.out.println("A Média do resultado dos lançamentos: " + mediaDosLancamentos);
				// exibe a qtdOcorrenciasMaiorLancamento
					System.out.println("O maior resultado foi: " + maiorLancamento);
					System.out.println("O maior resultado se repetiu: " + qtdOcorrenciasMaiorLancamento + " vezes");
			
			}
			else
			{
				System.out.println("Tchau! Tchau! ");
			}
		// output
			read.close();
	}

}
