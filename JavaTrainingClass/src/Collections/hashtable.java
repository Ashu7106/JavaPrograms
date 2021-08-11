package Collections;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;

public class hashtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Hashtable<String, String> ht= new Hashtable<>();
		
		ht.put("France","Paris" );
		ht.put("Germany","Munich" );
		ht.put("UK","London" );
		ht.put("India","New Delhi");
		  
		System.out.println(ht.get("France"));
		
		Iterator<String>  It=ht.keySet().iterator();
		
		         while(It.hasNext()) {
		        	 
		        	String Keys=It.next(); 
		            String values= ht.get(Keys);
		            
		            System.out.println(Keys+" "+values);
		         }
		   
		       
		
		   ht.forEach((k,v)->System.out.println(k+""+v));
	                    
		  Iterator<Entry <String, String>> It1= ht.entrySet().iterator();
		                     
		                              while(It1.hasNext()) {
		                            	  
		                            Entry<String, String> Entries=It1.next();  
		                            
		                             System.out.println(Entries.getKey()+" "+Entries.getValue());             	  
		   
		                             
		        }		
	
	                                     	                                          
	}

}
