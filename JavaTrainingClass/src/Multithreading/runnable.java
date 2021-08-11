package Multithreading;

class number implements Runnable { // runnable is interface has one method run()

	public void run() {  

		int i;
		for(i=0;i<5;i++) {

			System.out.println("1");	
			try{Thread.sleep(1000);} catch(Exception e) {}

		}
	}
}
class alphabet  implements Runnable{

	public void run() {

		int i;

		for(i=0;i<5;i++) {

			System.out.println("A");
			try{Thread.sleep(1000);} catch(Exception e) {}


		}

	}

}

public class runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		/*so*/ Runnable n=new number(); // now this also becomes runnable object after implementing runnable interface by class 
		try{Thread.sleep(50);}catch(Exception e){}
		Runnable a=new alphabet();	

		// run() method is in runnable but start() is present is thread so pass runnable object in thread constructor

		Thread t1=new Thread(n);
		Thread t2=new Thread(a);

		t1.start();
		t2.start();




	}

}
