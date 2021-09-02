programa
{
	/* se negativo -> erro
	   se impar -> número é impar
	   se par -> número é par
	*/
	funcao inicio()
	{
	// variaveis
		inteiro n

	// entrada
		escreva("Digite o número: ")
		leia (n)

	// processamento e saída
		se (n < 0)
		{
			escreva ("Erro, 0 número é negativo!")
		}
		senao se (n == 0)
		{
			escreva ("O Zero é Neutro")
		}
		senao se ((n % 2) == 0)
		{
			escreva ("O número é par!")
		}
		senao
		{
			escreva ("O número é impar!")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 470; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */