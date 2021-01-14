package multithreading;
public class ThreadSynchronizedDemo {

	public static void main(String[] args) throws InterruptedException {
		Counter c = new Counter();
		/**
		 * Creating thread using Runnable interface implementation.
		 * Not creating any separate class, giving Anonymous inner class/inline implementation
		 */
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for(int i = 1; i<= 1000; i++) {
					c.increment();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for(int i = 1; i <= 1000; i++) {
					c.increment();
				}
			}
		});
		
		t1.start(); //Starting thread t1
		t2.start(); //Starting thread t2
		t1.join();
		t2.join();
		System.out.println("Count = "+c.count); 
		/**
		 * Prior synchronization - //1964
		 * After synchronization - //2000
		 */
	}
}

/**
 * Here, it is possible that we might get incorrect output because 2 threads accessing same method. To avoid that we can use keyword synchronized.
 * synchronized - means only one thread will access that method at particular time which makes method thread-safe.
 * Example.. Let say Thread t1 is accessing/working on method then Thread t2 will wait & wise-versa.
 */
class Counter{
	int count;
	public synchronized void increment() {
		count ++;
	}
}
