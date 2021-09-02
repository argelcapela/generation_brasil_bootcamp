/* 
  
 	5)Crie um programa que leia um n�mero do teclado at� 
 	que encontre um n�mero igual a zero. (0 para)
 	
 	No final, mostre a soma dos n�meros digitados.
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
				// informar os n�meros
					System.out.print("N�mero #" + i + " : "); // �ndice para cada n�mero
					numeroDigitado = read.nextInt();
					
				// soma a cada n�mero inserido
					somaDosNumerosDigitados += numeroDigitado;
					totalDosNumerosDigitados += 1;
					
			} while (numeroDigitado != 0);
			read.close();
			totalDosNumerosDigitados--;
		// output
				System.out.println("____________RESULTADO__________");
				System.out.println("Total de n�meros digitados : " + totalDosNumerosDigitados + " n�meros");
				System.out.println("Soma dos n�meros digitados : " + somaDosNumerosDigitados);
	}

}
