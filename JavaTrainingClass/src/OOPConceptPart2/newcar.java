package OOPConceptPart2;

public class newcar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Single Level Inheritance
		
	bmw bm= new bmw(); //child class extends parent Car class 
	

	
	bm.Start(); //Overridden Method from Parent Class.it is also called as static polymorphism or compile time polymorphism 
	
	
	bm.Stop();	
	bm.model();
	
	
	//  Multilevel Inheritance
	
	Audi a=new Audi(); // extends child class bmw
	
		a.model();
		a.NewModel();
		a.Stop();
	
		// Hierarchical Inheritance
		
	Vehicale v=new Vehicale(); // extends child  class Parent class 
		v.bs4engine();
		v.bs6engine();	
		v.Start();
		v.Stop();
	
	
	
	}		
}