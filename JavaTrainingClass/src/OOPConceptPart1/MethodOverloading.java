package OOPConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//main method overloading
		
 	
		MethodOverloading  m=new MethodOverloading ();
		
	    m.cook();
		m.cook(10);
		
	    m.cook(10, 40);
}
	 public static void  main(int q) {
		 
	 }
	 
	 public static void main(int q,int c) {
		 
	 }
		
	
	
	//Method overloading  notes- no duplicate method name allowed.no same number of similar data type is allowed.
	
	public void cook() { // zero inputs
		
	System.out.println("zero inputs arguments in parameters ");
	}

	public void cook(int i) { // 1 inputs
		
	System.out.println("1 inputs in parameters");	
	System.out.println(i);
	}
	
	public void cook(int a,int b) {//2 inputs
		
	System.out.println("2 inputs in parameters");	
	System.out.println(a+b);
	
	}
	
	public void cook(double d) { // 1 input but different data type
		
	System.out.println("1 input in parameter with  different datatype");	
	}	
	}

