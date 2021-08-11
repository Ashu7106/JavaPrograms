package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import JavaBasics.NumbersLoops;

public class arraylist {

	public static void main(String[] args) {


		List<String> al=new ArrayList<String>();

		al.add("Ashish");
		al.add("Ashwini");
		al.add("Rupali");
		al.add("Ashu");	
		al.add("Atharvaa");

		System.out.println(al.size());
		System.out.println(al.get(2));
		System.out.println(al.indexOf("Ashwini"));
		System.out.println(al.contains("ashu") );
		System.out.println(al.remove("Ashu"));
		System.out.println(al.lastIndexOf("Atharvaa"));


		// iterate using for loop 

		  for(int i=0;i<al.size();i++) {

			   System.out.println(al.get(i));

			    }
		   System.out.println("-----------------------");

		//iterate using for each

		   	for(String s:al){

		   		System.out.println(s);
		   	}

		   		System.out.println("--------------------------");

		   //iterate using Iterator() Method

             Iterator<String> it=al.iterator();		   
             		while(it.hasNext()) {

             			System.out.println(it.next());
             		}

	            System.out.println("--------------------------");

             		//using lambda expression 

	                al.stream().forEach(li->System.out.println(li));



		// compare two ArrayList

		List<String> list=new ArrayList<String>();

		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");


		List<String> list2= new ArrayList<String>();

		list2.add("A");
		list2.add("B");
		list2.add("C");
		list2.add("E");


		System.out.println(list.equals(list2));
		list.addAll(list2);
		list.stream().forEach(l ->System.out.println(l));
		System.out.println(list);
		list.removeAll(list2);

		System.out.println(list);


		//different way creating arraylist

		ArrayList<Integer> list3 = new ArrayList<Integer>(Arrays.asList(1,12,14,3,4,5,6,7)); 
		ArrayList<Integer> list4 = new ArrayList<Integer>(Arrays.asList(4,5,7,8,9,10,11,15,16,13));
		Collections.sort(list3); //sorted list
		System.out.println(list3); 
		Collections.sort(list4);
		System.out.println(list4);

		list3.removeAll(list4);
		System.out.println(list3);

		list3.retainAll(list4); // common elements
		System.out.println(list3);

		list3.equals(list4);// show list have same elements

		System.out.println(list3);


		// sublist method to get selective values from arraylist

		List<Integer> list6= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8));
		List<Integer> Sublist= new ArrayList<Integer>(list6.subList(2, 4));
		System.out.println(Sublist);    


		//covert Arraylist to Array 

		List<String> arr=new ArrayList<String>(Arrays.asList("a","b","c","d"));

		Object ar[]= arr.toArray();

		System.out.println(Arrays.toString(ar));

		for(Object o:ar) {

			System.out.println(o);
		}

		//remove duplicate elements from ArrayList by using hashset

		List<Integer> el= new ArrayList<Integer>(Arrays.asList(1,2,3,3,4,4,5,6,7,8,8,9,10));

		HashSet<Integer> hs=new HashSet<>(el);

		List<Integer> remvdup=new ArrayList<Integer>(hs);

		System.out.println(remvdup);
		
		//using Stream 
   
		List<Integer> nodup= el.stream().distinct().collect(Collectors.toList());
		
	   	    System.out.println(nodup);
		
		
		
		//create synchronize ArrayList

		List<Integer> list9= new ArrayList<Integer>(Arrays.asList(1,2,3,3,4,4,5,6,7,8,8,9,10));
		
          List<Integer>  Sync=Collections.synchronizedList(list9);  

               synchronized (Sync) {
            	   
            	 Iterator<Integer> It1=Sync.iterator();  
				
            	 while(It1.hasNext()) {
            		 
            		System.out.println(It1.next()); 
            		 
            	 }
            	 
			}



	} 


}
