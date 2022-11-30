package Collection3;

public class Student {
	private String name;
	private int regNo;
	private boolean isMale;
	private int age;
	
	public void setName(String n) {
		name=n;
	}
	public void setRegNo(int r) {
		regNo=r;
	}
	public void setIsMale(boolean m) {
		isMale=m;
	}
	public void setAge(int a) {
		age=a;
	}
	public String getName() {
		return name;
	}
	public int getRegNo() {
		return regNo;
	}
	public boolean getIsMale() {
		return isMale;
	}
	public int getAge() {
		return age;
	}
	public Student(String n,int r,boolean m,int a) {
		name=n;
		regNo=r;
		isMale=m;
		age=a;
	}
public String toString() {
	return(name+" "+regNo+" "+isMale+" "+age);

}
	
	

}
