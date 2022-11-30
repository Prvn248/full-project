package Oops3;

public abstract class University {
	public abstract String examTime(int time);
	public abstract String examFees(boolean isPaid);
	
	public void examDate() {
		System.out.println("12 august to 26 december");
	}
	public String attendence(int percentage) {
		if(percentage>65) {
			return "eligible for exams";
		}
		else {
			return "Not eligible for exams";
		}
	}

}
