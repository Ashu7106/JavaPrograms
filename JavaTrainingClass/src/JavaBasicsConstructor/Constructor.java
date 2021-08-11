package JavaBasicsConstructor;

public class Constructor {

	public static void main(String[] args) {
		
		Constructor Con=new Constructor();
		Constructor Con1=new Constructor(10);
		Constructor Con2=new Constructor(10,20);
}
	
	//Default Constructor 
	
	Constructor(){ // no arguments pass in para
		
	System.out.println("default Const");	
		
	}
	
	//parameterized Constructor 
	
	Constructor(int a){ // one input arguments in para
		
		System.out.println(a);
		
	//Constructor Overloading	
	}
	
     Constructor(int x, int y){ // two input argument in parameter
		
		System.out.println(x+y);
     }

     
     
     
}
