package Oops3Example;

public abstract class Car implements Vehicle {
	public  String airBag(String a) {
		if(a.equals("Honda")) {
			return("AirBag is Available");
		}
		else {
			return("No AirBag");
		}
	}
	public String gearType(String b) {
		if(b.equals("Honda")) {
			return("Automatic Gear");
		}
		else {
			return("Normal Gear");
		
		}
	}

}
