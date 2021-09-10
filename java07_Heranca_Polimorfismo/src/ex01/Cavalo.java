package ex01;

public class Cavalo extends Animal implements Treinamento{
	// constructor
		public Cavalo(String nome, int idade) {
			super(nome, idade);
		}
	// methods
		public void correr()
		{
			System.out.println("Correndo...!");
		}
	@Override
		public void emitirSom()
		{
			System.out.println("III HIHIHIHIH...");
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
