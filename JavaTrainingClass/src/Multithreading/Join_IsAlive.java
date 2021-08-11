package Multithreading;

public class Join_IsAlive {
	//1.Join() method is used for if two threads are running and main also running one thread then between these two 	
	// thread main thread will occurred so to avoid these join() is used	

	//IsAlive method is used to check thread is in running state or not	


	public static void main(String[] args)throws Exception {
		Thread t3=new Thread(() -> 
		{
			for(int i=0;i<5;i++) {

				System.out.println("1");	
				try{Thread.sleep(1000);} catch(Exception e) {}
			}	
		});

		Thread t4=new Thread(() ->
		{
			for(int i=0;i<5;i++) {

				System.out.println("A");
				try{Thread.sleep(1000);} catch(Exception e) {}

			}
		});
		 //will check thread is in running state or not
		t3.start();
		System.out.println(t3.isAlive());
		try {Thread.sleep(50);} catch (InterruptedException e) {}
		t4.start();
		t3.join(); //join method will stop main thread to occur between t3 t4 thread
		t4.join();

		System.out.println("hi"); //this is run by main() thread and is coming between t3 t4 thread 

	}

}
