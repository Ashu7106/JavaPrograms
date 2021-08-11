package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class linkedlist {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll= new LinkedList<>();
		
		ll.add(1);
		ll.add(2);
		ll.add(5);
		ll.add(9);
		ll.add(6);
		ll.add(8);
		
		System.out.println(ll.size());
		System.out.println(ll.lastIndexOf(ll));
		ll.addFirst(10);
		System.out.println(ll);
		ll.addLast(7);
		System.out.println(ll.get(3));
		ll.removeFirst();
        System.out.println(ll);
        
        Collections.sort(ll);
        System.out.println(ll);
        
        
        
        
	}

}
