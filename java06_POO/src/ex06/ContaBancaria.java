package ex06;

public class ContaBancaria {
	private	int		numero;
	private	String	cpf;
	private	double	saldo;
	private	boolean	active;
	
	public ContaBancaria(int numero, String cpf, double saldo, boolean active) {
		super();
		this.numero = numero;
		this.cpf = cpf;
		this.saldo = saldo;
		this.active = active;
	}

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

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "ContaBancaria= " + numero + "\ncpf= " + cpf + "\nsaldo= R$ " + saldo + "\nactive= " + (active == true ? "ativa" : "inativa");
	}
	
	
	
	
}
