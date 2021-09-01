/*
1) João, homem de bem, comprou um microcomputador 
para controlar o ##rendimento diário## de seu trabalho.
Toda vez que ele traz um peso de tomate maior que o 
estabelecido pelo regulamento do estado de São Paulo 
(50 quilos) deve pagar um multa de R$ 4,00 por quilo excedente.
João precisa que você faça um sistema que leia a variável P (peso de tomates)
e verifique se há excesso. Se houver, gravar na variável E (Excesso) e 
na variável M o valor da multa que João deverá pagar. Caso contrário
mostrar tais variáveis com o conteúdo ZERO.
*/
package ex01;

import java.util.Scanner;

public class multaDosTomates {

	public static void main(String[] args) {
		double P;
		double E;
		double M;
		Scanner read;
		
		read = new Scanner(System.in);
		/* byte, char, short, int, long, float e double são 
		inicializadas como 0, e as variáveis do tipo boolean 
		são inicializadas como false */
		System.out.println("Qual o peso de tomates amigo?");
		P = read.nextInt();
		if (P > 50)
		{
			E = P - 50;
		}
		else
		{
			E = 0;
		}
		M = E * 4;
		System.out.println("O peso de tomate é: " + P + " kg\n");
		System.out.println("O peso de excedente é: " + E + " kg\n");
		System.out.println("A multa a ser paga é: R$" + M + " reais\n");
		read.close();
	}

}
