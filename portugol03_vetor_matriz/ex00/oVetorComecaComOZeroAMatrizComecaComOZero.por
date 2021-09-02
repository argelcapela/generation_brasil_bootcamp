programa
{
	funcao inicio()
	{
	// vars
		cadeia nomes[2][2]
		inteiro x
		inteiro y
	// input
		x = 0
		y = 0
		enquanto (x < 2)
		{
			enquanto (y < 2)
			{
				escreva("Nomes[",x,"][",y,"] : ")
				leia(nomes[x][y])
				y++
			}	
			escreva("\n")
			y = 0
			x++
		}
	// output
		x = 0
		y = 0
		escreva ("\nOs nomes são: \n")
		enquanto (x < 2)
		{
			enquanto (y < 2)
			{
				escreva(nomes[x][y] + "  ")
				y++
			}	
			escreva("\n")
			y = 0
			x++
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 84; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */