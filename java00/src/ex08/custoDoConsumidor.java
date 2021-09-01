/*
8. O custo ao consumidor de um carro novo é a soma do 
custo de fábrica com a percentagem do distribuidor 
e dos impostos (aplicados ao custo de fábrica).
Supondo que a percentagem do distribuidor seja de 28% 
e os impostos de 45%, escrever um sistema que leia o 
custo de fábrica de um carro e escreva o custo ao
consumidor.
*/
package ex08;

import java.util.Scanner;

public class custoDoConsumidor {
	public static void main(String[] args)
	{
		double custoDeFabrica;
		double porcenDistribuidor;
		double porcenImpostos;
		double custoAoConsumidor;
		Scanner read;
		
		read = new Scanner(System.in);
		custoDeFabrica = 0;
		porcenDistribuidor = 0;
		porcenImpostos = 0;
		custoAoConsumidor = 0;
		System.out.println("Qual o custo de fabrica?");
		custoDeFabrica = read.nextDouble();
		porcenDistribuidor = custoDeFabrica * 0.28;
		porcenImpostos = custoDeFabrica * 0.45;
		custoAoConsumidor = custoDeFabrica + porcenDistribuidor + porcenImpostos;
		System.out.println("O custo ao consumidor é: " + custoAoConsumidor);
		read.close();
	}
}
