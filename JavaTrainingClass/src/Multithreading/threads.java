package Multithreading;

class loop extends Thread { // thread is a class 
	
public void run(){ // run is method inside class thread its overriding run method of loop class	
	                
	int i;
	for(i=0;i<5;i++) {
		
		System.out.println("1");
		try{Thread.sleep(1000);} catch(Exception e){ }
		   
	}
		
	}
}
	
	class loop1 extends Thread{ 
		
		public void run(){
			int i;
			for(i=0;i<5;i++) {
				
				System.out.println("2");
				try{Thread.sleep(1000);} catch(Exception e){ }
			}
			}
		}

public class threads {

	public static void main(String[] args) {
	
		loop l=new loop();
		loop1 l1=new loop1();
		
		l.start(); // start () method in a thread class
		try{Thread.sleep(100);}catch(Exception e) {}
		l1.start();
		
		
		
		

	}

}
