/*
4- Obtenha um n�mero digitado pelo usu�rio

e repita a opera��o de multiplicar ele por tr�s  

(imprimindo o novo valor) 

at� que ele seja maior do que 100.


Ex.: se o usu�rio digita 5,  deveremos observar na tela 
a seguinte sequ�ncia: 5 15 45 135.
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
			System.out.println("Digite um n�mero: ");
			numeroDigitado = read.nextInt();
		//processing e //output
			while (numeroDigitado < 100)
			{
				System.out.println("O n�mero est� com o valor de: " + numeroDigitado);
				numeroDigitado *= 3;
			}
			System.out.println("O n�mero est� com o valor de: " + numeroDigitado);
			read.close();
	}

}
