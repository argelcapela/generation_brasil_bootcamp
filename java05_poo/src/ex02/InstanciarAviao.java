package ex02;

public class InstanciarAviao {

	public static void main(String[] args) {

		Aviao aviao1 = new Aviao("atom21", 
							"Capela Foundation", 
							2021, 
							"Toquio", 
							"Berlim", 
							1);
		
		System.out.println(aviao1.toString());
	}

}
