package Collection1;

import java.util.ArrayList;

public class Bike {
	public static void main(String[]args) {
		ArrayList<String> brand=new ArrayList<>();
		brand.add("hero");
		brand.add("honda");
		brand.add("yamaha");
		brand.add("pulser");
		brand.add("apache");
		
		for(int i=0;i<brand.size();i++) {
			System.out.println(brand.get(i).charAt(brand.get(i).length()-1));
		}
		brand.forEach(a->System.out.println(a));

		int max=0; String value="";
		for(String b:brand) {
			if(b.length()>max) {
				max=b.length();
				value=b;
		}
		}
			System.out.println(value);
			brand.forEach(a->{if(a.startsWith("h")) {System.out.println(a);}});
	}
	
}


