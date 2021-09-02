/*
1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, 
coletando dados sobre o sal�rio e n�mero de filhos. A prefeitura deseja saber:   
a) m�dia do sal�rio da popula��o; 
b) m�dia do n�mero de filhos; 
c) maior sal�rio; [vai comparando e muda o valor da variavel]
d) percentual de pessoas com sal�rio at� R$100,00. 
[regra de tres + contador para p com s maior que 100]
*/
package ex01;

import java.util.Scanner;

public class pesquisaDaPrefeitura {

	public static void main(String[] args) {
		//vars
			Scanner read;
			double mediaSalarioPopulacao;
			double mediaNumeroDeFilhos;
			double maiorSalario;
			double porcenSalarioAteCem;
			double temp;
			int qtdPessoas;
			
			mediaSalarioPopulacao = 0;
			mediaNumeroDeFilhos = 0;
			maiorSalario = 0;
			porcenSalarioAteCem = 0;
			temp = 0;
			qtdPessoas = 3;
			read = new Scanner(System.in);
		//input
			System.out.println("Ol�!");
			for (int i = 1; i <= qtdPessoas; i++)
			{
				System.out.println("Funcion�rio #" + i);
				System.out.println("N�mero de Filhos: ");
				temp = read.nextDouble();
				mediaNumeroDeFilhos += temp;
				System.out.println("Sal�rio: R$ ");
				temp = read.nextDouble();
				mediaSalarioPopulacao += temp;
				
				//processing
					if (temp > maiorSalario)
							maiorSalario = temp;
					
					if (temp <= 100)
						porcenSalarioAteCem++;
			}
			mediaNumeroDeFilhos /= qtdPessoas;
			mediaSalarioPopulacao /= qtdPessoas;
			porcenSalarioAteCem = (porcenSalarioAteCem * 100) / qtdPessoas;
		//output	
			System.out.println("Resultado da Pesquisa");
			System.out.printf("a) M�dia do sal�rio da popula��o						: R$ %.2f reais \n", mediaSalarioPopulacao);
			System.out.printf("b) m�dia do n�mero de filhos							: %.2f filhos \n", mediaNumeroDeFilhos);
			System.out.printf("c) maior sal�rio								: R$ %.2f reais \n", maiorSalario);
			System.out.printf("d) percentual de pessoas com sal�rio at� R$ 100,00				: %.2f" , porcenSalarioAteCem);
			System.out.print("%");
			read.close();
	}

}
