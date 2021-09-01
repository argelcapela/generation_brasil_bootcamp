/*
3- Elaborar um programa que efetue a leitura sucessiva
de valores numéricos e apresente no final o total do somatório, 
a média e o total de valores lidos. 

O programa deve fazer as leituras
dos valores enquanto o usuário estiver fornecendo valores positivos. 
enquanto [n > 0]

Ou seja, o programa deve parar quando o usuário fornecer um 
valor negativo.
*/
package ex03;

import java.util.Scanner;

public class leituraSucessiva {

	public static void main(String[] args) {
		//vars
			Scanner read;
			double totalSomatorio;
			int qtdValoresInseridos;
			double temp;
			
			qtdValoresInseridos = 0;
			totalSomatorio = 0;
			temp = 0;
			read = new Scanner(System.in);
		//input and processing
			while (temp >= 0)
			{
				totalSomatorio += temp;
				qtdValoresInseridos++;
				System.out.println("Número #" + qtdValoresInseridos + " : ");
				temp = read.nextDouble();
			}
			qtdValoresInseridos -= 1;			
		//output
			System.out.println("O total de valores inseridos é: " + qtdValoresInseridos);
			System.out.println("O total do somatório é: " + totalSomatorio);
			read.close();
	}

}
