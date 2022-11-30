package Function;

public class Car {
	String brand;
	String colour;
	int price;
public String findMaximumCarPrice(Car a,Car b) {
	if(a.price>b.price) {
		return a.colour;
	}
	else { return b.colour;
	}
	
	}
	
	
}
