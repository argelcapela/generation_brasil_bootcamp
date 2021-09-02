/*
7) Receber valores de base e altura de um triângulo e 
verificar se são valores válidos (positivos maiores que zero). 

Em caso afirmativo, calcular a área do triângulo.
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
		System.out.println("Qual a base do Triângulo?");
		base = read.nextDouble();
		System.out.println("Qual a altura do Triângulo?");
		altura = read.nextDouble();
		// processing
		if (base < 0 || altura < 0)
		{
			System.out.println("Por, insira valores válidos1 (Positivos maiores que zero!)");
		}
		else
		{
			areaTriangulo = (base * altura) / 2;
			// output
			System.out.println("A base do Triângulo é: " + base);
			System.out.println("A altura do Triângulo é: " + altura);
			System.out.println("A área do Triângulo é: " + areaTriangulo);
		}
		read.close();
	}
}
