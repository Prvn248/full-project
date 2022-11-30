package Exception;

public class NumberFormat {

	public static void main(String[] args) {
		String name="Praveen";
		try {
			int num=Integer.parseInt(name);
		}
        catch(NumberFormatException n) {
        	System.out.println("The Name can't be converted into number" );
        }
	}

}
