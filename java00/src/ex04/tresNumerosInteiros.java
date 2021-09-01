package ex04;

import java.util.Scanner;

public class tresNumerosInteiros {
	public static void main(String[] Args)
	{
		double A;
		double B;
		double C;
		double D;
		double R;
		double S;
		Scanner read = new Scanner(System.in);
		
		A = 0;
		B = 0;
		C = 0;
		D = 0;
		R = 0;
		S = 0;
		System.out.printf("Número A: \n");
		A = read.nextInt();
		System.out.printf("Número B: \n");
		B = read.nextInt();
		System.out.printf("Número C: \n");
		C = read.nextInt();
		R = Math.pow((A + B), 2);
		S = Math.pow((A + C), 2);
		D = (R + S) / 2;
		System.out.println("R '= " + R);
		System.out.println("D '= " + D);
		System.out.println("S '= " + S);
	}
}
