package OOPConceptPart1;

public class StaticNonStatic {
	//global variables static non static variables
	int sum=100;//non-static variable
	static int age=25; //static variable
	
	public static void main(String[] args) {
		
	apm(); //to call static methods we can directly calling methodname()
	StaticNonStatic.apm();// or by its classname .methodname()
	
	System.out.println(age); // we call global static variable directly 
	System.out.println(StaticNonStatic.age);// or by classname .variablename	
	}
	
	//static non-static methods
	public void jvm() {// non static methods
		
	System.out.println("non-static method");	

	}
  public static void apm() {//static method
	  
	  System.out.println("static method");
  }
}
