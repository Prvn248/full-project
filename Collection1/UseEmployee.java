package Collection1;

import java.util.ArrayList;

public class UseEmployee {

	public static void main(String[] args) {
	Employee e1=new Employee("Raj",30,"male",25000,"manager");
	Employee e2=new Employee("Ram",40,"male",35000,"driver");
	Employee e3=new Employee("seetha",28,"female",45000,"designer");
	Employee e4=new Employee("praveen",38,"male",28000,"architech");
	Employee e5=new Employee("rekha",30,"female",50000,"manager");
	
	ArrayList<Employee> emp=new ArrayList<>();
	emp.add(e1);
	emp.add(e2);
	emp.add(e3);
	emp.add(e4);
	emp.add(e5);
	ArrayList<Employee> femaleEmp=new ArrayList<>();
	for(int i=0;i<emp.size();i++) {
		if(emp.get(i).getgender().equalsIgnoreCase("female")) {
			femaleEmp.add(emp.get(i));
		}
	}
	for(Employee e:emp) {
		if(e.getgender())
		
	}
	for(int i=0;i<emp.size();i++) {
		System.out.println(emp.get(i));
	}

	for(Employee e:emp) {
		System.out.println(e);
	}
	emp.forEach(a->System.out.println(a));
	for(int i=0;i<emp.size();i++) {
		if(emp.get(i).getName().startsWith("R")) {
			System.out.println(emp.get(i));
		}
	
	}
	for(Employee e:employees) {
		if(e.getAge()>30) {
			System.out.println(e.getName());
		}
	}
		emp.forEach(x->{if(x.getAge()>30) {System.out.println(x.getName());}});
		
	
		
	}
	
	}


