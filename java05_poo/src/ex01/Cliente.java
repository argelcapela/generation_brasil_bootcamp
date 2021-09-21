package ex01;

public class Cliente {
	// atributes
	private	String	name;
	private	String	cpf;
	private	String	rg;
	private	String	phone;
	private	String	email;
	private int		yearOfBirth;
	// constructor
	public Cliente(String name, String cpf, String phone)
	{
		this.name = name;
		this.cpf = cpf;
		this.phone = phone;
	}
	
	// encapsulation
	/*public String getNome() {
		return nome;
	}*/

	public void setNome(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	/*public void setCpf(String cpf) {
		this.cpf = cpf;
	}*/

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getPhone() {
		return phone;
	}

	/*public void setPhone(String phone) {
		this.phone = phone;
	}*/

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	
	// methods
	public int getAge()
	{
		return (2021 - this.yearOfBirth);
	}
	
	public void getClienteResume()
	{
		System.out.printf(" Olá,\n Nome de Usuário: %s \n CPF: %s \n RG: %s \n PHONE: %s \n E-MAIL: %s \n IDADE: %d ",
				this.name, this.cpf, this.rg == null ? "No Registered!" : this.rg, this.phone, this.email == null ? "No registered!" : this.email, this.getAge());
	}
	
}
