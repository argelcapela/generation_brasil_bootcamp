programa
{	
	funcao inicio()
	{
		inteiro entradaDias
		inteiro qtdAnos
		inteiro qtdMeses
		inteiro qtdDias		
		inteiro idade

		escreva ("Qual a sua idade em dias BROTHER? \n")
		leia (entradaDias)
		
		qtdAnos = entradaDias / 365
		entradaDias -= qtdAnos * 365

		se (entradaDias <= 31)
		{
			qtdMeses = 0
			qtdDias = entradaDias
		}
		senao
		{
			qtdMeses = entradaDias / 30
			entradaDias -= qtdMeses * 30
			qtdDias = entradaDias
		}
		
		escreva ("BROTHER, JÁ CALCULEII!\n\n")
		escreva ("Idade em anos: " + qtdAnos)
		escreva ("\nIdade em meses: " + qtdMeses)
		escreva ("\nIdade em dias: " + qtdDias)			 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 289; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */