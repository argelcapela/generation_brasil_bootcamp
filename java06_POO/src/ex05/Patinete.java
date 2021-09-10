package ex05;

public class Patinete {
	public	String	modelo;
	public	double	price;
	public	int		year;
	public Patinete(String modelo, double price, int year) {
		super();
		this.modelo = modelo;
		this.price = price;
		this.year = year;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Patinete [modelo=" + modelo + ", price=" + price + ", year=" + year + "]";
	}
	
	
	
}
