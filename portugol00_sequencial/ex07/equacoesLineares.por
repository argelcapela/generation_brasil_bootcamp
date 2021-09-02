/*
7) Um sistema de equações lineares do tipo:
ax + by = c e dx + ey = f, pode ser resolvido 
segundo mostrado abaixo :
	Fórmula:
	x = (ce - bf) / (ae - bd)
	y = (af - cd) / (ae - bd)
Escreva um sistema que lê os coeficientes 
a,b,c,d,e e f e calcula e mostra os valores de x e y. 
*/
programa
{
	funcao inicio()
	{
		real a
		real b
		real c
		real d
		real ee
		real f
		real x
		real y

		escreva ("a: ")
		leia (a)
		escreva ("b: ")
		leia (b)
		escreva ("c: ")
		leia (c)
		escreva ("d: ")
		leia (d)
		escreva ("e: ")
		leia (ee)
		escreva ("f: ")
		leia (f)
		
		x = ((c*ee)-(b*f))/((a*ee)-(b*d))
		y = ((a*f)-(c*d))/((a*ee)-(b*d))
		escreva ("x: " + x)
		escreva ("\ny: " + y)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 127; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */