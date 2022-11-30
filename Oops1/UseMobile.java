package Oops1;

public class UseMobile {

	public static void main(String[] args) {
  Battery battery=new Battery();
  battery.setbrand("lithium");
  battery.setprice(2000);
  battery.setcapacity(400);
  
  Mobile mobile=new Mobile();
  mobile.setbrand("apple");
  mobile.setprice(80000);
  mobile.setbattery(battery);
  
  System.out.println(mobile.getbrand());
  System.out.println(mobile.getbattery().getbrand());
  

	}

}
class Mobile {
	private String brand;
	private int price;
	private Battery battery;
	
	public void setbrand(String brand) {
		this.brand=brand;
	}
	public String getbrand() {
		return brand;
	}
	public void setprice(int price) {
		this.price=price;
	}
	public int getprice() {
		return price;
	}
	public void setbattery(Battery battery) {
		this.battery=battery;
	}
	public Battery getbattery() {
		return battery;
	}
	
}
class Battery {
	private String brand;
	private int price;
	private int capacity;
	
	public void setbrand(String brand) {
		this.brand=brand;
	}
	public String getbrand() {
		return brand;
	}
	public void setprice(int price) {
		this.price=price;
	}
	public int getprice() {
		return price;
	}
	public void setcapacity(int capacity) {
		this.capacity=capacity;
	}
	public int getcapacity() {
		return capacity;
	}
		
	}
	
