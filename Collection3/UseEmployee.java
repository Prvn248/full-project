package Collection3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class UseEmployee {

	public static void main(String[] args) {
	 Employee e1=new Employee("Raguram","manager",501,25000);
	 Employee e2=new Employee("vikram","plumber",502,20000);	
	 Employee e3=new Employee("Ramkumar","architect",503,35000);
	 Employee e4=new Employee("surya","driver",504,38000);
	 Employee e5=new Employee("pandi","developer",505,40000);
	 Employee e6=new Employee("sivabalan","SystemEngineer",506,45000);
	 ArrayList<Employee> emp=new ArrayList<>();
	 emp.add(e1);
	 emp.add(e2);
	 emp.add(e3);
	 emp.add(e4);
	 emp.add(e5);
	 emp.add(e6);
	 
	 emp.stream().filter(x->x.getId()%2==0).forEach(x->System.out.println(x));
	List<Employee> a=emp.stream().filter(x->x.getId()%2==0).collect(Collectors.toList());
	long b=emp.stream().filter(x->x.getId()%2==0).count();
	List<String> c=emp.stream().filter(x->x.getId()%2==0).map(x->x.getName()).collect(Collectors.toList());
	Map<Integer,String> e=emp.stream().filter(x->x.getId()%2==0).collect(Collectors.toMap(x->x.getId(),x->x.getName()));
	System.out.println(a);
	System.out.println(b); 
	System.out.println(e);
	
	}

}
