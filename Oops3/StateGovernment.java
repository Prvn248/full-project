package Oops3;

public abstract class  StateGovernment implements CentralGovernment {
public abstract String stateCode(String code);
public String noPlateColor(String color) {
	if(color.equals("white")) {
		return "Own Vehicle";
	}
	else {
		return "Rented Vehicle";
	}
}

}
