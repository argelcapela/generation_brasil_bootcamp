package entities;

import java.util.Scanner;

public class ContaEspecial extends Conta {
	
	@Override
	public void correcao(int diaInformado) {
		// TODO Auto-generated method stub
		
	}

	//atributos
	private double limite;
	
	
	//construtor
	public ContaEspecial(int numero, String cpf, double limite) {
		super(numero, cpf);
		this.limite = limite;
	}

	//encapsulamento
	public double getLimite() {
		return limite;
	}


	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	//metodos
	public void usarLimite(double limite) {		
		if (this.limite == 0)
		{
			System.out.println("Você não tem limite!");
		}
		else if(limite > this.limite)
		{
			System.out.println("Esse valor, estora o seu limite restante de R$ " + this.limite);
		}
		else		
		{
			super.credito(limite);
			this.limite = this.limite - limite;
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
			System.out.print("\n\nVocê desejar usar o seu limite? (s-sim|n-não): ");
			op = leia.next().charAt(0);
			this.usarLimite(valor);	
			limpa();
			System.out.println(this.toString());
		}
	}

	@Override
	public String toString() {
		return "Saldo= R$ "+ super.getSaldo() + "\nLimite= R$ " + this.getLimite();
	}
	
	
	
}