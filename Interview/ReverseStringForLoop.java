package Interview;

public class ReverseStringForLoop {

	public static void main(String[] args) {
	String name="Praveen";
	String temp="";
	for(int i=name.length()-1;i>=0;i--) {
		temp=temp+(name.charAt(i));
	}
      System.out.println(temp);
	}

}
