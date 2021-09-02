programa
{	
	funcao inicio()
	{
		inteiro idade
		inteiro anoDeNascimento
		
		escreva("Qual o ano de nascimento? ")
		leia (anoDeNascimento)

		idade = 2021 - anoDeNascimento
		escreva ("Sua idade é: " + idade + " anos\n")		
		se (idade > 45)
		{
			escreva ("\nVocê é Cringe!")	
		}
		senao
		{
			escreva ("\nVocê não é Cringe!")
		}
		escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 226; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */