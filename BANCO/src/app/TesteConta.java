package app;

import java.util.Scanner;

import entities.ContaCorrente;
import entities.ContaEmpresa;
import entities.ContaEspecial;
import entities.ContaEstudantil;
import entities.ContaPoupanca;

public class TesteConta {

	public static void main(String[] args) {
		// vars - 
			Scanner leia;			
			char tipo;
			double valor;
			char op;
			int dia;

			leia = new Scanner(System.in);
			valor = 0.0;			
		// contas
			ContaPoupanca cp1 = new ContaPoupanca(1, "xxx.xxx.xxx.xx", 5);
			ContaEmpresa cempre1 = new ContaEmpresa(2, "xxx.xxx.xxx.xx", 5);
			ContaEspecial cespe1 = new ContaEspecial(3, "xxx.xxx.xxx.xx", 5);
			ContaEstudantil cestu1 = new ContaEstudantil(4, "xxx.xxx.xxx.xx", 5);
			ContaCorrente ccorre1 = new ContaCorrente(5, "xxx.xxx.xxx.xx", 5);			
		// processing			
			// 1)Tela Inicial				
				System.out.println("[NOME DO BANCO]");	
				System.out.println("[SLOGAN]\n");								
				System.out.println("1 - CONTA POUPANÇA");	
				System.out.println("2 - CONTA CORRENTE");	
				System.out.println("3 - CONTA ESPECIAL");		
				System.out.println("4 - CONTA EMPRESA");		
				System.out.println("5 - CONTA ESTUDANTIL");		
				System.out.println("6 - SAIR");	
				System.out.println("DIGITE O CODIGO DA OPÇÃO SELECIONADA:");	
			
				op = leia.next().charAt(0);
				
				
			
			// 2) 10 Movimentos
				for (int x = 1; x <= 10; x++) 
				{
					System.out.println("MOVIMENTO " + x);
					System.out.println("SALDO ATUAL R$ :" + cp1.getSaldo());
					System.out.print("Movimento D-débito ou C-crédito ? :");
					tipo = leia.next().toUpperCase().charAt(0);
					System.out.print("Digite o valor :");
					valor = leia.nextDouble();
					if (tipo == 'D') {
						cp1.debito(valor);
					} else if (tipo == 'C') {
						cp1.credito(valor);
					} else {
						System.out.println("Não foi informado um tipo correto...");
					}
					System.out.println("Continua S/N : ");
					op = leia.next().toUpperCase().charAt(0);
					if (op == 'N') {
						break;
					}
				}		
				System.out.println("SALDO ATUALIZADO R$ " + cp1.getSaldo());
				System.out.println("Informe o dia de hoje :");
				dia = leia.nextInt();
				cp1.correcao(dia);
				System.out.println("SALDO FINAL R$ " + cp1.getSaldo());

	}

}
