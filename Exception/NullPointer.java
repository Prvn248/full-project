package Exception;

public class NullPointer {

	public static void main(String[] args) {
	String val=null;
	try {
		System.out.println(val.length());
	}
	catch(NullPointerException n) {
		System.out.println("The variable has a null value");
		
	}

	}

}
