package Collection1;

public class Employee {
	private String name;
	private int age;
	private String gender;
	private int salary;
	private String designation;
	
	public void setName(String n) {
		name=n;
	}
	public void setAge(int a) {
		age=a;
	}
	public void setIsMale(String m) {
		gender=m;
	}
	public void setSalary(int s) {
		salary=s;
	}
	public void setDesignation(String d) {
		designation=d;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getIsMale() {
		return gender;
	}
	public int getSalary() {
		return salary;
	}
	public String getDesignation() {
		return designation;
	}
	
	public Employee(String n,int a,String g,int s,String d) {
		name=n;
		age=a;
		gender=g;
		salary=s;
		designation=d;
	}
	public String toString() {
		return (name+(",")+age+(",")+gender+(",")+salary+(",")+designation);
	}

	
	}
	
	


