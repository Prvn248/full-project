package Lms;

public class UseFridge {

	public static void main(String[] args) {
		String [] word=args[0].split("@");
		Fridge fridge1=new Fridge();
		fridge1.brand=word[0];
		fridge1.price=Integer.parseInt(word[1]);
		fridge1.colour=word[2];
		fridge1.taxAmount=Integer.parseInt(word[3]);
		fridge1.netPrice=(fridge1.price+fridge1.taxAmount);
		
		String [] word1=args[1].split("@");
		Fridge fridge2=new Fridge();
		fridge2.brand=word1[0];
		fridge2.price=Integer.parseInt(word1[1]);
		fridge2.colour=word1[2];
		fridge2.taxAmount=Integer.parseInt(word1[3]);
		fridge2.netPrice=(fridge1.price+fridge1.taxAmount);
		
		System.out.println("Brand = "+fridge1.brand+" , "+fridge2.brand);
		System.out.println("Colour = "+fridge2.colour+" , "+fridge2.colour);
		System.out.println("Net Price = "+fridge1.netPrice+" , "+fridge2.netPrice);
		
		
		

	}

}
