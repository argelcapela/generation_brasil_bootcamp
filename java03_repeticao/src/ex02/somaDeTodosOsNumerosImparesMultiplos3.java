/*
2- Desenvolver um sistema que efetue a *soma de todos os números ímpares* (%2 != 0) 

que são  múltiplos de três (esse número = 3 * alguma coisa || esse número / 3 = número exato)

e que se encontram no conjunto dos números de 1 até 500. (n pode ser menor que 1 ou maior que 500)

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
			System.out.println("A soma é: " + somaNumerosImpares);	
			read.close();
	}

}
