package Multithreading;


/* To make code efficient and take less space in memory we can write this program were less classes and objects and methods will
be used with help of lambda expression. */

//class number implements Runnable { this class is used once so we can remove it.

//	public void run() {  //this method is used once so we can remove it.



/*	}
/*}
//class alphabet  implements Runnable{ //this class is used once so we can remove it.


	//public void run() {  //this method is used once so we can remove it.




	}

}


	   /*Runnable n=new number(); // now this also becomes runnable object after implementing runnable interface by class 
		try{Thread.sleep(50);}catch(Exception e){}
		Runnable a=new alphabet();*/

// run() method is in runnable but start() is present is thread so pass runnable object in thread constructor*/



public class Bylambda {

	public static void main(String[] args){


		//by anonymous class if its implementing interface

		Runnable obj1=new Runnable() {

			public void run() {

				for(int i=0;i<5;i++) {

					System.out.println("1");	
					try{Thread.sleep(1000);} catch(Exception e) {}
				}	

			}
		};		

		Runnable obj2=new Runnable() {
			public void run() {
				
				for(int i=0;i<5;i++) {

					System.out.println("A");
					try{Thread.sleep(1000);} catch(Exception e) {}

				}

			}
		};

		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);

		t1.start();
		try {Thread.sleep(50);} catch (InterruptedException e1) {}
		t2.start();


 //In the above example obj1 and obj2 are used only once so removing both and method which also used once by creating anonymous class
		Thread t3=new Thread(() -> //in runnable interface run method is having function i.e lambda -> so instead of interface we used lambda
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

		//	t3.start();
		//	t4.start();

	}

}
