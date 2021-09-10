/*
	CONTA CORRENTE, 
	CONTA POUPAN�A,
	CONTA ESPECIAL, 
	***CONTA EMPRESA,*** 
	CONTA ESTUDANTIL
 */
package entities;

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
			if (emprestimo == 0)
			{
				System.out.println("Amigo, voc� n�o pode fazer um empr�stimo de R$ 0 reais!");
			}
			else if(emprestimo < 0)
			{
				System.out.println("Voc� n�o pode fazer empr�stimo de valores negativos!");
			}
			else if(emprestimo > 10000)
			{
				System.out.println("Voc� n�o pode fazer empr�stimo de valores negativos!");
			}
			else
			{
				super.credit(emprestimo);				
				this.emprestimoEmpresa -= emprestimo;
				System.out.println("Saldo atual � R$ " + this.emprestimoEmpresa);
			}
			
		}
	
}
