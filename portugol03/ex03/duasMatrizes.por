/*
 
3) Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:

a) Uma matriz M1 cujos elementos serão as somas dos elementos 
de mesma posição das matrizes N1 e N2;

b) Uma matriz M2 cujos elementos serão as diferenças dos elementos 
de mesma posição das matrizes N1 e N2.

*/
programa
{
	funcao inicio()
	{
	//vars
		inteiro N1[4][6]
		inteiro N2[4][6]
		inteiro M1[4][6]
		inteiro M2[4][6]
		inteiro x
		inteiro y

		x = 0
		y = 0		
	//input
		// ler matriz N1
		escreva ("Vamos começar a leitura da Matriz N1:\nQual o valor de...\n")
		enquanto (x < 4)
		{
			enquanto(y < 6)
			{
				escreva ("N1[", x,"][", y,"]: ou N1 linha:"+ (x + 1) +"  e coluna:",y + 1 + " : ")
				leia(N1[x][y])
				y++
			}
			escreva ("\n")
			y = 0
			x++	
		}

		// ler matriz N2
		x = 0
		y = 0
		escreva ("Vamos começar a leitura da Matriz N2:\nQual o valor de...\n")
		enquanto (x < 4)
		{
			enquanto(y < 6)
			{
				escreva ("N2[", x,"][", y,"]: ou N2 linha:"+ (x + 1) +"  e coluna:",y + 1 + " : ")
				leia(N2[x][y])
				y++
			}
			escreva ("\n")
			y = 0
			x++	
		}
		escreva ("\n")
	//processing and output
		// calcular e mostrar M1
		x = 0
		y = 0
		escreva("M1 (N1 + N2):\n")
		enquanto (x < 4)
		{
			enquanto(y < 6)
			{
				M1[x][y] = N1[x][y] + N2[x][y]
				escreva (M1[x][y], " ")
				y++
			}
			escreva ("\n")
			y = 0
			x++	
		}
		// calcular e mostrar M2
		x = 0
		y = 0
		escreva("\nM2 (N1 - N2):\n")
		enquanto (x < 4)
		{
			enquanto(y < 6)
			{
				M2[x][y] = N1[x][y] - N2[x][y]
				escreva (M2[x][y], " ")
				y++
			}
			escreva ("\n")
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
 * @POSICAO-CURSOR = 1414; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */