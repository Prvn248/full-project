package day2;

public class UseCar {
	public static void main(String[]args) {
		Car car1=new Car();
		car1.brand="BENZ";
		car1.colour="BLACK";
		car1.price=1600000;
		car1.taxAmount=200000;
		car1.netPrice=(car1.price+car1.taxAmount);
		car1.isSensor=true;
		car1.rating=5f;
		car1.batteryType='w';
		System.out.println("BRAND="+car1.brand+": COLOUR="+car1.colour+": NET AMOUNT="+car1.netPrice);
		
		
		
				
		
    
		
	}
     
}
