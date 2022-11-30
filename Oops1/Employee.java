package Oops1;

public class Employee {
	String name;
	int id;
	int salary;
	
	public Employee(String n,int i,int s ) {
		name=n;
		id=i;
		salary=s;
	}
	public String toString() {
		return name+" "+id+" "+salary;
	}
		
}
