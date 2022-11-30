package For2;

public class PrintEvenNumbers {

	public static void main(String[] args) {
        int[] nums=new int[6];
        nums[0]=3;
        nums[1]=4;
        nums[2]=7;
        nums[3]=10;
        nums[4]=9;
        nums[5]=12;
        for(int i=0;i<nums.length;i++) {
        	if(nums[i]%2==0) {
        		System.out.println(nums[i]);
        		
        	}
        
        
        }

	}

}
