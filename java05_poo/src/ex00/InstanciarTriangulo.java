/*
		7) Receber valores de base e altura de um tri�ngulo e 
		verificar se s�o valores v�lidos (positivos maiores que zero). 

		Em caso afirmativo, calcular a �rea do tri�ngulo.
		(SEM USAR LA�O DE REPETI��O\SEM USAR VETOR NADA\ S� ORIENTA��O A OBJETOS!)
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
				System.out.println("Qual a base do Tri�ngulo 1?");
				t1.base = read.nextDouble();
				System.out.println("Qual a altura do Tri�ngulo 1?");
				t1.altura = read.nextDouble();
				t1.calcularArea();
				if (t1.area > maiorArea)
					maiorArea = t1.area;
				
				System.out.println("\n\n");
				
				t2 = new Triangulo();
				System.out.println("Qual a base do Tri�ngulo 2?");
				t2.base = read.nextDouble();
				System.out.println("Qual a altura do Tri�ngulo 2?");
				t2.base = read.nextDouble();
				t2.calcularArea();
				if (t2.area > maiorArea)
					maiorArea = t2.area;
				
				// output
				System.out.println("A maior �rea �: " + maiorArea);				
				read.close();
	}
}
