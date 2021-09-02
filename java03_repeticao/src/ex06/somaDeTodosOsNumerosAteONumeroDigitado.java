/*
6- Faça um programa que pegue um número do teclado 
e calcule a soma de todos os números  de 1 até ele.
Ex.: o usuário entra 7, o programa vai mostrar 28, 
pois  1+2+3+4+5+6+7=28.
*/
package ex06;

import java.util.Scanner;

public class somaDeTodosOsNumerosAteONumeroDigitado {

	public static void main(String[] args) {
		//vars
			Scanner read;
			int numeroDigitado;
			int somatorio;
			int nInicial;
				
			read = new Scanner(System.in);
			somatorio = 0;
		//input
			System.out.println("Digite um número: ");
			numeroDigitado = read.nextInt();
			nInicial = numeroDigitado;				
		//processing
			do
			{
				somatorio += numeroDigitado;
				numeroDigitado--;
			}
			while(numeroDigitado > 0);
		//output
			System.out.println("A soma de 1 até " + nInicial + " é: " + somatorio);	
			read.close();
	}

}
