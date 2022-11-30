package Oops3;

public class UseDistrictGovernment {
	public static void main(String[]args) {
		DistrictGovernment dg=new DistrictGovernment();
		dg.noPlate();
		System.out.println(dg.noPlateSize(7));
		System.out.println(dg.stateCode("TN"));
		System.out.println(dg.noPlateColor("white"));
	}

}
