/*
2- Desenvolver um sistema que efetue a *soma de todos os n�meros �mpares* (%2 != 0) 

que s�o  m�ltiplos de tr�s (esse n�mero = 3 * alguma coisa || esse n�mero / 3 = n�mero exato)

e que se encontram no conjunto dos n�meros de 1 at� 500. (n pode ser menor que 1 ou maior que 500)

*/
package ex02;

import java.util.Scanner;

public class somaDeTodosOsNumerosImparesMultiplos3 {

	public static void main(String[] args) {
		//vars
			Scanner read;
			int somaNumerosImpares;
			
			somaNumerosImpares = 0;		
			read = new Scanner(System.in);
		//input, processing
			for (int nInicial = 1; nInicial <= 500; nInicial++)
			{
				if ((nInicial % 2 != 0) && (nInicial % 3 == 0))
				{
					somaNumerosImpares += nInicial;
				}
			}
		//output
			System.out.println("A soma �: " + somaNumerosImpares);	
			read.close();
	}

}
