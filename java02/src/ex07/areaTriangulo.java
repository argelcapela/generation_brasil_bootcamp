/*
7) Receber valores de base e altura de um tri�ngulo e 
verificar se s�o valores v�lidos (positivos maiores que zero). 

Em caso afirmativo, calcular a �rea do tri�ngulo.
*/
package ex07;

import java.util.Scanner;

public class areaTriangulo {

	public static void main(String[] args) {
		// vars
		Scanner read;
		double base;
		double altura;
		double areaTriangulo;
		// input
		read = new Scanner(System.in);
		System.out.println("Qual a base do Tri�ngulo?");
		base = read.nextDouble();
		System.out.println("Qual a altura do Tri�ngulo?");
		altura = read.nextDouble();
		// processing
		if (base < 0 || altura < 0)
		{
			System.out.println("Por, insira valores v�lidos1 (Positivos maiores que zero!)");
		}
		else
		{
			areaTriangulo = (base * altura) / 2;
			// output
			System.out.println("A base do Tri�ngulo �: " + base);
			System.out.println("A altura do Tri�ngulo �: " + altura);
			System.out.println("A �rea do Tri�ngulo �: " + areaTriangulo);
		}
		read.close();
	}
}
