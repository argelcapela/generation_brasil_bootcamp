package ex00;

public class InstanciarPessoa {

	public static void main(String[] args) {
		
		Pessoa fulano = new Pessoa();
		Pessoa cicrano = new Pessoa();
		
		fulano.nome = "João";
		fulano.anoDeNascimento = 1999;
		fulano.calcularIdade();
		System.out.println("Olá!, " + fulano.nome);
		System.out.println("Sua idade é " + fulano.idade + "!");
		
		System.out.println();
		
		cicrano.nome = "Pedro";
		cicrano.anoDeNascimento = 2002;
		cicrano.calcularIdade();
		System.out.println("Olá!, " + cicrano.nome);
		System.out.println("Sua idade é " + cicrano.idade + "!");

		

	}

}
