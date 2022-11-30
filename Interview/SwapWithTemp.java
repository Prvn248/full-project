package Interview;

public class SwapWithTemp {
	public static void main(String[]args) {
		int a=15;
		int b=10;
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("a="+a);
		System.out.println("b="+b);	
	}

}
