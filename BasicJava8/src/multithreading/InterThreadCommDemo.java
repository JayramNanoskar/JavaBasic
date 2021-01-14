package multithreading;
public class InterThreadCommDemo {

	public static void main(String[] args) {
		Abc abc = new Abc();
		new Producer(abc); //Anonymous object
		new Consumer(abc); //Anonymous object
	}

}

class Abc{ 
	 int num;
	 boolean valueSet = false;
	 /**
	  * wait() and notify()  are Object class methods but sleep() is Thread class method.
	  * wait() and notify() should be in synchronized method.
	  */
	 public synchronized void put(int num) {
		 while(valueSet) {
			 try {
				wait(); //Waits for consumer to consume the value. Resumes only if notified by consumer.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		 }
		 
		 System.out.println("Put : "+num);
		 this.num = num;
		 valueSet = true;
		 notify(); //Notifying consumer when value is produced and flag is set.
	 }
	 
	 public synchronized void get() {
		 while(!valueSet) {
			 try {
				wait();//Waits for producer to produce the value. Resumes only if notified by producer.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		 }
		 System.out.println("Get : "+num);
		 valueSet = false;
		 notify(); //Notifying producer when value is consumed and flag is set.
	 }
}


class Producer implements Runnable{//Producing value
	Abc q;
	public Producer(Abc abc) { //Parameterized constructor
		this.q = abc;
		Thread t = new Thread(this, "Producer"); //Creating Thread class object and passing Runnable instance with name
		t.start();
	}

	public void run() { //Providing Runnable interface implementation
		int i = 0;
		while(true) {
			q.put(i++);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

class Consumer implements Runnable{//Consuming value
	Abc q;
	public Consumer(Abc abc) { //Parameterized constructor
		this.q = abc;
		Thread t = new Thread(this, "Consumer"); //Creating Thread class object and passing Runnable instance with name
		t.start();
	}

	public void run() { //Providing Runnable interface implementation
		while(true) {
			q.get();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
