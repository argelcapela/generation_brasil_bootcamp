/*
Desenvolva um sistema em que:
Leia 4 (quatro) n�meros;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
Caso contr�rio, imprima os valores lidos e seus respectivos quadrados.
*/
package ex03;

import java.util.Scanner;

public class quadradoDe4Numeros {

	public static void main(String[] args) {
		double n1;
		double n2;
		double n3;
		double qn3;
		double n4;
		Scanner read;
		
		read = new Scanner(System.in);
		qn3 = 0;
		
		System.out.println("Ol�!");
		System.out.println("Qual o valor do n�mero 1: ");
		n1 = read.nextDouble();
		System.out.println("Qual o valor do n�mero 2: ");
		n2 = read.nextDouble();
		System.out.println("Qual o valor do n�mero 3: ");
		n3 = read.nextDouble();
		System.out.println("Qual o valor do n�mero 4: ");
		n4 = read.nextDouble();
		
		qn3 = Math.pow(n3, 2);
		if (qn3 >= 1000)
		{
			System.out.println("O valor do n3 �: " + qn3 + "\n programa finalizado!\n");
		}
		else
		{
			System.out.println("Valor do n1: " + n1 + ", seu quadrado �: " + Math.pow(n1, 2));
			System.out.println("Valor do n2: " + n2 + ", seu quadrado �: " + Math.pow(n2, 2));
			System.out.println("Valor do n3: " + n3 + ", seu quadrado �: " + Math.pow(n3, 2));
			System.out.println("Valor do n4: " + n4 + ", seu quadrado �: " + Math.pow(n4, 2));
		}
		read.close();
	}

}
