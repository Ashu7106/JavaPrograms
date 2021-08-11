package Collections;

import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class concurrenthashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map <String, String> map1= new HashMap<String, String>();
		
		    
			
		   Map<String, String> sync= Collections.synchronizedMap(map1);
		   sync.put("Ashish", "Ashu");
		   
		   System.out.println(sync.get("Ashish"));
		   
		   
		   
		   
		 ConcurrentHashMap<String, String> Con= new ConcurrentHashMap<>();
		 
		 Con.put("EmpName 1","Ashish");
		 Con.put("EmpName 2","Rahul");
		   
          System.out.println(Con.get("EmpName 1"));
		   
		   
		
		   
		

	}

}
