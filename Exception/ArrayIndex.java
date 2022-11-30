package Exception;

public class ArrayIndex {

	public static void main(String[] args) {
		int[] nums= {1,2,3,4,5};
		try {
			System.out.println(nums[7]);
		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("The given Index num doesn't have value");
		}
	

	}

}
