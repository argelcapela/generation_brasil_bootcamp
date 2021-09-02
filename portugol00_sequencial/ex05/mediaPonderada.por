/*
5) Faça um sistema que leia as 3 notas de um aluno e 
calcule a média final deste aluno. Considerar que
a média é ponderada e que o peso das notas é: 2,3 e 5,
respectivamente.
*/
programa
{	
	funcao inicio()
	{
		real aluno1
		real aluno2
		real aluno3
		real media

		escreva ("Aluno 1: ")
		leia (aluno1)
		escreva ("Aluno 2: ")
		leia (aluno2)
		escreva ("Aluno 3: ")
		leia (aluno3)		
		media = ((aluno1 * 2) + (aluno2 * 3) + (aluno3 * 5)) / 10
		escreva ("A média ponderada é: " + media)		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 181; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */