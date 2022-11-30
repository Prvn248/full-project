package Function;

public class Pen {

	String brand;
	String colour;
	int price;
	public String findBrand(Pen a,Pen b,Pen c) {
		if(a.startsWith("R")) {
			return a.brand;
		}
		else if(b.startsWith("R")) {
			return b.brand;
		}
			else { 
				return c.brand;
			
			}
		
	}
	}

