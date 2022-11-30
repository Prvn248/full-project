package Oops2;

public class Mobile extends ElectronicDevice {
	private	int ramCapacity;
	private int storage;
	private String version;
	
	public void setRamCapacity(int r) {
		ramCapacity=r;
	}
	public void setStorage(int s) {
		storage=s;
	}
	public void setVersion(String v) {
		version=v;
	}
	public int getRamCapacity() {
		return ramCapacity;
	}
	public int getStorage() {
		return storage;
	}
	public String getVersion() {
		return version;
	}
	public Mobile(String b,int p,String c,int r, int s, String v) {
		super(b,p,c);
	       ramCapacity=r;
	       storage=s;
	       version=v;
	}
	public String toString() {
		return (super.toString()+" "+ramCapacity+" "+storage+" "+version);
	}

	
	

}
