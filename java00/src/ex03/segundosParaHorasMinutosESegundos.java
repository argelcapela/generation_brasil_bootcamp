/*
3. Fa�a um sistema que leia o tempo de dura��o de
um evento em uma f�brica expressa em segundos e 
mostre-o expresso em horas, minutos e segundos.
*/ 
package ex03;
import java.util.Scanner;

public class segundosParaHorasMinutosESegundos 
{
	public static void main(String args[])
	{
			int qtdHoras;
			int qtdMinutos;
			int qtdSegundos;
			int horarioEmSegundos;
			Scanner read;
			
			read = new Scanner(System.in);			
			System.out.printf("Qual o hor�rio em segundos Brother?\n");
			horarioEmSegundos = read.nextInt();
			qtdHoras = horarioEmSegundos / 3600;
			qtdMinutos = (horarioEmSegundos % 3600) / 60;
			qtdSegundos = (horarioEmSegundos % 3600) % 60;			
			System.out.printf("Valeu Brother!\nAgora s�o: \n" + qtdHoras + ":" + qtdMinutos + ":" + qtdSegundos);
			read.close();	
	}
}
