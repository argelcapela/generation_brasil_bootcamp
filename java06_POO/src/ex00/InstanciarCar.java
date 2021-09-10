package ex00;

public class InstanciarCar {

	public static void main(String[] args) {
		
		// car1
		Car carro1 = new Car();
		carro1.name = "Camaro";
		carro1.year = 2021;
		carro1.brand = "Chevrolet";
		
		// car2
		Car carro2 = new Car();
		carro2.name = "X1";
		carro2.year = 2021;
		carro2.brand = "BMW";
		carro2.speed = 0.0;
		
		carro2.turnOn();
		carro2.accelerate();
		carro2.accelerate();
		carro2.accelerate();
		carro2.accelerate();
		carro2.accelerate();
		carro2.accelerate();
		carro2.accelerate();
		carro2.accelerate();
		carro2.accelerate();
		carro2.accelerate();
		System.out.println("Velocidade = " + carro2.speed + " km/h ");
		carro2.turnOff();

	}

}
