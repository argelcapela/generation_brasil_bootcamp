/*
 	Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.
*/
programa
{	
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
	// variaveis
		real n1
		real n2
		real n3
		real qn3 // variável para guardar o quadrado do n3
		real n4

		qn3 = 0.0	// inicia ela para não bugar na frente	
	// entrada
		escreva ("Olá!\n")
		escreva ("Qual o valor do número 1: ")
		leia (n1)
		escreva ("Qual o valor do número 2: ")
		leia (n2)
		escreva ("Qual o valor do número 3: ")
		leia (n3)
		escreva ("Qual o valor do número 4: ")
		leia (n4)
	// processamento e saida	juntos
		escreva ("\n")
		qn3 = mat.potencia(n3,2.0) // pega o quadrado(potência) do n3 e guarda em qn3
		se (qn3 >= 1000) // se o resultado do quadrado de n3 for maior que 1000 então...
		{
			escreva ("O valor do n3 é: " + qn3 + " \nprograma finalizado!!\n")
		}
		senao // caso contrário, exibe todos os valores e seus quadrados, bonitinho
		{
			escreva ("Valor do n1 é: " + n1 + ", seu quadrado é: " + mat.potencia(n1, 2.0))
			escreva ("\nValor do n2 é: " + n2 + ", seu quadrado é: " + mat.potencia(n2, 2.0))
			escreva ("\nValor do n3 é: " + n3 + ", seu quadrado é: " + mat.potencia(n3, 2.0))
			escreva ("\nValor do n4 é: " + n4 + ", seu quadrado é: " + mat.potencia(n4, 2.0))
		}
		escreva ("\n\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1105; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */