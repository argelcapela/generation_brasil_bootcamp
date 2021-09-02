/*
2- Desenvolver um sistema que efetue a *soma de todos os números ímpares* (%2 != 0) 

que são  múltiplos de três (esse número = 3 * alguma coisa || esse número / 3 = número exato)

e que se encontram no conjunto dos números de 1 até 500. (n pode ser menor que 1 ou maior que 500)

*/
programa
{
	funcao inicio()
	{
	//vars
		inteiro somaNumerosImpares

		somaNumerosImpares = 0
	//processing
		para (inteiro nInicial = 1; nInicial <= 500; nInicial++)
		{
			// se módulo de um número por 2 é diferente de zero -> logo ele é ímpar
			// se módulo de um número por 3 é igual a zero -> logo ele é múltiplo de 3
			se ((nInicial % 2 != 0) e (nInicial % 3 == 0)) 
			{
				somaNumerosImpares += nInicial // somo cada número que atende a condição impar e múltiplo de 3					
			}
		}
	//output
		escreva ("A soma é: " + somaNumerosImpares) // exibir bonitinho		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 801; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */