package ex06;

public class InstanciarContaBancaria {

	public static void main(String[] args) {

		ContaBancaria cb = new ContaBancaria(1, "xxx.xxx.xxx-xx", 300, true);
		System.out.println(cb.toString());
		
	}

}
