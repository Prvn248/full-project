package Exception;

public class Divide {

	public static void main(String[] args) {
		int num=10;
		int num1=0;
		try {
			int num2=num/num1;
			System.out.println(num2);
		}catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("the given number can't be divide by 0");
		}
		System.out.println("Thankyou");
		}

}
