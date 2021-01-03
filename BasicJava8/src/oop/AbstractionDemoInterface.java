package oop;
public class AbstractionDemoInterface implements MyShow {

	/**
	 * Interface cannot have constructor. For instantiation need to have constructor.
	 * So interface  cannot be instantiated but we can create reference
	 * Interface provides tight coupling
	 * Interface addresses Diamond problem(i.e. Resolve ambiguity)
	 * Interface used to act as to support multiple inheritance functionality
	 * Interface has every method public abstract
	 * Interface Types
	 * 1. Marker Interface -> without any method
	 * 2. SAM(Single Abstract Method) Interface -> Functional interface since JDK 1.8
	 * 3. Normal Interface
	 */
	public static void main(String[] args) {
		AbstractionDemoInterface abi = new AbstractionDemoInterface();
		abi.show();
		abi.myinterface.print(); //Printing...
		MyInterface myinterface = () -> //Using Lambda expression(Introduced since JDK 1.8) for memory management.
		{	
				System.out.println("Printing...");
			
		};
		myinterface.print(); //Printing...
		MarkerDemo md = new MarkerDemo();
		if(md instanceof MyMarkerInterface) {
			md.log();
		}
		else {
			System.out.println("No permission");
		}
		
		MyInterface.drink(); //Drinking...//Calling interface static method directly with name(like class)
		md.eat(); //Eating...//Calling interface default method with object name of implementing(interface) class
	}

	public void show() {
		System.out.println("Inside show");
	}

	MyInterface myinterface = new MyInterface() { //Using Anonymous Inner Class so no need to have another class to just implement method.
		public void print() {
			System.out.println("Printing...");
		}
	};
}

class MarkerDemo implements MyMarkerInterface, MyInterface{
	void log() {
		System.out.println("Logging...");
	}

	public void print() {
		
	}
}

interface MyShow{
	void show();
}

/**
 * SAM(Single Abstract Method) interface/ Functional interface
 * Has only one abstract(unimplemented) method and can have any number of(0-N) static, default methods
 */
interface MyInterface{
	void print();
	/**
	 * Using default & static method we can modify interface even after they get published/used
	 * So previous implementation won't get change.
	 */
	static void drink() {
		System.out.println("Drinking...");
	}
	
	default void eat() {
		System.out.println("Eating...");
	}
}

/**
 * Marker interface- Used for checking/validating purpose
 * Empty interface without any method definition or declaration
 */
interface MyMarkerInterface{
}
