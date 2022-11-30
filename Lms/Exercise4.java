package Lms;

public class Exercise4 {
	public static void main(String[]args) {
		String[] result=args[0].split(",");
		String word1=result[0];
		int num1=Integer.parseInt(result[1]);
		boolean isPresent=Boolean.parseBoolean(result[2]);
		String word2=(result[3]);
		long num2=Long.parseLong(result[4]);
		System.out.println("NAME :"+word1);
		System.out.println("Roll NO :"+num1);
		System.out.println("Is Present :"+isPresent);
		System.out.println("Mail Id :"+word2);
		System.out.println("Mobile No :"+num2);
			
		
		
		
	}
	

}
