package Exception;

public class FlipKart {

	public static void main(String[] args)  {
		try {
	 int price=10000;
	 if(price<=10000) {
		 throw new ProductNotFound("Enterd invalid Amount");
	 }
	 else {
		 System.out.println("product list");
	 }
		

	}catch(Exception e) {
		System.out.println(e);
	}
	}
    
	
}
