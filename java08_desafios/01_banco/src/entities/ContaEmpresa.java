/*
	CONTA CORRENTE, 
	CONTA POUPANÇA,
	CONTA ESPECIAL, 
	***CONTA EMPRESA,*** 
	CONTA ESTUDANTIL
 */
package entities;

import java.util.Scanner;

public class ContaEmpresa extends Conta{
	
	// attribute
		private	double	emprestimoEmpresa;	
	// constructor
		public ContaEmpresa(int numero, String cpf, double emprestimoEmpresa) {
			super(numero, cpf);
			this.emprestimoEmpresa = emprestimoEmpresa;
		}
	// encapsulation
		public double getEmprestimoEmpresa() {
			return emprestimoEmpresa;
		}
		public void setEmprestimoEmpresa(double emprestimoEmpresa) {
			this.emprestimoEmpresa = emprestimoEmpresa;
		}
		
	// methods
		public void pedirEmprestimo(double emprestimo)
		{
			this.limpa();
			if (emprestimo == 0)
			{
				System.out.println("Amigo, você não pode fazer um empréstimo de R$ 0 reais!\n");
			}
			else if(emprestimo < 0)
			{
				System.out.println("Movimento falhou!\nVocê não pode fazer empréstimo de valores negativos!\n");
			}
			else if((this.emprestimoEmpresa - emprestimo) < 0)
			{
				System.out.println("Movimento falhou!\nO limite de empréstimo que você pode pedir é " + this.getEmprestimoEmpresa() + "!\n");
			}
			else
			{	
				
				this.emprestimoEmpresa -= emprestimo;
				System.out.printf("Você recebeu o empréstimo de R$ %.2f com muito sucesso!\n\n",emprestimo);
			}
			
		}
		@Override
		public void correcao(int diaInformado) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void pediTalao(int qtd) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void usarLimite(double limite) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void usarEstudantil(double emprestimoEstudantil) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void debito(double valor) {			
			//super.debito(valor);
			if ((super.getSaldo() - valor) < 0)
			{
				Scanner leia = new Scanner(System.in);
				char op;
				System.out.print("\n\nVc não tem saldo o suficiente para atender esse débito...\n "
						+ "Você tem um limite de empréstimo de até " + this.getEmprestimoEmpresa() +", vai pegar? (s-sim|n-não): ");
				op = leia.next().charAt(0);
				if (Character.toString(op).toLowerCase().equals("s"))
				{
					System.out.print("\n\nOK, selecione a opção que melhor te atende amigo:\n"
							+ "1) Pegar o valor suficiente para o débito;\n"
							+ "2) Informar a quantidade para o empréstimo;\n"
							+ "Opção: ");					
					op = leia.next().charAt(0);
					if (Character.toString(op).equals("1"))
					{
						this.pedirEmprestimo(valor);
					}
					else if(Character.toString(op).equals("2"))
					{
						double valorDoEmprestimo;
						System.out.print("Quanto você quer pegar de empréstimo? : ");
						valorDoEmprestimo = leia.nextDouble();
						this.limpa();
						this.pedirEmprestimo(valorDoEmprestimo);						
					}
				}				
				
				System.out.println(this.toString() + "\n");
			}
		}
		@Override
		public String toString() {
			return "Saldo= R$ "+ super.getSaldo() + "\nEmpréstimo Disponível= R$ " + this.getEmprestimoEmpresa();
		}
}
