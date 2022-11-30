package For2;

public class PrintMaximumLength {

	public static void main(String[] args) {
     String[] words= {"bmw","benz","ford","volvo"};
     int max=0;
     String words1=""; 
     
     for(int i=0;i<words.length;i++) {
     
     
    	if(words[i].length()>max){
    	max=words[i].length();
    	words1=words[i];
    	}
    	
    	 
     }
     System.out.println(words1);
     
     String words2=words[1];
     
     for(int i=0;i<words.length;i++){
     if(words[i].length()<words2.length()){
       words2=words[i];
       }
       }
       
      System.out.println(words2);
      
     }
     
   }  

	


