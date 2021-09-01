package ex02;
import java.util.Scanner;

public class idadeEmDiasMesesEAnos 
{
	public static void main(String args[])
	{
			int qtdAnos;
			int qtdMeses;
			int qtdDias;
			int idade;
			Scanner read;
			
			read = new Scanner(System.in);			
			System.out.printf("Qual a sua idade em dias Brother?\n");
			qtdDias = read.nextInt();
			qtdAnos = qtdDias / 365;
			qtdMeses = (qtdDias % 365) / 30;
			qtdDias = (qtdDias % 365) % 30;			
			System.out.printf("Valeu Brother!\nSua idade em dias é: \n" + qtdAnos + " anos " + qtdMeses + " meses e " + qtdDias + " dias!" );
			read.close();	
	}
}
