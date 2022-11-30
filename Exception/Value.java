package Exception;

public class Value {

	public static void main(String[] args) {
   int[] nums= {1,3,5,7,6,5,7,8,9};
   
   for(int i=0;i<nums.length;i++) {
	 for(int j=i+1;j<nums.length;j++) {
		 if(nums[i]==nums[j]) {
			 System.out.println(nums[i]);
		 }
	 }
	   
   }

	}

}
