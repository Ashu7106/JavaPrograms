package OOPConceptPart1;

public class CallByReference {
	
	int a;//global variables
	int b;
	
	public static void main(String[] args) {
		
	
		
		 CallByReference obj1= new  CallByReference();//object of class 
		 
		 obj1.a=100;// class instance variables has assigned values by object reference of class CallByReference
		 obj1.b=200;
		 
		 obj1.swap(obj1);
      System.out.println(obj1.a);
      System.out.println(obj1.b);	
	}

	public void swap( CallByReference x) {//we have passed class name and its reference variable as argument in method parameter
	
		 int temp;
		 temp=x.a;
		  x.a=x.b;
		  x.b=temp;
		}
	
	
	
	
	
	
}
