/*
ler nomeDeUmAluno
qual o seu pronome?
ler nota1-5
mostrar a média
estado de aprovação
> 5 aprovado
<= 5 recuperação
*/
package ex00;

import java.util.Scanner;

public class calcularAMediaDeNotas {

	public static void main(String[] args) {
		//vars
			Scanner read;
			double mediaNotas;
			char pronome;
			int i;
			double temp;
			int qtdNotas;
			boolean aprovado;
			boolean adicionandoNota;
		
			read = new Scanner(System.in);
			mediaNotas = 0;
			temp = 0;
			i = 1;
			qtdNotas = 5;
			adicionandoNota = true;
		//input			
			do
			{
				System.out.println("Digite um pronome válido, qual o seu ? (o = ele | a = ela | e = elu):");
				pronome = read.next().charAt(0);
				read.nextLine();
			} while(pronome != 'o' && pronome != 'a' && pronome != 'e');
			
			while(adicionandoNota)
			{
				while (i <= qtdNotas)
				{
					try 
					{
						System.out.println("Nota #" + i + ": ");
						temp = read.nextDouble();
						mediaNotas += temp;
						if (i == qtdNotas)
							adicionandoNota = false;
					}
					catch(Exception e)
					{
						System.out.println("Valor inválido!");
						read.nextLine();
						break;
					}
					i++;
				}
				
			}
			
			
			mediaNotas /= qtdNotas;
		//processing
			if (mediaNotas > 5)
				aprovado = true;
			else
				aprovado = false;
		//output
			System.out.println("A Média é: " + mediaNotas);
			if (aprovado)
				System.out.println("Você foi aprovad" + pronome + "!");
			else
				System.out.println("Você foi reprovad" + pronome + "!");
			read.close();
	}

}
