/*
2) Elabore um sistema que leia as vari�veis C e N,
respectivamente c�digo e n�mero de horas trabalhadas
de um oper�rio. 

E calcule o sal�rio sabendo-se que ele
ganha R$ 10,00 por hora. 

Quando o n�mero de horas exceder a 50

calcule o excesso de pagamento armazenando-o na vari�vel E

, caso contr�rio zerar tal vari�vel. 

A hora excedente de trabalho vale R$ 20,00. 

No final do processamento imprimir o sal�rio 

total e o sal�rio excedente.
*/
package ex02;

import java.util.Scanner;

public class salarioExcedente {

	public static void main(String[] args) {
		int C;
		double N;
		double E;
		double salario;
		double salarioExcedente;
		Scanner read;
		
		salarioExcedente = 0;
		salario = 0;
		N = 0;
		E = 0;
		read = new Scanner(System.in);
		System.out.println("Bom Dia Amigo");
		System.out.println("Qual o seu c�digo?");
		C = read.nextInt();
		System.out.println("Qual o seu n�mero de horas trabalhadas?");
		N = read.nextDouble();
		if (N <= 50)
		{
			salario = N * 10;
		}
		else
		{
			E = N - 50;
			salarioExcedente = E * 20;
			salario = (50 * 10) + salarioExcedente;
		}
		System.out.println("O seu c�digo �: #" + C);
		System.out.println("A quantidade de horas trabalhadas �: " + N + " horas");
		System.out.println("A quantidade de horas excessivas trabalhadas �: " + E + " horas");
		System.out.println("O sal�rio total �: R$ " + salario + " reais");
		System.out.println("O sal�rio excedente �: R$ " + salarioExcedente + " reais");
		read.close();
	}

}
