// 2) Faça um programa que entre com três números e coloque em ordem crescente.

package ex01;

import java.util.Scanner;

public class tresNumerosEmOrdemCrescente {

	public static void main(String[] args) {
		//vars
		int n1;
		int n2;
		int n3;
		int aux;
		Scanner read;
		//input
		read = new Scanner(System.in);			
		System.out.println("Insira o número #1:");
		n1 = read.nextInt();
		System.out.println("Insira o número #2:");
		n2 = read.nextInt();
		System.out.println("Insira o número #3:");
		n3 = read.nextInt();
		//processing
		// algoritmo chato de entender kkkkk mas super simples!!!! kkkkk
		
		if (n1 > n2)
		{
			aux = n1;
			n1 = n2;
			n2 = aux; 
		}
		if (n2 > n3)
		{
			aux = n2;
			n2 = n3;
			n3 = aux;
		}
		if (n1 > n2)
		{
			aux = n1;
			n1 = n2;
			n2 = aux; 
		}
	
		//output
		System.out.printf("[%d, %d, %d]", n1, n2, n3);
		read.close();
	}

}
