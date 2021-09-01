/*
3- Elaborar um programa que efetue a leitura sucessiva
de valores num�ricos e apresente no final o total do somat�rio, 
a m�dia e o total de valores lidos. 

O programa deve fazer as leituras
dos valores enquanto o usu�rio estiver fornecendo valores positivos. 
enquanto [n > 0]

Ou seja, o programa deve parar quando o usu�rio fornecer um 
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
				System.out.println("N�mero #" + qtdValoresInseridos + " : ");
				temp = read.nextDouble();
			}
			qtdValoresInseridos -= 1;			
		//output
			System.out.println("O total de valores inseridos �: " + qtdValoresInseridos);
			System.out.println("O total do somat�rio �: " + totalSomatorio);
			read.close();
	}

}
