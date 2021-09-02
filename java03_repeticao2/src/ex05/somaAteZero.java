/* 
  
 	5)Crie um programa que leia um número do teclado até 
 	que encontre um número igual a zero. (0 para)
 	
 	No final, mostre a soma dos números digitados.
 	(DO...WHILE)
 	
 */

package ex05;

import java.util.Scanner;

public class somaAteZero {

	public static void main(String[] args) {
		//vars
			int numeroDigitado;
			int somaDosNumerosDigitados;
			int totalDosNumerosDigitados;
			int i;
			Scanner read;
			
			somaDosNumerosDigitados = 0;
			totalDosNumerosDigitados = 0;
			i = 0;
			read = new Scanner(System.in);
			
		//input and processing
			do
			{
				i++;
				// informar os números
					System.out.print("Número #" + i + " : "); // índice para cada número
					numeroDigitado = read.nextInt();
					
				// soma a cada número inserido
					somaDosNumerosDigitados += numeroDigitado;
					totalDosNumerosDigitados += 1;
					
			} while (numeroDigitado != 0);
			read.close();
			totalDosNumerosDigitados--;
		// output
				System.out.println("____________RESULTADO__________");
				System.out.println("Total de números digitados : " + totalDosNumerosDigitados + " números");
				System.out.println("Soma dos números digitados : " + somaDosNumerosDigitados);
	}

}
