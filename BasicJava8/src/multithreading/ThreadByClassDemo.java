package multithreading;

/**
 * Multitasking and Multithreading
 * Multitasking/Multiprocessing - typing in MS-Word and Listening to music
 * Multithreading - While typing in MS-Word, subprocess are threads like typing and spell checking are 2 threads.
 */
public class ThreadByClassDemo {

	/**
	 * Originally, CPUs had a single core. ... To increase performance, manufacturers add additional 'cores', or central processing units.
	 * A dual-core CPU has two central processing units, so it appears to the operating system as two CPUs.
	 * A CPU with two cores, for example, could run two different processes at the same time
	 * So we have Dual Core CPU, Quad Core CPU, Octa Core CPU etc
	 */
	public static void main(String[] args) {

		/**
		 * By default program will have only one thread.
		 * But if we use multithreading by creating 4 different threads then program execution time will get reduced to 4 times.
		 * Let say with single thread, program taking 8 seconds then with 4 threads running parallel, it will take 2 seconds.
		 */
		
		Thread t1 = new MyClassthread(); //MyClassthread t1 = new MyClassthread(); is also OK
		t1.run(); //won't create new thread
		t1.start(); //creates new thread and calls method run()
	}
	

}

class MyClassthread extends Thread {
	
	int values[] = {5, 6, 3, 9, 1};
	public void run() {
		int sum = 0;
		System.out.println("HI");
		for(int i = 0; i < 5; i ++) {
			sum += values[i];
		}
		System.out.println("Sum = "+sum);
		
		/**
		 * Output below will be
		 * 'main' when we do t1.run() - because it won't create new thread
		 * 'Thread-0' when we do t1.start()- because it creates new thread and calls method run()
		 */
		System.out.println("Current Thread name  :  "+Thread.currentThread().getName());
	}
}
