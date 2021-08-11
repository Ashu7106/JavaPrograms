package Multithreading;

public class synchronize {

	int count;

	public synchronized void increment() {  //synchronize keyword will run one thread at a time i.e t1 will run first then t2 

		count++;	 //count=count+1

	}
	public static void main(String[] args)throws Exception {

		synchronize  s=new synchronize();

		Thread t1=new Thread(()-> //lambda expression function  present inside runnable interface  
		{
			for(int i=0;i<1000;i++) {

				s.increment();

			}
		}); 


		Thread t2=new Thread((new Runnable()  //object of runnable interface

				{

			public void run() {

				for(int i=0;i<1000;i++) {

					s.increment();
				}
			}


				}));



		t1.start();
		t2.start();// count will not be accurate because both thread are working at the same on increment method

		t1.join();
		t2.join();

		System.out.println("Count is "+" "+s.count);      


	}	

}
