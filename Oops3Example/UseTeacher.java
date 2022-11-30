package Oops3Example;

public class UseTeacher {
	public static void main(String[]args) {
		Teacher t=new Teacher();
		t.name="Ram Kumar";
		t.age=29;
		t.qualification="Bsc maths";
		t.walk();
		System.out.println(t.name+(",")+t.age+(",")+t.qualification+(",")+t.teach()+(",")+t.noOfClass());
	}

}
