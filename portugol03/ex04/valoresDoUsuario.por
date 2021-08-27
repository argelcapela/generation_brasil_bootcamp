/*
4)

A) Crie um programa que receba valores do usuário 
para preencher uma matriz 3X3,

B) e em seguida,exiba a soma dos valores 

C) dela e a soma dos valores da 
primeira diagonal, ou seja, diagonal principal.
*/
programa
{
	funcao inicio()
	{
	//vars
		inteiro x
		inteiro y
		inteiro valores[3][3]
		inteiro soma
		inteiro somaDiagonais

		x = 0
		y = 0
		soma = 0
		somaDiagonais = 0
	//input and processing
		escreva ("Insira os valores na matriz: \n")
		enquanto (x < 3)
		{
			enquanto (y < 3)
			{
				escreva("Matriz[", x,"][", y,"] : ")
				leia(valores[x][y])
					// soma os valores inseridos
					soma += valores[x][y]
					// soma as diagonais
					se (x == y)1
						somaDiagonais += valores[x][y]
				y++
			}
			escreva ("\n")
			y = 0
			x++
		}
	//ouput
		x = 0
		y = 0
		escreva ("Os valores inseridos pelo usuário são: \n")
		enquanto (x < 3)
		{
			enquanto (y < 3)
			{
				escreva(valores[x][y] + " ")
				y++
			}
			escreva ("\n")
			y = 0
			x++
		}
		escreva ("\n")
		escreva ("A soma de todos os valores é: " + soma +"\n")
		escreva ("A soma das diagonais principais é: " + somaDiagonais +"\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 719; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */