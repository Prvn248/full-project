package Exception;

public class NestedCatch {

	public static void main(String[] args) {
	 try {
		 String[] words= {"vishnu","saran","robert"};
		 System.out.println(words[7]);
		 System.out.println(words[1].charAt(10));
		 int num=Integer.parseInt(words[1]);
	 } catch(ArrayIndexOutOfBoundsException ae) {
		 System.out.println(ae);
	 }

	}

}
