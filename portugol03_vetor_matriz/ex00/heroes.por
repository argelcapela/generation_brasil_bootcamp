programa
{
	funcao inicio()
	{
	//vars
		inteiro idHeroi
		cadeia carretaFuracao[6]
		inteiro pontos[6]
		cadeia resposta
	//input
		idHeroi = 0
		resposta = ""
		carretaFuracao[0] = "Fofão"
		carretaFuracao[1] = "Mickey"
		carretaFuracao[2] = "Capitão América"
		carretaFuracao[3] = "Popeye"
		carretaFuracao[4] = "Homem-Aranha"
		carretaFuracao[5] = "Lanterna Verde do Agreste[ED]"		
	//processing
		para (inteiro x = 0; x < 6; x++)
		{
			escreva("Herói: ", x + 1 ," - " , carretaFuracao[x], "\n")
			escreva("Avaliação: 1 - Iniciante , 2 - Em Desenvolvimento, 3 - Proeficiente, 4 - Avançado \n")
			leia(pontos[x])
		}

		escreva ("Qual Herói você quer saber o nível? (1 e 6)")
		leia(idHeroi)
		idHeroi -= 1
		
		se (pontos[idHeroi] == 1)
		{
			resposta = "Iniciante"	
		}
		senao se (pontos[idHeroi] == 2)
		{
			resposta = "Em Desenvolvimento"	
		}
		senao se (pontos[idHeroi] == 3)
		{
			resposta = "Proeficiente"	
		}
		senao se (pontos[idHeroi] == 4)
		{
			resposta = "Avançado"	
		}
	//ouput
		escreva("O personagem escolhido foi " + carretaFuracao[idHeroi] + " e o mesmo é " + resposta)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 292; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */