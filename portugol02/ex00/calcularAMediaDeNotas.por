/*
ler nomeDeUmAluno
qual o seu pronome?
ler nota1-5
mostrar a média
estado de aprovação
> 5 aprovado
<= 5 recuperação
*/

programa
{
	funcao inicio()
	{
	// vars
		real mediaNotas
		caracter pronome
		inteiro i
		real temp
		inteiro qtdNotas
		logico aprovado

		mediaNotas = 0.0
		temp = 0.0
		i = 1
		qtdNotas = 5

		escreva ("Qual o seu pronome? \n (o = ele | a = ela | e = elu) : ")
		leia (pronome)
		se (pronome == 'o' ou pronome == 'a' ou pronome == 'e')
		{
			// input and processing
				enquanto (i <= qtdNotas)
				{
					// somatório das notas inseridas
					escreva ("Nota #" + i +": ")
					leia(temp)
					mediaNotas += temp
					i++
				}
				mediaNotas /= qtdNotas
				se (mediaNotas > 5)
					aprovado = verdadeiro
				senao
					aprovado = falso
				
			// output
				escreva ("\nA Média é: " + mediaNotas + "\n")		
				se (aprovado)
					escreva ("Você foi aprovad" + pronome)
				senao
					escreva ("Você foi reprovad" + pronome)	
				escreva ("!\n\n")
		}		
		senao
		{
			escreva ("Pronome Inválido!")
		}
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 969; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */