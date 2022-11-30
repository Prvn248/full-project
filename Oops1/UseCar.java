package Oops1;

public class UseCar {

	public static void main(String[] args) {
	Engine engine=new Engine();
	engine.brand="volvo";
	engine.price=50000;
	engine.enginecc=450;
	
	Car car=new Car();
	car.brand="volvocar";
	car.price=700000;
	car.color="white";
	car.engine=engine;
	System.out.println(car.brand+(",")+car.engine.brand);

	}

}
