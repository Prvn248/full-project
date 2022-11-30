package Function;

public class Result {
	public int total() {
		int a= 10;
		int b=20;
		return (a+b);
	}
	public int average(int a,int b,int c) {
		return( (a+b+c)/3);
	}
	
		public static void main(String[]args) {
			Result r=new Result();
			System.out.println(r.total());
		    System.out.println(r.average(2,3,4));
		
		
		
	}

}
