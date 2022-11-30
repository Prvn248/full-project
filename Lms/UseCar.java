package Lms;

public class UseCar {
	public static void main(String[]args) {
		String[] word=args[0].split(",");
		Car car1=new Car();
		 car1.brand=(word[0]);
		 car1.price=Integer.parseInt(word[1]);
		 car1.isAirBag=Boolean.parseBoolean(word[2]);
		 car1.colour=(word[3]);
		
		String[] word1=args[1].split(",");
		Car car2=new Car();
		 car2.brand=(word1[0]);
		 car2.price=Integer.parseInt(word1[1]);
		 car2.isAirBag=Boolean.parseBoolean(word1[2]);
		 car2.colour=(word1[3]);
		
		System.out.println("Brand = "+car1.brand+" , "+car2.brand);
		System.out.println("Price = "+car1.price+" , "+car2.brand);
		System.out.println("Colour = "+car1.colour+" , "+car2.colour);
		
		
		
		
		
	}

}
