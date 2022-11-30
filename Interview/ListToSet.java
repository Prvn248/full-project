package Interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListToSet {
	    public static void main(String[] args)
	    {
	  
	        // Creating a list of strings
	        List<String> aList = Arrays.asList("Geeks", "for",
	                     "GeeksQuiz", "GeeksforGeeks", "GFG");
	  
	        Set<String> hSet = new HashSet<String>();
	        for (String x : aList)
	            hSet.add(x);
	  
	        System.out.println("Created HashSet is");
	        for (String x : hSet)
	            System.out.println(x);
	  
	    }
	}

