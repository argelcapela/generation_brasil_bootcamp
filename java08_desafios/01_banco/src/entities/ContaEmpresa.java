/*
	CONTA CORRENTE, 
	CONTA POUPAN�A,
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
				System.out.println("Amigo, voc� n�o pode fazer um empr�stimo de R$ 0 reais!\n");
			}
			else if(emprestimo < 0)
			{
				System.out.println("Movimento falhou!\nVoc� n�o pode fazer empr�stimo de valores negativos!\n");
			}
			else if((this.emprestimoEmpresa - emprestimo) < 0)
			{
				System.out.println("Movimento falhou!\nO limite de empr�stimo que voc� pode pedir � " + this.getEmprestimoEmpresa() + "!\n");
			}
			else
			{	
				
				this.emprestimoEmpresa -= emprestimo;
				System.out.printf("Voc� recebeu o empr�stimo de R$ %.2f com muito sucesso!\n\n",emprestimo);
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
				System.out.print("\n\nVc n�o tem saldo o suficiente para atender esse d�bito...\n "
						+ "Voc� tem um limite de empr�stimo de at� " + this.getEmprestimoEmpresa() +", vai pegar? (s-sim|n-n�o): ");
				op = leia.next().charAt(0);
				if (Character.toString(op).toLowerCase().equals("s"))
				{
					System.out.print("\n\nOK, selecione a op��o que melhor te atende amigo:\n"
							+ "1) Pegar o valor suficiente para o d�bito;\n"
							+ "2) Informar a quantidade para o empr�stimo;\n"
							+ "Op��o: ");					
					op = leia.next().charAt(0);
					if (Character.toString(op).equals("1"))
					{
						this.pedirEmprestimo(valor);
					}
					else if(Character.toString(op).equals("2"))
					{
						double valorDoEmprestimo;
						System.out.print("Quanto voc� quer pegar de empr�stimo? : ");
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
			return "Saldo= R$ "+ super.getSaldo() + "\nEmpr�stimo Dispon�vel= R$ " + this.getEmprestimoEmpresa();
		}
}
