package Oops3;

public class UseCollege {
	public static void main(String[]args) {
		College c=new College();
		System.out.print(c.examTime(10));
		System.out.println(c.examFees(true));
		System.out.println(c.attendence(75));
		c.examDate();
	}

}
