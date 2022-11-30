package For2;

public class PrintMarks {

	public static void main(String[] args) {
		int counts1=0;
		int counts2=0;
      int[] marks= {65,73,26,35,65,46,83,31,56,27};
      for(int i=0;i<marks.length;i++) {
    	  if(marks[i]>=1 && marks[i]<=50) {
    		  counts1=counts1+1;
    	  }
    	  else {
    		  counts2=counts2+1;
    		  
    	  }
    	  
      }
      System.out.println(counts1);
      System.out.println(counts2);
	}

}
