package Condition;

public class UseAc {

	public static void main(String[] args) {
		Ac ac1=new Ac();
		ac1.brand="Samsung";
		ac1.price=23000;
		ac1.colour="White";
		
		Ac ac2=new Ac();
		ac2.brand="hair";
		ac2.price=20000;
		ac2.colour="White";
		
		Ac ac3=new Ac();
		ac3.brand="Sony";
		ac3.price=21000;
		ac3.colour="White";
		
		Ac ac4=new Ac();
		ac4.brand="whirlpool";
		ac4.price=19000;
		ac4.colour="White";
		
		if(ac1.price>ac2.price && ac1.price>ac3.price && ac1.price>ac4.price) {
			System.out.println(ac1.brand.toUpperCase());
			
		}
		
		else if(ac2.price>ac1.price && ac2.price>ac3.price && ac2.price>ac4.price) {
			System.out.println(ac2.brand.toUpperCase());
			
		}
		else if(ac3.price>ac1.price && ac3.price>ac3.price && ac3.price>ac4.price) {
			System.out.println(ac3.brand.toUpperCase());
			
		}
		else if(ac4.price>ac2.price && ac4.price>ac3.price && ac4.price>ac1.price) {
			System.out.println(ac4.brand.toUpperCase());
			
		}
		else {
			System.out.println("no result");
			
		}
	}
}
