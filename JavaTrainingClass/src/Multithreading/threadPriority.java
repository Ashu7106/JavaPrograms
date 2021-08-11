package Multithreading;

public class threadPriority {

	public static void main(String[] args) {

		//1.set_name():-will set name to thread
		//2.get_name():- get name of thread	
		//3.passing direct name to thread in runnable object thread(()->,thread_name);	
		//4.get_priority():-will get execution priority of thread 	
		//5.set_priority():-will set execution priority of thread (1 means least ,5 means norm ,10 means high)
		//6.min, Max ,norm priority (constants):-(min means 1,norm means 5 ,max means 10)
		//7.thread.current_thread.get_priority():-will show current running thread priority during execution


		Thread t3=new Thread(() -> 
		{
			for(int i=0;i<5;i++) {

				System.out.println("1"+Thread.currentThread().getPriority());	
				try{Thread.sleep(1000);} catch(Exception e) {}
			}	
		},"numeric thread");

		Thread t4=new Thread(() ->
		{
			for(int i=0;i<5;i++) {

				System.out.println("A");
				try{Thread.sleep(1000);} catch(Exception e) {}

			}
		},"aplha thread");
		
       // t3.setName("numeric");
        //t4.setName("Alphabet");
		
        System.out.println(t3.getName());
		System.out.println(t4.getName());
		
		//t3.setPriority(1);
		//t4.setPriority(10);
		
		System.out.println(t3.MIN_PRIORITY);
		System.out.println(t4.MAX_PRIORITY);
		
		System.out.println(t3.getPriority());
		System.out.println(t4.getPriority());
        
        t3.start();
		try{Thread.sleep(50);}catch(Exception e) {}
		t4.start();




	}
}
