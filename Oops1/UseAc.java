package Oops1;

public class UseAc {
	public static void main(String[]args) {
		Compreser compreser=new Compreser();
		compreser.setbrand("hair");
		compreser.setprice(20000);
		compreser.setphaseType("double");
		
		Ac ac=new Ac();
		ac.setbrand("hello");
		ac.setprice(5000);
		ac.setcompreser(compreser);
		System.out.println(ac.getbrand());
		System.out.println(ac.getcompreser().getbrand());
		
		
	}

}
class Ac {
	private String brand;
	private int price;
	private Compreser compreser;
	
	public void setbrand(String b) {
		brand=b;
	}
	public String getbrand() {
		return brand;
	}
	public void setprice(int p) {
		price=p;
	}
	public int getprice() {
		return price;
	}
	public void setcompreser(Compreser c) {
		compreser=c;
	}
	public Compreser getcompreser() {
		return compreser;
	}
}
class Compreser {
	private String brand;
	private int price;
	private String phaseType;
	
	public void setbrand(String b) {
		brand=b;
	}
	public String getbrand() {
		return brand;
	}
	public void setprice(int p) {
		price=p;
	}
	public int getprice() {
		return price;
	}
	public void setphaseType(String p) {
		phaseType=p;
	}
	public String getphaseType() {
		return phaseType;
	}
}