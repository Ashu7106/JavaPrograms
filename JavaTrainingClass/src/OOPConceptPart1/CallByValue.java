package OOPConceptPart1;

public class CallByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 CallByValue obj=new CallByValue();
		 
		 
		 
		 int k=obj.sum(10, 20); // method is call by values 
		 
		 System.out.println(k);
		 
		 int x=50;
		 
		 int y=30;
		 
		 System.out.println(obj.sum(x, y));// ,method is call by values in x and y variable
		 
		 
	}
	
	
	  			public int sum(int a,int b) {
		
	  			   int c=10+20;	
	
	  			    return c;	
               	}

}
