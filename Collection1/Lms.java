package Collection1;

import java.util.ArrayList;

public class Lms {
	public static void main(String[]args) {
		ArrayList<Integer> lms=new ArrayList<>();
		lms.add(800);
		lms.add(815);
		lms.add(820);
		lms.add(825);
		lms.add(830);
		lms.add(835);
		lms.set(2,822);
		lms.remove(4);
		System.out.println(lms.get(2));
		System.out.println(lms);
		lms.add(3,300);
		System.out.println(lms.get(3));
		
		
	}

}
