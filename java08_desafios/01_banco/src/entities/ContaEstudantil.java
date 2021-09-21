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
			System.out.println("Amigo, voc� n�o pode fazer um empr�stimo de R$ 0 reais!");
		}
		else if(emprestimoEstudantil < 0)
		{
			System.out.println("Voc� n�o pode fazer empr�stimo de valores negativos!");
		}
		else if((this.limiteEstudantil - emprestimoEstudantil) < 0)
		{
			System.out.println("O valor de empr�stimos n�o pode ultrapassar R$ 5.000!");
		}
		else
		{
			super.credito(emprestimoEstudantil);				
			this.limiteEstudantil -= emprestimoEstudantil;
			System.out.printf("Voc� solicitou um empr�stimo de R$ %.2f por�m "
							  + "seu Limite de Empr�stimo � : R$ %.2f \n",
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
			System.out.print("\n\nVoc� n�o tem saldo. por�m tem um empr�stimo estudantil dispon�vel de at� "+ this.getLimiteEstudantil() +" , vai pegar? (s-sim|n-n�o): ");
			op = leia.next().charAt(0);
			this.usarEstudantil(valor);	
			limpa();
			System.out.println(this.toString());
		}
	}
	@Override
	public String toString() {
		return "Saldo= R$ "+ super.getSaldo() + "\nLimite Estudantil Dispon�vel= R$ " + this.getLimiteEstudantil();
	}
}