programa
{
	inclua biblioteca Matematica
	funcao inicio()
	{
		real A
		real B
		real C
		real D
		real R
		real S

		escreva ("Número A: \n")
		leia (A)
		escreva ("Número B: \n")
		leia (B)
		escreva ("Número C: \n")
		leia (C)
		
		R = Matematica.potencia((A + B),2.0)		
		S = Matematica.potencia((B + C),2.0)
		D = (R + S) / 2

		escreva ("R = "+R)
		escreva ("\nD = "+D)
		escreva ("\nS = "+S)		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 270; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */