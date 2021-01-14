package multithreading;
public class ThreadMethodsDemo extends Thread {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new ThreadMethodsDemo();
		/**
		 * run() won't create new thread.
		 * start() creates new thread and calls method run(). So need to call start()
		 */
		t1.run(); //running...
		t1.start(); //running...
		
		/**
		 * Creating thread using Runnable interface implementation.
		 * Not creating any separate class, giving Anonymous inner class/inline implementation with lambda expression]
		 * Every thread has some name(like default name :Thread-0) and priority(like default priority : 5- Normal)
		 */
		Thread t2 = new Thread(() -> {
			for(int i = 1; i <= 5; i++) {
				System.out.println("Hi");
				try {
					Thread.sleep(1000);
				}
				catch(Exception e) {
					System.out.println(e);
				}
			}
		});
		
		
		
		Thread t3 = new Thread(() -> {
			for(int i = 1; i<=5; i++) {
				System.out.println("Hello");
				try {
					Thread.sleep(1000);
				}
				catch(Exception e) {
					System.out.println(e);
				}
				System.out.println("Current Thread t3 Priority  :  "+Thread.currentThread().getPriority()); //10
			}
		});
		
		t2.start();
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		t3.start();
		t3.setName("three");
		t3.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t2.getPriority());//5
		System.out.println("Prior join=> "+t2.isAlive()); //true
		/**
		 * Threading output is not guaranteed because of CPU core and thread scheduler.
		 * So let say 2 threads are coming for execution to thread scheduler then it will consider
		 * thread priority, some other random algorithms etc. to execute.
		 * Hence to get proper/sequential result we can use thread method like sleep(), join()
		 * Join() - Letting the chance to complete current thread(t2) execution and then only main thread executes further.
		 */ 
		t2.join();
		t3.join();
		System.out.println(t3.getName());//three
		System.out.println("After join=> "+t2.isAlive()); //false
	}

	public void run() {
		System.out.println("running...");
	}
}
