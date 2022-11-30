package For3;

public class UsePen {

	public static void main(String[] args) {
     Pen pen1=new Pen();
     pen1.brand="Renolds";
     pen1.colour="Black";
     pen1.isQuality=true;
     pen1.price=10;
     
     Pen pen2=new Pen();
     pen2.brand="Cello";
     pen2.colour="Red";
     pen2.isQuality=true;
     pen2.price=15;
     
     Pen pen3=new Pen();
     pen3.brand="Camlin";
     pen3.colour="Blue";
     pen3.isQuality=true;
     pen3.price=30;
     
     Pen[] pens= {pen1,pen2,pen3};
     for(Pen p:pens) {
    	 System.out.println(p.brand+" "+p.colour+" "+p.isQuality+" "+p.price);
    	 
     }
   int min=pens[0].price;
     for(Pen a:pens) {
    	 if(a.price<=min) {
    		min =a.price;
    	 }
     }
    		 System.out.println(min);
    	 
     }
     

	}


