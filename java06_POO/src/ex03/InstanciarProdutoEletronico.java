package ex03;

public class InstanciarProdutoEletronico {

	public static void main(String[] args) {

		ProdutoEletronico pe1 = new ProdutoEletronico("G1-1",
													  "MacBook Lion X",
													  6000,
													  20);
		ProdutoEletronico pe2 = new ProdutoEletronico("G1-2",
													  "MacBook BigSur",
													  10000,
													  5);
		

		System.out.println(pe1.toString());
		System.out.println(pe2.toString());
	}

}
