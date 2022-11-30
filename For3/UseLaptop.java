package For3;

public class UseLaptop {

	public static void main(String[] args) {
		Laptop lap1=new Laptop();
		lap1.brand="acer";
		lap1.colour="white";
		lap1.price=30000;
		lap1.isQuality=true;
		lap1.size=500;
		
		Laptop lap2=new Laptop();
		lap2.brand="dell";
		lap2.colour="white";
		lap2.price=35000;
		lap2.isQuality=true;
		lap2.size=300;
		
		Laptop lap3=new Laptop();
		lap3.brand="hp";
		lap3.colour="black";
		lap3.price=20000;
		lap3.isQuality=true;
		lap3.size=500;
	
		
		Laptop [] laps= {lap1,lap2,lap3};
		for(int i=0;i<laps.length;i++) {
			System.out.println(("Brand = ")+laps[i].brand+(", Colour = ")+laps[i].colour+(", Price = ")+laps[i].price+(", Quality = ")+laps[i].isQuality+(", Size = ")+laps[i].size);
		}
		
	
}
			
		
		

}
