/*
5) Fa�a um sistema que leia as 3 notas de um aluno e 
calcule a m�dia final deste aluno. Considerar que
a m�dia � ponderada e que o peso das notas �: 2,3 e 5,
respectivamente.
*/
package ex05;

import java.util.Scanner;

public class mediaPonderada {
	
	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		double aluno1;
		double aluno2;
		double aluno3;
		double mediaPonderada;
		
		aluno1 = 0;
		aluno2 = 0;
		aluno3 = 0;
		mediaPonderada = 0;
		System.out.println("Aluno 1: ");
		aluno1 = read.nextDouble();
		System.out.println("Aluno 2: ");
		aluno2 = read.nextDouble();
		System.out.println("Aluno 3: ");
		aluno3 = read.nextDouble();
		mediaPonderada = ((aluno1 * 2) + (aluno2 * 3) + (aluno3 * 5)) / 10;
		System.out.println("A m�dia ponderada �: " + mediaPonderada);
		read.close();
	}
}
