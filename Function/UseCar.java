package Function;
public class UseCar {
	public static void main(String[] args) {
		 Car car=new Car();

		 car.colour="Black";
		 car.price=500000;
		 
		 Car car2=new Car();
		 car2.colour="White";
		 car2.price=800000;
		 
	System.out.println(car2.findMaximumCarPrice(car,car2));
	}

}
