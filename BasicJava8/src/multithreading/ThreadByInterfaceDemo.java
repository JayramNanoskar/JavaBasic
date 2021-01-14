package multithreading;
public class ThreadByInterfaceDemo {

	public static void main(String[] args) {
		MyIntDemo md = new MyIntDemo();
		Thread t1 = new Thread(md); //Passing runnable instance to Thread objects
		md.run(); //won't create new thread
		t1.run(); //won't create new thread
		t1.start(); //creates new thread and calls method run()
	}

}

class MyIntDemo implements Runnable{
	
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
		 * 'main' when we do t1.run() / md.run() - because it won't create new thread
		 * 'Thread-0' when we do t1.start()- because it creates new thread and calls method run()
		 */
		System.out.println("Current Thread name  :  "+Thread.currentThread().getName());
	
	}
	
}
