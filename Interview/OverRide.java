package Interview;

public class OverRide {
	
	public void maximam(int a) {
		if(a>=100) {
			System.out.println (a+" is greater");
		}
		else {
			System.out.println(a+"is lessthan");
		}
	}
	public String maximum(String a,String b) {
		if(a.length()>=b.length()) {
			return(a+"is length is high");
		}
		else
		{
		return(b+"length is high");	
		}
	}

}
