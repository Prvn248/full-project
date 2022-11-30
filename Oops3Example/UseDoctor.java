package Oops3Example;

public class UseDoctor {
	public static void main(String[]args) {
		Doctor d=new Doctor();
		d.name="Praveen";
		d.age=32;
		d.location="Chennai";
		System.out.println(d.name+(",")+d.age+(",")+d.location+(",")+d.work()+(",")+d.field("doctor"));
	}

}
