package Oops1;

public class UseFan {

	public static void main(String[] args) {
		Coil coil=new Coil("harvels",3000,"single");
		Fan fan=new Fan("crompton",5000,coil);
		fan.setBrand("kaithan");
		
		System.out.println(fan);
		System.out.println(fan.getCoil().getPrice());
		


	}

}
class Fan {
	private String brand;
	private int price;
	private Coil coil;	
	
	public void setBrand(String b) {
		brand=b;
	}
	public String getBrand() {
		return brand;
	}
	public void setPrice(int p) {
		price=p;
	}
	public int getPrice() {
		return price;
	}
	public void setCoil(Coil c) {
		coil=c;
	}
	public Coil getCoil() {
		return coil;
	}
	public Fan(String b,int p,Coil c) {
		brand=b;
		price=p;
		coil=c;
	}
	public String toString() {
		return brand+","+price+","+coil;
	}
		
	}

class Coil {
	private String brand;
	private int price;
	private String phaseType;
	
	public void setBrand(String b) {
		brand=b;
	}
	public String getBrand() {
		return brand;
	}
	public void setPrice(int p) {
		price=p;
	}
	public int getPrice() {
		return price;
	}
	public void setPhaseType(String p) {
		phaseType=p;
	}
	public String getPhaseType() {
		return phaseType;
	}
	public Coil(String b,int p,String r) {
		brand=b;
		price=p;
		phaseType=r;
		
	}
	public String toString() {
		return brand+","+price+","+phaseType;
	}
}