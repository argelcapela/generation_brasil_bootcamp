programa
{	
	funcao inicio()
	{
		inteiro entradaSegundos
		inteiro qtdHoras
		inteiro qtdMinutos
		inteiro qtdSegundos	

		escreva ("Qual a quantidade de segundos BROTHER? \n")
		leia (entradaSegundos)
		
		qtdHoras = entradaSegundos / 3600
		entradaSegundos -= qtdHoras * (60 * 60)

		se (entradaSegundos <= 60)
		{
			qtdMinutos = 0
			qtdSegundos = entradaSegundos
		}
		senao
		{
			qtdMinutos = entradaSegundos / 60
			entradaSegundos -= qtdMinutos * 60
			qtdSegundos = entradaSegundos
		}
		
		escreva ("BROTHER, JÁ CALCULEII!\n\n")
		escreva ("Horas: " + qtdHoras)		
		escreva ("\n Minutos: " + qtdMinutos)
		escreva ("\n Segundos: " + qtdSegundos)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 283; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */