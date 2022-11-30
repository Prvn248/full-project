package Oops3Example;

public class ElectricCar extends Car {
	String brand;
	public String ac(String a) {
		if(a.equals("Honda")) {
		return("Ac is Available");
	}
		else {
			return ("Non Ac");
		}
	}
	public String model() {
		return ("Feast570");
	}
	public String breakType(String a) {
		if(a.equals("Honda")) {
			return ("Air Break");
		}
		else {
			return ("Oil Break");
		}
	}
	public String seatType(String b) {
		if(b.equals("Honda")) {
			return ("Cushion Seat");
		}
		else {
			return ("Normal Seat");
		}
	}

}
