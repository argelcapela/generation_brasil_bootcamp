package ex01e02;

public class Cachorro extends Animal{
	//constructor
	public Cachorro(String nome, int idade) {
		super(nome, idade);		
	}
	//methods
	public void correr()
	{
		System.out.println("Correndo...");
	}
	@Override
	public void emitirSom()
	{
		System.out.println("au au au au...");
	}
	@Override
	public void rolarChao() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void emDuasPatas() {
		// TODO Auto-generated method stub
		
	}
}
