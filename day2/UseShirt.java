package day2;

public class UseShirt {
	public static void main(String[]args) {
		Shirt shirt1= new Shirt();
		shirt1.brand="DENIM";
		shirt1.colour="GREEN";
		shirt1.price=500;
		shirt1.discountAmount=50;
		shirt1.netPrice=(shirt1.price-shirt1.discountAmount);
		shirt1.isChecked=true;
		System.out.println("BRAND="+shirt1.brand+"; COLOUR="+shirt1.colour+"; NET PRICE="+shirt1.netPrice+"; CHECKED="+shirt1.isChecked+";");
	}

}
