package Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> hs= new HashSet<String>();
		
		hs.add("Java");
		hs.add("Selenium Webdriver");
		hs.add("TestNg");
		hs.add("Maven");
		hs.add("Jenkins");
		hs.add("Cucumber");
		
		// By Iterator
		Iterator<String> it=hs.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
			
		}
		
		// for each loop
		     for(String s:hs){
			
			System.out.println(s);
		}
		
		Set<Integer> first= new HashSet<Integer>();
		
		
        first.addAll(Arrays.asList(new Integer[] {1,2,3,4,5,6,7,9,13}));
        
        Set<Integer> second= new HashSet<Integer>();

         second.addAll(Arrays.asList(new Integer[] {1,2,3,4,5,6,8,10,11}));
         
         //union of two set means combining two sets
          
         Set<Integer> union=new HashSet<Integer>(first);
         union.addAll(second);
         System.out.println("union of two sets is:-");
         
         System.out.println(union);
         
         System.out.println("");
          
          //intersection of two sets means common elements btw two
         
         Set<Integer> intersection =new HashSet<Integer>(first);
         
         intersection.retainAll(second);
         
         System.out.println("intersection of two sets is:-");
         System.out.println(intersection);
          
         //differnce of elements btw two sets
        Set<Integer> diff = new HashSet<Integer>(first);
        
        diff.removeAll(second);
        System.out.println("differnce of elements btw two sets is:-");
        System.out.println(diff);
        
	}

}
