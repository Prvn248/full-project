package Oops3Example;

public class Doctor implements Person {
	String name;
	int age;
	String location;
	
	public String work() {
		return ("Working");
		}
	public String field(String doctor) {
		if(doctor=="octor") {
			return ("He is a Doctor");
		}
		else {
			return ("He is not a Doctor");
		}
	
	}

}
