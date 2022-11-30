package For2;

public class NoOfCount {

	public static void main(String[] args) {
	String[] words= {"laptops","mouse","moniters","cpu","keyboards","printer","webcams"};
	  int words1=0;
	  int words2=0;
	for(int i=0;i<words.length;i++) {
		   if(words[i].endsWith("s")) {
			   words1=words1+1; }
			  else {
				  words2=words2+1;
				 
			  }
			   
		   }
			System.out.println(words1) ;
			System.out.println(words2);
			
	}
}
	
