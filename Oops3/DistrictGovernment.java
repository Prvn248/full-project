package Oops3;

public class DistrictGovernment extends StateGovernment {
	public String platNo(int num) {
		if(num==0 ||num==1||num==2||num==3||num==4||num==5) {
			return "It is Chennai vehicle";
		}
		else {
			return "It is Other State Vehicle";
			
		}
	}
		public void noPlate() {
			System.out.println("Every Vehicle Should Need No Plate");
		}
		public String noPlateSize(int size) {
			if(size==5) {
				return "it is bike";
			}
			else {
				return "It is Car";
			}
			}
		public String stateCode(String code) {
			if(code.equals("TN")) {
				return "It is TamilNadu Vehicle";
			}
			else {
				return "It is Other State Vehicle";
			}
		
		
	}

}
