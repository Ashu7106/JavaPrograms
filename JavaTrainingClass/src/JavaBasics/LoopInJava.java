package JavaBasics;

public class LoopInJava {

	public static void main(String[] args) {
	 
		//******************while and for loop in java *****************************
		
		
		/*int i=0;
		while(i<=10) {
			
		System.out.println(i);
	
		i=i+1;
		
	}
		
	  int k;
	  
	for(k=10;k>=-10;k--) {
		
		
	System.out.println(k);	
		
		
	}*/
/*       ****** 
         **** 
         *** 
		 ** 
		 *        */
		
	
    for(int j=1;j<=5;j++) {//rows
	  
    	for(int i=5;i>=j;i--) {//columns
		 
          System.out.print("*");	
	         
	   }
	     
	        System.out.println(" ");
	}
	
   
    /*       * 
             ** 
             ***     
             ****     
             *****     
                  
                    */
	
	for(int i=1;i<=5;i++) {// rows
		
		
	   for(int j=1  ;j<=i;j++ ){//columns  
		
	     System.out.print("*");	
	     }
	 	  System.out.println();
	   }
	
	
	for(int i=1;i<=5;i++) {// rows
		
		
		   for(int j=1;j<=i;j++){//columns  
			
		     System.out.print("*");	
		     }
		 	  System.out.println();
		   }
	
	
	
		
	}

}
