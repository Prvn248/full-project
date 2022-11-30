package Oops1;

public class Office {
	private String companyName;
	private int noOfEmployee;
	private String location;
	private Employee employee;
	
	public Office(String c,int n,String l,Employee e) {
         companyName=c;
		 noOfEmployee=n;
	     location=l;
		 employee=e;
	}
	public String toString() {
		return companyName+ " "+noOfEmployee+ " "+location+ " "+employee;
	}

}
