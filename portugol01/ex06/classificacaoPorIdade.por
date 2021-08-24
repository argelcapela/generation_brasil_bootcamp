/*
Elabore um sistema que dada a idade de um nadador 
classifique-o em uma das seguintes categorias:
Infantil A = 5 a 7 anos
Infantil B = 8 a 11 anos
Juvenil A = 12 a 13 anos
Juvenil B = 14 a 17 anos
*/

programa
{	
	funcao inicio()
	{
	// variáveis
		inteiro idadeNadador
	// entrada
		escreva ("Olá!\n")
		escreva ("Qual a sua idade? ")
		leia (idadeNadador)
	// processamento e saída
		se (idadeNadador >= 5 e idadeNadador <= 7)
		{
			escreva ("\nA sua classificação é Infantil A\n")
		}
		senao se (idadeNadador >= 8 e idadeNadador <= 11)
		{
			escreva ("\nA sua classificação é Infantil B\n")
		}
		senao se (idadeNadador >= 12 e idadeNadador <= 13)
		{
			escreva ("\nA sua classificação é Juvenil A\n")
		}
		senao se (idadeNadador >= 14 e idadeNadador <= 17)
		{
			escreva ("\nA sua classificação é Juvenil B\n")
		}	
		senao se (idadeNadador >= 18)
		{
			escreva ("\nA sua classificação é Adultos\n")
		}	
		senao
		{
			escreva ("\nVocê não pode participar!\n")
		}		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 918; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */