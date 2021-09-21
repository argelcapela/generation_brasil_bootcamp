package ex00;

public class Pessoa 
{
	
	public	String	nome;
	public	int		idade;
	public	int		anoDeNascimento;
	public	String 	cpf;
	public	String	rg;
	public	String	email;
	
	public void calcularIdade(int anoDeNascimento)
	{
		this.idade = 2021 - anoDeNascimento;
	}

	public void calcularIdade()
	{
		this.idade = 2021 - this.anoDeNascimento;
	}
	
}
