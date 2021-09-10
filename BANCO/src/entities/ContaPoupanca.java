package entities;

public class ContaPoupanca extends Conta {

	private int diaAniversarioPoupanca;

	public ContaPoupanca(int numero, String cpf, int diaAniversarioPoupanca) {
		super(numero, cpf);
		this.diaAniversarioPoupanca = diaAniversarioPoupanca;
	}

	public int getDiaAniversarioPoupanca() {
		return diaAniversarioPoupanca;
	}

	public void setDiaAniversarioPoupanca(int diaAniversarioPoupanca) {
		this.diaAniversarioPoupanca = diaAniversarioPoupanca;
	}

	@Override
	public void correcao(int diaInformado) {

		double valorCorrecao;
		if (diaInformado == this.diaAniversarioPoupanca) 
		{

			valorCorrecao = (super.getSaldo() * 0.005);
			super.credito(valorCorrecao);
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
	public void usarEstudantil(double emprestimoEstudantil) {
		// TODO Auto-generated method stub
		
	}
}