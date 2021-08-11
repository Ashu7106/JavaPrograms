package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//array is to stored similar data types value in a array	
		
		int i[]=new int[10];
		
		i[0]=10;
		 i[1]=30;
		 i[2]=40;
		 i[3]=50;
		 i[4]=60;
		 i[5]=70;
		 i[6]=80;
		 i[7]=90;
		 i[8]=100;
		 i[9]=110;
		
		 System.out.println(i[0]);
		 System.out.println(i.length);
		 
		 for(int k=0; k<i.length; k++){
			 
			 System.out.println(i[k]);
		
			 
		 } 
		 
		 
    double d[]=new double[5];
    
    d[0]=1.7;
    d[1]=2.5;
    d[2]=3.5;
    d[3]=4.5;
    d[4]=5.5;
    
    
    System.out.println(d.length);
    
    
    for(int p=0; p<d.length; p++) {
    	
    System.out.println(d[p]);
    	
    }
    	
    // **In 1d array  we are not able to insert different type of data type like integer,string,double over come this we use object array.
   /*size is fixed in 1d array like we cannot add more values if we have declare array with fixed size so to overcome that we use --collection,array list,
     hash table,dynamic array */
    
    //Object array
    
    Object ob[]=new Object[4];
    
    
    ob[0]="Ashish";
    ob[1]=12345;
    ob[2]="12/01/1991";
    ob[3]="Amravati";
    
    System.out.println("employee name:-"+ob[0]);

    System.out.println("employee id:-"+ob[1]);

    System.out.println("employee birthdate:-"+ob[2]);

    System.out.println("employee city:-"+ob[3]);
    
    
    
    
    for(int e=0;e<ob.length;e++) {
    	
    	System.out.println(ob[e]);
    }
    	
    
    	
    	
    
	}
}
    	


