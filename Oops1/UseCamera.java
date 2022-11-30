package Oops1;

public class UseCamera {
	public static void main(String[]args) {
		Lense lense=new Lense("bold",500,true);
		Camera camera=new Camera("Canon",15000,lense);
		
		System.out.println(camera);
	}

}
class Camera {
	private String brand;
	private int price;
	private Lense lense;
	public Camera(String b,int p,Lense l) {
		brand=b;
		price=p;
		lense=l;
	}
	public String toString() {
		return (brand+","+price+","+lense);
	}
	
}
class Lense {
	private String brand;
	private int price;
	private boolean isConcave;
	public Lense(String b,int p,boolean c) {
		brand=b;
		price=p;
		isConcave=c;
				
	}
	public String toString() {
		return brand+","+price+","+isConcave;
	}
}