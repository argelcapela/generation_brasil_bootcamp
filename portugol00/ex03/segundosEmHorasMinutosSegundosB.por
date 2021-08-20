programa
{	
	funcao inicio()
	{
		inteiro tempoEmSegundos
		inteiro horas
		inteiro minutos
		inteiro segundos

		escreva ("Entre com a quantidade de tempo? ")
		leia (tempoEmSegundos)		
		horas = tempoEmSegundos / 3600
		minutos = (tempoEmSegundos % 3600) / 60
		segundos = (tempoEmSegundos % 3600) % 60		
		escreva ("Horas: " + horas)
		escreva ("\nMinutos: " + minutos)
		escreva ("\nSegundos: " + segundos)	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 301; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */