package Oops1;

public class College {
String name;
int noOfClass;
String location;
Student student;

public void setName(String n){
	name=n;
}
public void setNoOfClass(int n) {
	noOfClass=n;
}
public void setlocation(String l) {
	location=l;
}
public String toString() {
	return name+" "+noOfClass+" "+location+" "+student;
}

}
