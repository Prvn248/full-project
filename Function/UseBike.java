package Function;

public class UseBike {

	public static void main(String[] args) {
      Bike bike1=new Bike();
      bike1.brand="Hero";
      bike1.price=85000;
      bike1.taxAmount=10000;
      bike1.colour="Black";
      bike1.netPrice=(bike1.price+bike1.taxAmount);
      
      Bike bike2=new Bike();
      bike2.brand="Honda";
      bike2.price=87000;
      bike2.taxAmount=12000;
      bike2.colour="Brown";
      bike2.netPrice=(bike1.price+bike1.taxAmount);
      
      Bike bike3=new Bike();
      bike3.brand="pulser";
      bike3.price=100000;
      bike3.taxAmount=15000;
      bike3.colour="red";
      bike3.netPrice=(bike1.price+bike1.taxAmount);
      
      Bike bike4=new Bike();
      bike4.brand="yamaha";
      bike4.price=125000;
      bike4.taxAmount=21000;
      bike4.colour="White";
      bike4.netPrice=(bike1.price+bike1.taxAmount);
      
      Bike[] bikes= {bike1,bike2,bike3,bike4};
      System.out.println(bike1.findMax(bikes));
	}

      
      

	}


