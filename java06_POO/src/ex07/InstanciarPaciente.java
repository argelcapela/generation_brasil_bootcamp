package ex07;

public class InstanciarPaciente {

	public static void main(String[] args) {
		
		Paciente p = new Paciente("A1", "Argel Capela", "argel@gmail.com", "999182 8417");		
		p.setLaudo("Entrou com sintômas de Covid19, fez o teste, deu positivo! Depois de 2 semanas, melhorou e se recuperou completamente.");
		System.out.println(p.toString());
		
	}

}
