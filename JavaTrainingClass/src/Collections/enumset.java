package Collections;

import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;

public class enumset {
	
	enum Cars{
		
		MARUTI,
		HYUNDAI,
		HONDA,
		TATA,
		TOYOTA,
		MAHENDRA,
		SKODA,
		RENAULT,
		BMW,
		AUDI,
		
	}
   
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Creating enumset using allof() method
    
		EnumSet<Cars> Car1 =EnumSet.allOf(Cars.class);
		
		          System.out.println(Car1); 
		          
		          
		//     using of() method     
		          
		          EnumSet<Cars> Car2 =EnumSet.of(Cars.MAHENDRA, Cars.AUDI);
		          System.out.println(Car2);
		          
		       // using noneof() method   
		          
	              EnumSet<Cars> Car3=EnumSet.noneOf(Cars.class);
	              System.out.println(Car3);
	              
	            // using Range() method  
	              
	              EnumSet<Cars> Cars4=EnumSet.range(Cars.HONDA, Cars.BMW);
	                    
	              System.out.println(Cars4);
	              
	             //using Add and AddAll() Methods
	          	
	              EnumSet<Cars> Car5 =EnumSet.allOf(Cars.class);
	                     
	          	  EnumSet<Cars> Car6 =EnumSet.noneOf(Cars.class);
	              
	          	  	boolean b1=Car6.add(Cars.HONDA);
	          	  	System.out.println(b1);
	                         	  	
	                Car6.addAll(Car5.of(Cars.RENAULT));
	          	  	
	                System.out.println(Car6);
	                
	                //using remove and removeall method
	          	  	
	                EnumSet<Cars> Car7 =EnumSet.allOf(Cars.class);                
	              
	                	boolean b3=Car7.remove(Cars.MAHENDRA);				

	
	                	System.out.println(b3);	
	                	
	                	boolean b4=Car7.removeAll(Car7);
	                          
	                       System.out.println(b4);
	
	
	
	                       Iterator<Cars> It=Car1.iterator();
	 
	                       	while(It.hasNext()) {
	                       	 	
	                       	System.out.println(It.next());	
	                      
	                       	
	                       
	                       	
	                       	}
	                       	
	                       	
	                   
	                      
	
	} 
	
	

}
