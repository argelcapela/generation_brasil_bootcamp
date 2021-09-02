/*
2) Elabore um sistema que leia as variáveis C e N,
respectivamente código e número de horas trabalhadas
de um operário. 

E calcule o salário sabendo-se que ele
ganha R$ 10,00 por hora. 

Quando o número de horas exceder a 50

calcule o excesso de pagamento armazenando-o na variável E

, caso contrário zerar tal variável. 

A hora excedente de trabalho vale R$ 20,00. 

No final do processamento imprimir o salário 

total e o salário excedente.
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
		System.out.println("Qual o seu código?");
		C = read.nextInt();
		System.out.println("Qual o seu número de horas trabalhadas?");
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
		System.out.println("O seu código é: #" + C);
		System.out.println("A quantidade de horas trabalhadas é: " + N + " horas");
		System.out.println("A quantidade de horas excessivas trabalhadas é: " + E + " horas");
		System.out.println("O salário total é: R$ " + salario + " reais");
		System.out.println("O salário excedente é: R$ " + salarioExcedente + " reais");
		read.close();
	}

}
