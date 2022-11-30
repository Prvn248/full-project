package Oops1;

public class Student {
	String name;
	int rollNo;
	char sec;
	
	public void setName(String n) {
		name=n;
	}
	public void setRollNo(int r) {
		rollNo=r;
	}
	public void SetSec(char s) {
		sec=s;
	}
	public String toString() {
		return name+" "+rollNo+" "+sec;
	}
}
