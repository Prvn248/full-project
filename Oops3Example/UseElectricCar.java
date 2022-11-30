package Oops3Example;

public class UseElectricCar {

	public static void main(String[] args) {
		ElectricCar e=new ElectricCar();
		e.brand="Honda";
		System.out.println(e.brand+(",")+e.model()+(",")+e.gearType("Honda")+(",")+e.seatType("Honda")+(",")+e.airBag("Honda")+(",")+e.gearType("Honda"));
		

	}

}
