package Function;

public class Bike {
	String brand;
	int price;
	int taxAmount;
	String colour;
	int netPrice;
	public int findMax(Bike[] a) {
		int max=0;
		for(Bike m:a) {
			if(m.price>max) {
				max=m.price;
				
			}
		}
		return max;		
		
	}
	

}
