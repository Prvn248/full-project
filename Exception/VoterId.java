package Exception;

public class VoterId {

	public static void main(String[] args) throws InvalidAge {
		try {
			int age=18;
			if(age<18) {
				throw new InvalidAge("person can't apply VoterId");
			}
			else {
				System.out.println("VoterId Eligible");
			}
		}catch(ArithmeticException ae) {
			System.out.println(ae);
		}

	}

}
