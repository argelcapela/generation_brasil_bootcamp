package entities;

public abstract class Conta {
	// attributes
		public	int		numero;
		public	String	cpf;
		public	Double	saldo;
		public	Boolean	ativo;
	// constructor	
		public Conta(int numero, String cpf) {
			super();
			this.numero = numero;
			this.cpf = cpf;
			this.saldo = 0.0;
		}		
	// encapsulation
		public void setNumero(int numero) {
			this.numero = numero;
		}
		
		public String getCpf() {
			return cpf;
		}
	
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
	
		public Double getSaldo() {
			return saldo;
		}
	
		public void setSaldo(Double saldo) {
			this.saldo = saldo;
		}
	
		public Boolean getAtivo() {
			return ativo;
		}
	
		public void setAtivo(Boolean ativo) {
			this.ativo = ativo;
		}
		
		public int getNumero() {
			return numero;
		}
	// methods
		public void debito(double debito)
		{
			this.saldo -= debito;
		}
			
		public void credito(double credito)
		{
			if (this.saldo == 0)
			{
				System.out.println("Conta não tem saldo!");
			}
			else if(this.saldo < 0)
			{
				System.out.println("Você não creditar números negativos!");
			}
			else
			{
				this.saldo += credito;
			}			
		}
		
		public String toString()
		{
			return ("Número da Conta: "+ this.numero +
					"CPF: "+ this.cpf +
					"SALDO: "+ this.saldo); 			
		}

}
