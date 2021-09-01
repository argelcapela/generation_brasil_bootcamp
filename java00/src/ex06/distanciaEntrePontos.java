/*
6) Construa um programa em c que, tendo como dados de 
entrada dois pontos quaisquer no plano, P(x1, y1) e 
P(x2, y2), escreva a distância entre eles.
*/
package ex06;

import java.util.Scanner;

public class distanciaEntrePontos {
	public static void main(String[] args) {
		double x1;
		double x2;
		double y1;
		double y2;
		double d;
		Scanner read;
		
		read = new Scanner(System.in);
		x1 = 0;
		x2 = 0;
		y1 = 0;
		y2 = 0;
		System.out.println("x1: ");
		x1 = read.nextInt();
		System.out.println("x2: ");
		x2 = read.nextInt();
		System.out.println("y1: ");
		y1 = read.nextInt();
		System.out.println("y2: ");
		y2 = read.nextInt();
		d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		System.out.printf("A distância entre os pontos é %.2f", d); // Stack disse que f é usado para float ou double!
		read.close();
	}
}
