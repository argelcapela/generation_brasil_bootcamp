/*
Elabore um sistema que dada a idade de um nadador 
classifique-o em uma das seguintes categorias:
Infantil A = 5 a 7 anos
Infantil B = 8 a 11 anos
Juvenil A = 12 a 13 anos
Juvenil B = 14 a 17 anos
*/
package ex02;

import java.util.Scanner;

public class classificacaoPorIdade {

	public static void main(String[] args) {
		int idadeNadador;
		Scanner read;
		
		read = new Scanner(System.in);
		System.out.println("Olá!\n Qual a sua idade ?");
		idadeNadador = read.nextInt();
		
		if (idadeNadador >= 10 && idadeNadador <= 14)
		{
			System.out.println("A sua classificação é Infantil");
		}
		else if (idadeNadador >= 15 && idadeNadador <= 17)
		{
			System.out.println("A sua classificação é Juvenil");
		}
		else if (idadeNadador >= 18 && idadeNadador <= 25)
		{
			System.out.println("A sua classificação é Adulto!");
		}
		else
		{
			System.out.println("Você não pode participar!");
		}
		read.close();
	}

}
