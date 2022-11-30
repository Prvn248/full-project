package Collection2;

public class Customer {
	private String name;
	private int age;
	private int salary;
	private long aadharNum;
	
	public void setName(String n) {
		name=n;
	}
	public void setAge(int a) {
		age=a;
	}
	public void setSalary(int s) {
		salary=s;
	}
	public void setAadharNum(long b) {
		aadharNum=b;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getSalary() {
		return salary;
	}
	public long getAadharNum() {
		return aadharNum;
	}
	
	public Customer(String n,int a,int s,long b) {
		name=n;
		age=a;
		salary=s;
		aadharNum=b;
	}
public String toString() {
	return (name+" "+age+" "+salary+" "+aadharNum);
}
}
