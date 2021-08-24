/*
5) A Secretaria de Meio Ambiente que controla o 
índice de poluição mantém 3 grupos de indústrias 
que são altamente poluentes do meio ambiente.

O índice de poluição aceitável varia de 0,05 até 0,25.

Se o índice sobe para 0,3 as indústrias do 1º grupo são 
intimadas a suspenderem suas atividades, 

se o índice crescer para 0,4 as industrias do 1º e 2º grupo são intimadas a suspenderem 
suas atividades,

se o índice atingir 0,5 todos os grupos devem ser notificados a paralisarem suas atividades. 

Faça um sistema que leia o índice de poluição medido e emita a notificação adequada aos diferentes 
grupos de empresas.

// Índice aceitável
0.5 todos fechem agora
0.4 1 e 2 fecha agora
0.3 grupo 1 fecha agora
...
0.25
*/

programa
{	
	funcao inicio()
	{
	// variáveis	
		real ipa // Índice de Poluição Aceitável
		inteiro ng // Número do grupo

		ipa = 0.0		
	// entrada
		escreva ("Bem Vindo ao Poluômetro:\n")
		escreva ("Por favor, informe o seu índice de poluição!\n")
		leia (ipa)
	// processamento e saída
		escreva ("\nA notificação do Poluômetro é a seguinte: \n")		
		se (ipa >= 0.3 e ipa < 0.4) // ipa entre 0.3 e 0.4
		{
			escreva ("As indústrias do 1º grupo devem suspender suas atividades, imediatamente!")
		}
		senao se (ipa >= 0.4 e ipa < 0.5) // ipa entre 0.4 e 0.5
		{
			escreva ("As indústrias dos grupo 1 e 2 devem suspender suas atividades, imediatamente!")
		}
		senao se (ipa >= 0.5) // ipa 0.5 em diante
		{
			escreva ("As indústrias de todos os grupos devem encerrar as suas atividades, IMEDIATAMENTE!")
		}
		senao
		{
			se (ipa >= 0.25 e ipa < 0.5) // ipa entre 0.25 e 0.5 é o interválo seguro			
				escreva ("Está tudo bem!")
			senao			
				escreva ("Valor inválido!")
		}
		escreva ("\n\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1268; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */