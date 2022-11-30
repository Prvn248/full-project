package Function;

public class RetirementAge {
	public String Findretirement(int age) {
		if(age>60) {
			return "Eligible to retire";
		}
		else {
			return "Not Eligible to retire";
			
		}
	}
		
	public static void main(String[]args) {
	  RetirementAge retirement=new RetirementAge();
	  System.out.println(retirement.Findretirement(61));
	  
		}
	}


