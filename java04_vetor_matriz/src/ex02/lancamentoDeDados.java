/*
2) 
	A) *Um dado � lan�ado 10 vezes e o valor correspondente � anotado. 
	Fa�a um programa que gere um vetor com os lan�amentos, escreva esse vetor.*
	
	B) *A seguir determine e imprima a m�dia aritm�tica dos lan�amentos,* 
	
	C)*contabilize e apresente tamb�m *quantas foram as ocorr�ncias da maior pontua��o.*
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
			System.out.println("Podemos come�ar o lan�amento? (y - sim ou n - n�o)");
			start = read.next().toCharArray()[0];
			if (start == 'y')
			{
				// realizar lan�amentos
				for (int l = 0; l < 10; l++)
				{
					// sorteia (m�nimo, m�ximo); no JAVA			
					lancamentos[l] = (int) ((Math.random() * (7 - 1)) + 1);
					
					
					mediaDosLancamentos += lancamentos[l];				
					// acumula maior n�mero
					if (lancamentos[l] > maiorLancamento)
						maiorLancamento = lancamentos[l];
				}
				// calcula a ocorr�ncia do maior lan�amento
				for (int l = 0; l < 10; l++)
				{
					// exibe lan�amentos
					System.out.println("Lan�amento #" + (l + 1) + " deu: " + lancamentos[l]);
					// vai contando a ocorr�ncia do maior n�mero
					if (lancamentos[l] == maiorLancamento)
						qtdOcorrenciasMaiorLancamento++;
				}
				// calcula a m�dia
					mediaDosLancamentos /= 10;				
				// exibe a m�dia
					System.out.println("A M�dia do resultado dos lan�amentos: " + mediaDosLancamentos);
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
