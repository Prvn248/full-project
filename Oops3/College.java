package Oops3;

public class College extends University {
	public String examTime(int time) {
		if(time>=9) {
			return "Can enter the exam hall";
		}
		else {
			return "can't enter the exam hall";
		}
	}
		public String examFees(boolean isPaid) {
			if(isPaid==true) {
				return "Allowed to write exam";
			}
			else {
				return "Not Allowed to write exam";
			}
		}
		
	}


