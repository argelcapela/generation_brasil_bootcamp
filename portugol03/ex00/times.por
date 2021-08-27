/*
times[]
SPFC
SANTOS
PALMEIRAS
CORINTHIANS
pontos[] - inteiros
rode os times e pergunte:
G-ganhou, P-Perdeu ou E-empatou:
g=3, p=0, e=1
3 rodadas com todos os times
ao final mostra o nome de cada time E total de pontos
*/
programa
{
	funcao inicio()
	{
	//vars
		cadeia times[4]
		inteiro pontos[4]
		caracter resultado
		inteiro x
		inteiro y

		times[0] = "SPFC"
		times[1] = "SANTOS"
		times[2] = "PALMEIRAS"
		times[3] = "CORINTHIANS"

		pontos[0] = 0
		pontos[1] = 0
		pontos[2] = 0
		pontos[3] = 0
		
		x = 0
		y = 0
	//input and processing
		enquanto (x < 3)
		{
			escreva ("\n\nRodada número #" + (x + 1) + ":\n")
			escreva ("Quais foram os resultados dos times?\n") 
			escreva ("G=Ganhou(3pts) | P=Perdeu(0pts) | E=Empatou(1pts)\n")
			enquanto (y < 4)
			{
				escreva (times[y], ":")
				leia (resultado)
				se (resultado == 'G' ou resultado == 'g')
				{
					pontos[y] += 3
				}
				senao se (resultado == 'P' ou resultado == 'p')
				{
					pontos[y] += 0
				}
				senao se (resultado == 'E' ou resultado == 'e')
				{
					pontos[y] += 1
				}
				senao
				{
					escreva ("Opção Inválida!")
				}				
				y++
			}
			y = 0
			x++
		}
	//output
		x = 0
		escreva ("\nPLACAR:\n")
		escreva ("Time		   Pontos")
		enquanto (x < 4)
		{
			escreva ("\n",times[x], "                 ", pontos[x])
			x++			
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1234; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */