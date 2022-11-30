package Collection3;

public class Employee {
	private String name;
	private String designation;
	private int id;
	private int salary;
	
 public void setName(String n ) {
		name=n;
	}
	public void setDesignation(String d) {
		designation=d;
	}
	public void getId(int i) {
		id=i;
	}
	public void getSalary(int s) {
		salary=s;
	}
	public String getName() {
		return name;
	}
	public String getDesignation() {
		return designation;
	}
	public int getId() {
		return id;
	}
	public int getSalary() {
		return salary;
	}
	
	public Employee(String n,String d,int i,int s) {
		name=n;designation=d;id=i;salary=s;
	}
	public String toString() {
		return (name+" "+designation+" "+id+" "+salary);
	}

}
