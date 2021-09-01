/*CELCIUS PARA FAREH
PAR: FARENHEIGHT PARA CELCIUS
O NOME DA PESSOA
MOSTRE O NOME DA PESSOA MAIS A TEMPERATURA CONVERTIDA*/

package ex00;

import java.util.Scanner;

public class farenCelsius {
	public static void main(String[] args)
	{
		// vars
		Scanner leia = new Scanner(System.in);
		String nome;
		double farenheit; // fuja do float
		double celsius;
		int op;
		
		farenheit = 0;
		celsius = 0;
		// input
		System.out.println("Olá! \n Qual o seu nome ?");
		nome = leia.next();
		System.out.printf("1) Converter de Farenheit para Celsius!\n");
		System.out.printf("2) Converter de Celsius para Farenheit!\n");
		op = leia.nextInt();		
		
		try 
		{
			// op 1
			if (op == 1)
			{
				// input
				System.out.println("Qual a temperatura em Farenheit?");
				farenheit = leia.nextDouble();
				// process
				celsius = (farenheit - 32) / 1.8;
				// out
				System.out.println(nome + ", A temperatura convertida para Celsius é: " + celsius + "°");
				
			} // op 2
			else if (op == 2)
			{
				System.out.println("Qual a temperatura em Celsius?");
				celsius = leia.nextDouble();
				// process
				farenheit = (farenheit * 1.8) + 32;
				// out
				System.out.println(nome + " ,A temperatura convertida para Farenheit é: " + farenheit + "°");
			}
			else
			{
				System.out.printf("Opção Inválida, até breve!");
			}
		}catch(Exception e)
		{
			System.out.printf("Opção Inválida, até breve!");
		}
		leia.close();
		}		
	}

