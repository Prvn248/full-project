package Function;

public class Calculator {
	public String addition(int a,int b) {
		return "Addition"+(a+b);
	}
	public String subraction(int a,int b) {
		return"Subraction"+(a+b);
	}
	public static void main(String[]args) {
		Calculator cal=new Calculator();
		System.out.println(cal.addition(20,30));
		System.out.println(cal.subraction(20,30));
		
		
		
	}

}
