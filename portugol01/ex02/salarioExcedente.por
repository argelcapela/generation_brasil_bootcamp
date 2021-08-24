/*
2) Elabore um sistema que leia as variáveis C e N,
respectivamente código e número de horas trabalhadas
de um operário. 

E calcule o salário sabendo-se que ele
ganha R$ 10,00 por hora. 

Quando o número de horas exceder a 50

calcule o excesso de pagamento armazenando-o na variável E

, caso contrário zerar tal variável. 

A hora excedente de trabalho vale R$ 20,00. 

No final do processamento imprimir o salário 

total e o salário excedente.
*/
programa
{
	
	funcao inicio()
	{
	// variaveis
		inteiro C // código do operário
		real N // número de horas trabalhadas (hrs)
		real E // excesso de trabalho (hrs)
		real salario // salário de acordo com o número de horas trabalhadas - N < 50 - N * R$ 10,00/h
		real salarioExcedente // guardar o salário excedente - N > 50 - E * R$ 20,00/h
		
		E = 0.0
		N = 0.0
		salario = 0.0
		salarioExcedente = 0.0			
	// entrada
		escreva ("Bom dia Amigo(a)!\n")
		escreva ("Qual o seu código? ")
		leia (C)
		escreva ("Qual o seu número de horas trabalhadas? ")
		leia (N)		
	// processamento
		se (N <= 50) // quando o número de horas for menor ou igual a 50, calcula normal
		{
			salario = N * 10.00	// horas de trabalho * 10.00
		}
		senao // quando as horas de trabalho forem maiores que 50 então...
		{
			E = N - 50 // primeiro pega o excesso
			salarioExcedente = E * 20.00 // calcula o salário excedente
			salario = (50 * 10.00) + salarioExcedente // calcula o salário normal, + salario excedente
		}	
	// saída
		escreva ("\n")
		escreva ("O seu código é: #" + C)
		escreva ("\nA quantidade de horas trabalhadas é: " + N + " horas")
		escreva ("\nA quantidade de horas excessivas trabalhadas é: " + E + " horas\n")
		escreva ("\nO salário total é: R$ " + salario + " reais")
		escreva ("\nO salário excedente é: R$ " + salarioExcedente + " reais")
		escreva ("\n\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1473; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */