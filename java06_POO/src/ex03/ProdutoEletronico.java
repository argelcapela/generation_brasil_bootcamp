package ex03;

public class ProdutoEletronico {
	private	String	cod;
	private	String	name;
	private	double	price;
	private	int	stock;
	
	public ProdutoEletronico(String cod, String name, double price, int stock) {
		super();
		this.cod = cod;
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	public String getCod() {
		return cod;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	/*public void setStock(String stock) {
		this.stock = stock;
	}*/
	@Override
	public String toString() {
		return "ProdutoEletronico [cod=" + cod + ", name=" + name + ", price=" + price + ", stock=" + stock + "]";
	}
	
	
}
