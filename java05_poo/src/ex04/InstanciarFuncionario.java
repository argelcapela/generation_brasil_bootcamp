package ex04;

public class InstanciarFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Argel Capela",
				    					"CTO",
				    					1999,
				    					"capeladev@gmail.com",
				    					"(13) 99182 8417");
		
		Funcionario f2 = new Funcionario("Samantha Capela",
										"Avertising Director",
										1998,
										"samantha@gmail.com",
										"(13) 99177 2233");
		
		System.out.println(f1.toString());
		System.out.println(f2.toString());
	}

}
