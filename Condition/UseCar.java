package Condition;

public class UseCar {
	public static void main(String[]args) {
		Car car1=new Car();
		car1.brand="BMW";
		car1.price=400000;
		car1.colour="BLUE";
		
		Car car2=new Car();
		car2.brand="BENZ";
		car2.price=40000;
		car2.colour="BLACK";
		if(car1.price>car2.price) {
			System.out.println(car1.brand.charAt(0));
			
		}
		
	}

}
