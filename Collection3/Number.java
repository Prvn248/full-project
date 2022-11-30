package Collection3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Number {

	public static void main(String[] args) {
	ArrayList<Integer> num=new ArrayList<>();
	num.add(701);
	num.add(702);
	num.add(703);
	num.add(704);
	num.add(705);
	num.add(706);
	num.add(707);
	num.add(708);
	num.add(709);
	num.add(710);
	

	num.stream().filter(x->x%2==0).forEach(x->System.out.println(x));
	
	List<Integer> nums=num.stream().filter(x->x%2==0).collect( Collectors.toList());
	Long n=num.stream().filter(x->x%2==0).count();
	nums.forEach(x->System.out.println(x));
	System.out.println(n);
	}

}
