/*
4- Obtenha um número digitado pelo usuário

e repita a operação de multiplicar ele por três  

(imprimindo o novo valor) 

até que ele seja maior do que 100.


Ex.: se o usuário digita 5,  deveremos observar na tela 
a seguinte sequência: 5 15 45 135.
*/
package ex04;

import java.util.Scanner;

public class multiplicaElePor3 {

	public static void main(String[] args) {
		//vars
		Scanner read;
		int numeroDigitado;	
		
		read = new Scanner(System.in);
		//input
			System.out.println("Digite um número: ");
			numeroDigitado = read.nextInt();
		//processing e //output
			while (numeroDigitado < 100)
			{
				System.out.println("O número está com o valor de: " + numeroDigitado);
				numeroDigitado *= 3;
			}
			System.out.println("O número está com o valor de: " + numeroDigitado);
			read.close();
	}

}
