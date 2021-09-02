/*
7) Um sistema de equações lineares do tipo:
ax + by = c e dx + ey = f, pode ser resolvido 
segundo mostrado abaixo :
	Fórmula:
	x = (ce - bf) / (ae - bd)
	y = (af - cd) / (ae - bd)
Escreva um sistema que lê os coeficientes 
a,b,c,d,e e f e calcula e mostra os valores de x e y. 
*/
package ex07;

import java.util.Scanner;

public class equacoesLineares {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double d;
		double e;
		double f;
		double x;
		double y;
		Scanner read; 
				
		read = new Scanner(System.in);
		a = 0;
		b = 0;
		c = 0;
		d = 0;
		e = 0;
		f = 0;
		x = 0;
		y = 0;
		System.out.println("a: ");
		a = read.nextInt();
		System.out.println("b: ");
		b = read.nextInt();
		System.out.println("c: ");
		c = read.nextInt();
		System.out.println("d: ");
		d = read.nextInt();
		System.out.println("e: ");
		e = read.nextInt();
		System.out.println("f: ");
		f = read.nextInt();
		
		x = ((c * e)-(b * f))/((a * e)-(b * d));
		y = ((a * f)-(c * d))/((a * e)-(b * d));
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		read.close();
	}
}
