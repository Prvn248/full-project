package Oops2;

public class PrivateSchool extends School {
	boolean isAcRoom;
	int noOFBus;
	boolean isCbse;
	public int findFees() {
		return 70000;	
	}
	public int findFees(int noOfSubjects) {
		if(noOfSubjects>5) {
			return 70000+35000;
		}
		else {
			return 70000;
		}
	}
		public int findFees(int noOfSubjects,boolean isWeekStudents) {
			if(noOfSubjects>5 && isWeekStudents==true) {
				return 105000+20000;
			} 
			else {
				return 105000;
			}
			}
		
	}

