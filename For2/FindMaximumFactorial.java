package For2;

public class FindMaximumFactorial {

	public static void main(String[] args) {
      int[] nums= {1,2,3,4,5};
      int nums1=1;
      for(int i=1;i<nums.length;i++) {
    	  if(nums1<nums[i]) {
    		  nums1=nums[i];
    		  
    		  
    	  }
      
      }
      System.out.println(nums1);
      int nums2=1;
      for(int i=nums1;i>=1;i--) {
    	  nums2=nums2*i;
    			  
    	  
      }
System.out.println(nums2);
	}

}
