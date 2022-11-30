package Collection2;

import java.util.HashMap;

public class Lms {

	public static void main(String[] args) {
   HashMap<Integer,String> lms=new HashMap<>();
   lms.put(501,"Vinoth");
   lms.put(502,"Praveen");
   lms.put(503,"Raj");
   lms.put(504,"Surya");
   lms.put(505,"Vikram");
   for(Integer id:lms.keySet()) {
	   System.out.println(id);
	   System.out.println(id+" "+lms.get(id));
   }
   for(String name:lms.values()) {
	   System.out.println(name);
   }
  lms.forEach((x,y)->System.out.println(x+" "+y));
  lms.keySet().forEach(x->System.out.println(x));
  lms.values().forEach(x->System.out.println(x));
  
  for(Integer id:lms.keySet()) {
	  if(id%2==0) {
		  System.out.println(id+" is odd");
	  }
	  else {
		  System.out.println(id+" is even");
	  }
  }
  lms.values().forEach(x->{if (x.startsWith("V")) {System.out.println(x);}});
  for (String name:lms.values()) {
	  if(name.contains("a")||name.contains("e")||name.contains("i")||name.contains("o")||name.contains("u")) {
		  System.out.println(name+" contains vowels");
	  }
	  else {
		  System.out.println(name+" doesn't contains vowels");
	  }
  }
	}

}
