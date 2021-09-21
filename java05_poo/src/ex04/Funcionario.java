package ex04;

public class Funcionario {
	public	String	name;
	public	String	office;
	public	int	birthYear;
	public	String	email;
	public	String	phone;
	public Funcionario(String name, String office, int birthYear, String email, String phone) {
		super();
		this.name = name;
		this.office = office;
		this.birthYear = birthYear;
		this.email = email;
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Funcionario [name=" + name + ", office=" + office + ", birthYear=" + birthYear + ", email=" + email
				+ ", phone=" + phone + "]";
	}
	
	
	
}
