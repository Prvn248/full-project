package Oops2;

public class ElectronicDevice {
	private String brand;
	private int price;
	private String color;
	
	
	public void setBrand(String b) {
		brand=b;
	}
	public void setPrice(int p) {
		price=p;
	}
	public void setColor(String c) {
		color=c;
	}
	public String getBrand() {
		return brand;
	}
	public int getPrice() {
		return price;
	}
	public String getColor() {
		return color;
	}
	
	public ElectronicDevice(String b,int p,String c) {
		brand=b;
		price=p;
		color=c;
	}
	public String toString() {
		return(brand+" "+price+" "+color);
	}
}
