/*
1) João, homem de bem, comprou um microcomputador 
para controlar o ##rendimento diário## de seu trabalho.
Toda vez que ele traz um peso de tomate maior que o 
estabelecido pelo regulamento do estado de São Paulo 
(50 quilos) deve pagar um multa de R$ 4,00 por quilo excedente.
João precisa que você faça um sistema que leia a variável P (peso de tomates)
e verifique se há excesso. Se houver, gravar na variável E (Excesso) e 
na variável M o valor da multa que João deverá pagar. Caso contrário
mostrar tais variáveis com o conteúdo ZERO.
*/
programa
{	
	funcao inicio()
	{
	// variaveis		
		real P //pesoDeTomate
		real E // excesso
		real M // multa

		E = 0.0 // inicia variável com valor 0 (0.0 porque é do tipo real)
		M = 0.0 // inicia variável com valor 0 (0.0 porque é do tipo real)
	// entrada
		escreva ("Qual o peso de tomates amigo? ")
		leia (P) // ler o peso kg
	// processamento
		se (P > 50) // se o peso for maior que 50, então vamos ter um excesso!
		{
			E = P - 50 // o excesso é igual pesoDeTomate - 50
		}
		senao // caso o pesoDeTomate seja menor do que 50, então tá td certinho, sem multas
		{
			E = 0.0
		}
		M = E * 4.00 // para cada kg de excesso, são R$ 4.00 reais
	//saida
		escreva ("O peso de tomate é: " + P + " kg\n")	
		escreva ("O peso excedente é: " + E + " kg\n")	
		escreva ("A multa a ser paga é: R$ " + M + " reais\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1203; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */