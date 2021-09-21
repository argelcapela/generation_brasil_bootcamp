package ex07;

public class Paciente {	
	private	String 	codPaciente;
	private	String	name;
	private	String	email;
	private	String 	phone;
	private	String	laudo;
	
	public Paciente(String codPaciente, String name, String email, String phone) {
		super();
		this.codPaciente = codPaciente;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	public String getCodPaciente() {
		return codPaciente;
	}
	public void setCodPaciente(String codPaciente) {
		this.codPaciente = codPaciente;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getLaudo() {
		return laudo;
	}
	public void setLaudo(String laudo) {
		this.laudo = laudo;
	}
	
	@Override
	public String toString() {
		return "Paciente: " + codPaciente + "\nname= " + name + "\nemail= " + email + "\nphone= " + phone
				+ "\nlaudo:\n" + laudo;
	}
	

}
