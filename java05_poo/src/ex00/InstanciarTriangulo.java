/*
		7) Receber valores de base e altura de um triângulo e 
		verificar se são valores válidos (positivos maiores que zero). 

		Em caso afirmativo, calcular a área do triângulo.
		(SEM USAR LAÇO DE REPETIÇÃO\SEM USAR VETOR NADA\ SÓ ORIENTAÇÃO A OBJETOS!)
*/
package ex00;

import java.util.Scanner;

public class InstanciarTriangulo 
{
	public static void main(String[] args) 
	{
				
				Triangulo t1;
				Triangulo t2;
				Double maiorArea;
				Scanner read;
				
				t1 = new Triangulo();
				maiorArea = 0.0;
				read = new Scanner(System.in);
				// input				
				System.out.println("Qual a base do Triângulo 1?");
				t1.base = read.nextDouble();
				System.out.println("Qual a altura do Triângulo 1?");
				t1.altura = read.nextDouble();
				t1.calcularArea();
				if (t1.area > maiorArea)
					maiorArea = t1.area;
				
				System.out.println("\n\n");
				
				t2 = new Triangulo();
				System.out.println("Qual a base do Triângulo 2?");
				t2.base = read.nextDouble();
				System.out.println("Qual a altura do Triângulo 2?");
				t2.base = read.nextDouble();
				t2.calcularArea();
				if (t2.area > maiorArea)
					maiorArea = t2.area;
				
				// output
				System.out.println("A maior área é: " + maiorArea);				
				read.close();
	}
}
