package ex00;

public class InstanciarPessoa {

	public static void main(String[] args) {
		
		Pessoa fulano = new Pessoa();
		Pessoa cicrano = new Pessoa();
		
		fulano.nome = "Jo�o";
		fulano.anoDeNascimento = 1999;
		fulano.calcularIdade();
		System.out.println("Ol�!, " + fulano.nome);
		System.out.println("Sua idade � " + fulano.idade + "!");
		
		System.out.println();
		
		cicrano.nome = "Pedro";
		cicrano.anoDeNascimento = 2002;
		cicrano.calcularIdade();
		System.out.println("Ol�!, " + cicrano.nome);
		System.out.println("Sua idade � " + cicrano.idade + "!");

		

	}

}
