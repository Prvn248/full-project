package Oops1;

public class UseOffice {

	public static void main(String[] args) {
		Employee employee=new Employee("raja",501,25000);
		Office office=new Office("Infosys",200,"Tambaram",employee);
		
		System.out.println(office);

	}

}
