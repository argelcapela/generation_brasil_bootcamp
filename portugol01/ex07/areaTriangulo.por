/*
7) Receber valores de base e altura de um triângulo e 
verificar se são valores válidos (positivos maiores que zero). 

Em caso afirmativo, calcular a área do triângulo.
*/
programa
{	
	funcao inicio()
	{
	// variáveis
		real base
		real altura
		real areaTriangulo
	// entrada
		escreva ("Qual a base do Triângulo? ")
		leia (base)
		escreva ("Qual a altura do Triângulo? ")
		leia (altura)
		escreva("\n\n")
	// processamento
		se (base < 0 ou altura < 0)
		{
			escreva ("Por favor, insira valores válidos! (Positivos, maiores que zero!)\n")
		}
		senao
		{
		areaTriangulo = (base * altura) / 2
	// saída
		escreva ("A base do Triângulo é: " + base)
		escreva ("\nA altura do Triângulo é: " + base+"\n")
		escreva ("\nA área do Triângulo é: " + areaTriangulo+"\n\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 550; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */