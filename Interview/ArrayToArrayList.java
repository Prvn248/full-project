package Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToArrayList {
	public static void main(String[]args) {
	String[] words= {"a","b","c","d"};
	
   List<String> list=Arrays.asList(words);
   System.out.println(list);
   
   List<String> list1=new ArrayList<>();
   Collections.addAll(list1, words);
   System.out.println(list1);
   
   List<String> list2= new ArrayList<>();
   for(String text:words) {
	   list2.add(text);
   }
   System.out.println(list2); 
}
}