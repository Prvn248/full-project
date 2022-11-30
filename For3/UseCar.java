package For3;

public class UseCar {

	public static void main(String[] args) {
	 Car car1=new Car();
	 car1.brand="Inova";
	 car1.colour="Black";
	 car1.price=500000;
	 car1.isQuality=true;
	 
	 Car car2=new Car();
	 car2.brand="Benz";
	 car2.colour="White";
	 car2.price=800000;
	 car2.isQuality=true;
	 
	 Car car3=new Car();
	 car3.brand="Honda";
	 car3.colour="Red";
	 car3.price=400000;
	 car3.isQuality=true;
	 
	 Car car4=new Car();
	 car4.brand="Audi";
	 car4.colour="Blue";
	 car4.price=900000;
	 car4.isQuality=true;
	 
	 Car[] cars=new Car[4];
	 cars[0]=car1;
	 cars[1]=car2;
	 cars[2]=car3;
	 cars[3]=car4;
	 
	 int m=0;
	 int max=0;
	 for(int i=0;i<cars.length;i++) {
		 if(cars[i].price>max) {
			 max=cars[i].price;
			 m=i;
		 }
	 }
	 System.out.println(cars[m].brand+" "+cars[m].colour+" "+cars[m].price+""+cars[m].isQuality);
	 int a=0; int num=cars[0].brand.length();
	 for(int i=0;i<cars.length;i++) {
		 if(cars[i].brand.length()>num) {
			 num=cars[i].brand.length();
			 a=i;
			 
		 }
			 
	 }
	System.out.println(cars[a].brand+" "+cars[a].colour+" "+cars[a].price+" "+cars[a].isQuality);
	
		 }
	 
			 
	 
}
	 
	

	


