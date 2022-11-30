package Collection2;

public class Mobile {
	private String brand;
	private int ram;
	private boolean isAndroid;
	private int batteryCapacity;
	
	public void setBrand(String b) {
		brand=b;
	}
	public void setRam(int r) {
		ram=r;
	}
	public void setIsAndroid(boolean a) {
		isAndroid=a;
	}
	public void setBatteryCapacity(int c) {
		batteryCapacity=c;
	}
	public String getBrand() {
		return brand;
	}
	public int getRam() {
		return ram;
	}
	public boolean getIsAndroid() {
		return isAndroid;
	}
	public int getBatteryCapacity() {
		return batteryCapacity;
	}
	public Mobile(String b,int r,boolean a,int c) {
		brand=b;
		ram=r;
		isAndroid=a;
		batteryCapacity=c;
	}
	public String toString() {
		return(brand+" "+ram+" "+isAndroid+" "+batteryCapacity);
	}
	
	

}
