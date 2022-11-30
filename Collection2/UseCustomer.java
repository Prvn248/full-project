package Collection2;

import java.util.HashMap;
import java.util.Iterator;

public class UseCustomer {

	public static void main(String[] args) {
      Customer c1=new Customer("Vinoth",25,20000,876456789465l);
      Customer c2=new Customer("Ram",30,25000,984569789465l);
      Customer c3=new Customer("Praveen",35,23000,677685409365l);
      Customer c4=new Customer("Vikram",40,30000,174847585465l);
      Customer c5=new Customer("Surya",45,35000,567868449465l);
      
      HashMap<Long,Customer> c=new HashMap<>();
      c.put(c1.getAadharNum(), c1);
      c.put(c2.getAadharNum(), c2);
      c.put(c3.getAadharNum(), c3);
      c.put(c4.getAadharNum(), c4);
      c.put(c5.getAadharNum(), c5);
      for(Long num:c.keySet()) {
    	  System.out.println(num);
      }
      for(Long num:c.keySet()) {
    	  System.out.println(num+" "+c.get(num));
      }
      for(Customer customers:c.values()) {
    	  System.out.println(customers);
      }
      c.forEach((x,y)->System.out.println(x+" "+y));
      for(Customer customers:c.values()) {
    	  if(customers.getSalary()>=30000) {
    		  System.out.println(customers);	  
    	  }
    	  }
      int max=0; String temp="";
      for(Customer customers:c.values()) {	
    	  if(customers.getAge()>max) {
    		  max=customers.getAge();
    		  temp=customers.getName();
    	  } 
      }
         System.out.println(temp);
         int min=c1.getAge(); Customer a=c1;
         for(Customer customers:c.values()) {
       	  if(customers.getAge()<min) {
       		  min=customers.getAge();
        		  a=customers;  
	}
}
         System.out.println(a);
         Iterator<Customer> itr=c.values().iterator();
         while(itr.hasNext()) {
        	 if(itr.next().getName().startsWith("S")) {
        		 itr.remove();
        	 }
         }
         System.out.println(c);
         c.forEach((x,y)->System.out.println(y));
         Iterator<Customer> i=c.values().iterator();
         while(i.hasNext()) {
        	 if(i.next().getAge()<26) {
        		 i.remove();
        	 }
         }
         c.forEach((x,y)->System.out.println(y));
         Iterator<Long> id=c.keySet().iterator();
         while(id.hasNext()) {
        	 if(id.next()==876456789465l) {
        		 id.remove(); 
        	 }
         }
         c.forEach((x,y)->System.out.println(x));
         Iterator<Customer> num=c.values().iterator();
         while(num.hasNext()) {
        	 if(num.next().getName().length()>5) {
        		 num.remove();
        	 }
         }
         c.forEach((x,y)->System.out.println(y));
        	 }
         }
         
	

