package entities;

import java.util.Scanner;

public class ContaEstudantil extends Conta{
	
	@Override
	public void correcao(int diaInformado) {
		// TODO Auto-generated method stub
		
	}

	//atributo
	private double limiteEstudantil;
	
	//construtor
	public ContaEstudantil(int numero, String cpf, double limiteEstudantil) {
		super(numero, cpf);
		this.limiteEstudantil = limiteEstudantil;
	}

	//encapsulamento
	public double getLimiteEstudantil() {
		return limiteEstudantil;
	}

	public void setLimiteEstudantil(double limiteEstudantil) {
		this.limiteEstudantil = limiteEstudantil;
	}
	
	//metodos
	public void usarEstudantil(double emprestimoEstudantil)
	{
		if (emprestimoEstudantil == 0)
		{
			System.out.println("Amigo, você não pode fazer um empréstimo de R$ 0 reais!");
		}
		else if(emprestimoEstudantil < 0)
		{
			System.out.println("Você não pode fazer empréstimo de valores negativos!");
		}
		else if((this.limiteEstudantil - emprestimoEstudantil) < 0)
		{
			System.out.println("O valor de empréstimos não pode ultrapassar R$ 5.000!");
		}
		else
		{
			super.credito(emprestimoEstudantil);				
			this.limiteEstudantil -= emprestimoEstudantil;
			System.out.printf("Você solicitou um empréstimo de R$ %.2f porém "
							  + "seu Limite de Empréstimo é : R$ %.2f \n",
							  emprestimoEstudantil, this.limiteEstudantil);
		}
	}

	@Override
	public void pediTalao(int qtd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pedirEmprestimo(double emprestimo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void usarLimite(double limite) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void debito(double valor) {			
		//super.debito(valor);
		if ((super.getSaldo() - valor) < 0)
		{
			Scanner leia = new Scanner(System.in);
			char op;
			System.out.print("\n\nVocê não tem saldo. porém tem um empréstimo estudantil disponível de até "+ this.getLimiteEstudantil() +" , vai pegar? (s-sim|n-não): ");
			op = leia.next().charAt(0);
			this.usarEstudantil(valor);	
			limpa();
			System.out.println(this.toString());
		}
	}
	@Override
	public String toString() {
		return "Saldo= R$ "+ super.getSaldo() + "\nLimite Estudantil Disponível= R$ " + this.getLimiteEstudantil();
	}
}