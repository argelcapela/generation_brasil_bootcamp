package entities;

public abstract class Conta implements FazerContaAcessarMetodosDosFilhosComPolimorfismo {
		
	//atributos

	private int numero;
	private String cpf;
	private double saldo;
	private boolean ativo;
	
	//construtor
	public Conta(int numero, String cpf) {
		super();
		this.numero = numero;
		this.cpf = cpf;
	}
	
	
	//encapsulamento
		public int getNumero() {
			return numero;
		}
		public void setNumero(int numero) {
			this.numero = numero;
		}
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public double getSaldo() {
			return saldo;
		}
		/*public void setSaldo(double saldo) {
			this.saldo = saldo;
		}*/
		public boolean isAtivo() {
			return ativo;
		}
		public void setAtivo(boolean ativo) {
			this.ativo = ativo;

		}
	
		
		//metodos
		
		public void credito(double valor) {
			this.limpa();
			this.saldo= this.saldo + valor;
			System.out.println("Resultado do Movimento:\n\t R$ "+ valor +" foram creditados com sucesso!\n");
			System.out.println(this.toString());
		}
		public void debito(double valor) {
			this.limpa();
			if (valor == 0) {
				System.out.println("Resultado do Movimento:\\n\\tDebito vazio, impossivel realizar...\n");
			}
			else if(valor < 0) {
				System.out.println("Resultado do Movimento:\\n\\tValor informado negativo, impossivel realizar...\n");
			}
			else if (valor > saldo) {
				System.out.println("Resultado do Movimento:\n\tSaldo insulficiente, impossivel realizar...\n");
			} 
			else {
				System.out.println("Resultado do Movimento:\n\t R$ "+ valor +" foram debitados com sucesso!\n");
				saldo -= valor;
			}
			System.out.println(this.toString());
		}
		
		@Override
		public String toString()
		{
			return ("Número da Conta: "+ this.numero +
					"CPF: "+ this.cpf +
					"SALDO: "+ this.saldo); 			
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


		@Override
		public void limpa() {
			for (int x = 0; x < 50;x++)
			{
				System.out.println();
			}
		}
		
		
		

}
