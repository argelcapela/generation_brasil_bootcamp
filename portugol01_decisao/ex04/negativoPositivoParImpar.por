/*
4) Faça um sistema que leia um número inteiro 
e mostre uma mensagem indicando se este número
é par ou ímpar, e se é positivo ou negativo.
*/
programa
{	
	funcao inicio()
	{
	// var
		inteiro n
	// input
		escreva ("Olá!\n")
		escreva ("Qual o número? ")
		leia (n)
	// process and ouput
		escreva ("\nO número inserido é: " + n)
		se (n < 0)
		{
		      escreva ("\n\nEsse número é negativo e ")
		      parOuImpar(n)
		      
		}
		senao
		{
			 escreva ("\n\nEsse número é positivo e ")
		      parOuImpar(n)
		}		
	}
	// função auxiliar para nos retornar se um número é par ou impar
	funcao parOuImpar(inteiro n)
	{
		se ((n*-1) % 2 == 0) // transforma o número negativo em positivo // pega o resto da divisão por 2
				escreva ("par\n\n") // resto == 0
		senao
		      	escreva ("impar\n\n") // resto diferente de 0	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 829; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */