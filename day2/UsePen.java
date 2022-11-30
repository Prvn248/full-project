package day2;

public class UsePen {
	public static void main(String[]args) {
	Pen pen1=new Pen();
	pen1.colour="Red";
	pen1.brand="Hero";
	pen1.isQuality=true;
	pen1.price=85;
	
	Pen pen2=new Pen();
	pen2.colour="White";
	pen2.brand="Cello";
	pen2.isQuality=true;
	pen2.price=45;
	System.out.println(pen1.colour+" "+pen1.brand+" "+pen1.isQuality+" "+pen1.price);
	System.out.println(pen2.colour+" "+pen2.brand+" "+pen2.isQuality+" "+pen2.price);
	
	
	
	}

}
