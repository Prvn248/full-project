package Interview;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDublicate {

	public static void main(String[] args) {
	ArrayList<String> l=new ArrayList<String>();
	l.add("raj");
	l.add("karthi");
	l.add("raj");
	l.add("Seetha");
	System.out.println(l);
	LinkedHashSet<String> s=new LinkedHashSet<String>(l);
	System.out.println(s);

	}

}
