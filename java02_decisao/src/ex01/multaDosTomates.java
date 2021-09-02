/*
1) Jo�o, homem de bem, comprou um microcomputador 
para controlar o ##rendimento di�rio## de seu trabalho.
Toda vez que ele traz um peso de tomate maior que o 
estabelecido pelo regulamento do estado de S�o Paulo 
(50 quilos) deve pagar um multa de R$ 4,00 por quilo excedente.
Jo�o precisa que voc� fa�a um sistema que leia a vari�vel P (peso de tomates)
e verifique se h� excesso. Se houver, gravar na vari�vel E (Excesso) e 
na vari�vel M o valor da multa que Jo�o dever� pagar. Caso contr�rio
mostrar tais vari�veis com o conte�do ZERO.
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
		/* byte, char, short, int, long, float e double s�o 
		inicializadas como 0, e as vari�veis do tipo boolean 
		s�o inicializadas como false */
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
		System.out.println("O peso de tomate �: " + P + " kg\n");
		System.out.println("O peso de excedente �: " + E + " kg\n");
		System.out.println("A multa a ser paga �: R$" + M + " reais\n");
		read.close();
	}

}
