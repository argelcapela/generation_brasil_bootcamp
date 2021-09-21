package ex00;

public class Car {
	
	public	String	name;
	public	String	brand;
	public	int		year;
	public	Boolean state;
	public 	Double	speed;
	public	String	color;
	public	String	factory;
	
	public void turnOn()
	{
		System.out.println("Carro Ligado!");
		state = true;
	}
	
	public void turnOff()
	{
		System.out.println("Carro Desligado!");
		state = false;
	}
	
	public void accelerate()
	{
		System.out.println("RRUUUUMMM!");
		if (state)
			speed += 1;
	}
	
	public void brake()
	{
		System.out.println("PARANDO!");
		if (state)
			speed -= 1;
	}
	
}
