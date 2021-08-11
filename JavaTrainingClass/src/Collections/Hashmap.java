package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

 class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    HashMap<Integer, String> Hash= new HashMap<Integer, String>();
		
    Hash.put(0,"zero");
    Hash.put(1,"one");
    Hash.put(2,"two");
    Hash.put(3,"three");
    Hash.put(4,"four");
 
    
    
                                        
                        
                	 //Using keySet
	  
	  
	                  Iterator<Integer>  It= Hash.keySet().iterator();
	                    
	                    while(It.hasNext()) {
	                    	
	                    	        Integer keys= It.next();
	                    	                    
	                    	        String Value= Hash.get(keys);
	                    	        
	                    	        System.out.println("keys"+" "+keys+ "  "+"values"+" "+Value);
	                    	        
	                    	 
	                    }
 
                 
                         //Using EntrySet
           
                          Iterator<Entry <Integer, String>> It1= Hash.entrySet().iterator(); 
                                 
                                    while(It1.hasNext()) {
                                    	
                                   Entry<Integer, String> Set =It1.next();
                                         System.out.println(Set.getKey()+" "+Set.getValue());
                                   
                                    }
                          
	}


}