package Collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class Treemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		TreeMap<Integer, String> Map= new TreeMap<>();
		
		      Map.put(10000, "ashish");
		      Map.put(5000, "karan");
              Map.put(14000, "rahul");
		      Map.put(16000, "kajal");
		      Map.put(20000, "david");
		      Map.put(15000, "ricky");
		      
		      Map.forEach((k,v)->System.out.println(k+" "+v));
		      
		      //find lastkey
		      
		      System.out.println(Map.lastKey());
		      
		      //firstkey
		      
		      System.out.println(Map.firstKey());
		
               //less than 16000
		      
		              Set<Integer> lessthan16000 = Map.headMap(16000).keySet();
		             System.out.println(lessthan16000);
		      
		       //greater than 16000
 	 
	                        Set<Integer> greatthan16000=Map.tailMap(16000).keySet();
	                                    
	                           System.out.println(greatthan16000);
	
	
	// treeMap in descending order by passing method in constructor comparator.reverseOrder();
                    TreeMap<String, String> Map1= new TreeMap<>(Comparator.reverseOrder());
                    
                    Map1.put("john", "cena");
                    Map1.put("triple", "h");
                    Map1.put("randy", "orton");
                    Map1.put("stone", "gold");
                    Map1.put("big", "show");
                    Map1.put("mia", "khalifa");
              
                   System.out.println(Map1);
                   
                   Map1.forEach((k,v)->System.out.println(k+" "+v));
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                    
                    
                    
	}

}
