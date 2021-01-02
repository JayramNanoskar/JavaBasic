package oop;
public class InheritanceDemo {
	public InheritanceDemo() {// Default constructor
		System.out.println("Inside Main constructor");
	}
	public static void main(String[] args) {
		/**
		 * When we create object of child class, 
		 * first parent class constructor gets called then child class constructor gets called
		 */
		Dog dog = new Dog(); // Inside Animal Constructor \nInside Dog constructor--with just super() in child constructor // I am Dog \nInside Dog constructor-- with parameterized super("p") in child constructor
		dog.bark(); // Barking...
		dog.run(); //Running... //Here, Parent class method re-usability in child class
		
	}

}

class Animal{ // Parent class
	public Animal() { // Default constructor
		System.out.println("Inside Animal Constructor");
	}
	public Animal(String animal) {
		System.out.println("I am "+animal);
	}
	void run() {
		System.out.println("Running...");
	}
}

class Dog extends Animal{ // Child class
	public Dog() {// Default constructor
		/**
		 *  Super must be on first line in constructor if we need to invoke parent class constructor
		 *  By default child class can't inherit parent constructors, need to call them.
		 *  By default child constructor has invisible super() line- calling parent default constructor but if we write
		 *  super(parameter p) - then parents parameterized constructor gets called not default parent constructor as below
		 */
		super("Dog"); // Calling parent class parameterized constructor
		System.out.println("Inside Dog constructor");
		//super(); // Compilation error - Constructor call must be the first statement in a constructor
	}
	void bark() {
		System.out.println("Barking...");
	}
}