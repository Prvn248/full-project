package Collection3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseStudent {

	public static void main(String[] args) {
		Student s1=new Student("Raja",201,true,15);
		Student s2=new Student("Surya",202,true,18);
		Student s3=new Student("Seetha",203,false,15);
		Student s4=new Student("Vikram",204,true,13);
		Student s5=new Student("Swetha",205,false,16);
		Student s6=new Student("Vinoth",206,true,14);
		Student s7=new Student("Pandi",207,true,17);
		Student s8=new Student("Manohar",208,true,18);
		Student s9=new Student("Gomathi",209,false,17);
		Student s10=new Student("Rahul",210,true,13);
		Student s11=new Student("Praveen",211,true,16);
		Student s12=new Student("Sekar",212,true,16);
		
 ArrayList<Student> std=new ArrayList<>();
 std.add(s1);
 std.add(s2);
 std.add(s3);
 std.add(s4);
 std.add(s5);
 std.add(s6);
 std.add(s7);
 std.add(s8);
 std.add(s9);
 std.add(s10);
 std.add(s11);
 std.add(s12);
 
 List<Student> a=std.stream().filter(x->x.getAge()>14).collect(Collectors.toList());
 Long b=std.stream().filter(x->x.getAge()>14).count();
 List<String> g=std.stream().filter(x->x.getAge()>14).map(x->x.getName()).collect(Collectors.toList());
 a.forEach(x->System.out.println(x));
 System.out.println(b);
 g.forEach(x->System.out.println(x));
 

	}

}
