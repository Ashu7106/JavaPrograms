package OOPPolymorphism;

public class newcar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// static polymorphism or compile time polymorphism 	
	bmw bm= new bmw(); 
	
	bm.Start(); //Overridden Method 
	bm.Stop();	
	bm.model();
	
	//Dynamic or runtime polymorphism 
	
	Car c= new bmw(); 
	    c.reverse();
	    c.Start();
	    c.Stop();
	
	}		
}