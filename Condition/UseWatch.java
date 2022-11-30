package Condition;

public class UseWatch {
	public static void main(String[]args) {
		Watch watch=new Watch();
		watch.brand="FASTRACK";
		watch.price=3000;
		watch.colour="BLACK";
		watch.isWaterProof=true;
		if(watch.isWaterProof==true) {
		System.out.println(watch.price-(watch.price*5/100));
			
		}
		else {
			System.out.println(watch.price+(watch.price*5/100));
		}
			
		}

}
