package Collection2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class UseMobile {

	public static void main(String[] args) {
	Mobile m1=new Mobile("Samsung",1,true,3500);
	Mobile m2=new Mobile("Vivo",2,false,4500);
	Mobile m3=new Mobile("RealMe",3,true,5500);
	Mobile m4=new Mobile("Readmi",4,false,6500);
	Mobile m5=new Mobile("Sony",5,true,7500);
	
	HashMap<Integer,Mobile> mobiles=new HashMap<>();
	mobiles.put(1,m1 );
	mobiles.put(2,m2 );
	mobiles.put(3,m3 );
	mobiles.put(4,m4 );
	mobiles.put(5,m5 );
	mobiles.forEach((x,y)->System.out.println(mobiles.get(x)));
	ArrayList<Mobile> android=new ArrayList<>();
	
	mobiles.values().forEach(x-> {if(mobiles.isAndroid==true) {android.add(x);}});
	
	
	int max=0; Mobile a=m1;
	for(Mobile m:mobiles.values()) {
		if(m.getRam()>max) {
			max=m.getRam();
			a=m;
		}
	}
	System.out.println(a);
	Iterator<Mobile> i=mobiles.values().iterator();
	while(i.hasNext()) {
		if(i.next().getBrand().contains("a")) {
			i.remove();
		}
	}
	mobiles.forEach((x,y)->System.out.println(y));
	for(Integer mob:mobiles.keySet()) {
		System.out.println(mobiles.get(mob));
	}
	

	}

}
