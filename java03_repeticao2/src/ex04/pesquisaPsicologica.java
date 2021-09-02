/*
	4)Uma empresa desenvolveu uma pesquisa para saber as características 
	psicológicas dos indivíduos de uma região. Para tanto, a 
	
	cada uma das pessoas era perguntado: 
	(150 pessoas para perguntar)
		->idade, 
		->sexo (1-feminino / 2-masculino / 3-Outros), 
		-> e as opções (1, se a pessoa era calma; 
						2, se a pessoa era nervosa e 
						3, se a pessoa era agressiva).
	 
	 Pede-se para elaborar um sistema que permita ler os dados de [150 pessoas], 
	 calcule e mostre:
	
		-> o número de pessoas calmas; 
		-> o número de mulheres nervosas; 
		-> o número de homens agressivos; 
		-> o número de outros calmos;
		-> o número de pessoas nervosas com mais de 40 anos; 
		-> o número de pessoas calmas com menos de 18 anos.
	
	(WHILE)
 */
package ex04;

import java.util.Scanner;

public class pesquisaPsicologica {

	public static void main(String[] args) {
		// vars
			// para a pesquisa
				int qtdDePessoasNaPesquisa; // padrão 150
				int idadeInformada;
				int sexoInformado; // feminino / 2-masculino / 3-Outros
				int temperamentoInformado; // calmo|agressivo|nervoso
				int i;
				Scanner read;
		
				qtdDePessoasNaPesquisa = 3;
				i = 0;
				read = new Scanner(System.in);
				
			// para exibir resultado
				int numeroDePessoasCalmas;
				int numeroDeMulheresNervosas;
				int numeroDeHomensAgressivos;
				int numeroDeOutrosCalmos;
				int numeroDePessoasNervosasComMaisDe40;
				int numeroDePessoasCalmasComMenosDe18;
				
				numeroDePessoasCalmas = 0;
				numeroDeMulheresNervosas = 0;
				numeroDeHomensAgressivos = 0;
				numeroDeOutrosCalmos = 0;
				numeroDePessoasNervosasComMaisDe40 = 0;
				numeroDePessoasCalmasComMenosDe18 = 0;
		// input
				System.out.println("Bem Vindo(a|e) a pesquisa psicológica:");
				while (i < qtdDePessoasNaPesquisa)
				{
					i++;
					System.out.println("\nPessoa #" + i + ":");
					// pesquisa					
						// IDADE
						System.out.print("Qual a sua idade ? ");
						idadeInformada = read.nextInt();
						
						// SEXO
						System.out.print("Qual o seu sexo?  (1-FEMININO | 2-MASCULINO | 3-OUTROS) : ");
						sexoInformado = read.nextInt();
						
						// TEMPERAMENTO
						System.out.print("Você considera que o seu temperamento é...?  (1-CALMO | 2-NERVOSO | 3-AGRESSIVO) : ");
						temperamentoInformado = read.nextInt();
					
					// realizar contagens
						// o número de pessoas calmas; 
							if (temperamentoInformado == 1)
								numeroDePessoasCalmas += 1;								
							
						// o número de mulheres nervosas;
							if (sexoInformado == 1 && temperamentoInformado == 2)
								numeroDeMulheresNervosas += 1;
							
						// o número de homens agressivos; 
							if (sexoInformado == 2 && temperamentoInformado == 3)
								numeroDeHomensAgressivos += 1;
							
						// o número de outros calmos;
							if (sexoInformado == 3 && temperamentoInformado == 1)
								numeroDeOutrosCalmos += 1;
							
						// o número de pessoas nervosas com mais de 40 anos;
							if (temperamentoInformado == 2 && idadeInformada > 40)
								numeroDePessoasNervosasComMaisDe40 += 1;
							
						// o número de pessoas calmas com menos de 18 anos.
							if (temperamentoInformado == 1 && idadeInformada < 18)
								numeroDePessoasCalmasComMenosDe18 += 1;
				}	
		// processing
				
		
		// output
			System.out.println("\n_________________RESULTADO DA PESQUISA_____________________");
			System.out.println("O número de pessoas calmas: " + numeroDePessoasCalmas);
			System.out.println("O número de mulheres nervosas: " + numeroDeMulheresNervosas);
			System.out.println("O número de homens agressivos: " + numeroDeHomensAgressivos);
			System.out.println("O número de outros calmos: " + numeroDeOutrosCalmos);
			System.out.println("O número de pessoas nervosas com mais de 40 anos: " + numeroDePessoasNervosasComMaisDe40);
			System.out.println("O número de pessoas calmas com menos de 18 anos: " + numeroDePessoasCalmasComMenosDe18);
	}

}
