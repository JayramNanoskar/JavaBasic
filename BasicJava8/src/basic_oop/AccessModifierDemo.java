package basic_oop;
/**
 * In General, Package Name:
 * Let say, Domain name - jayram.com
 * then Package name must be - com.jayram
 */

/**
 * Access Modifiers:
 * final, abstract, private, public, protected, default
 * Some Modifier scope:
 * Public- Visible to all classes, all packages.
 * Protected- Visible to all classes with in the package and the subclasses in other package.
 * No Access Modifier (Default)- Visible to the all classes with in the package
 * Private- Visible with in the class. It is not accessible outside the class.
 * Public > Protected > Default > Private
 */

/**
 * We can have just one public static void main(String[] args) per class.
 * Which mean, if our program has multiple classes, each class can have public static void main(String[] args)
 */
public class AccessModifierDemo{ // public class 

	public static void main(String[] args) {
		System.out.println("Inside AccessModifierDemo");
		Dog dog = new Dog();
		Puppy puppy = new Puppy();
		dog.display();
		//dog.print(); // CompileTime error, method is not visible
		puppy.display();
		
	}
	
	void printMessage() {
		System.out.println("Printing message...In Parent");
	}
	
}


/**
 * The public type class must be defined in its own file
 * means the class same name as filename can be public only here AccessModifierDemo class
 */
class Animal { // default class 

    protected void display() { // protected method
        System.out.println("I am display");
    }
    private void print() { // private method
        System.out.println("I am print");
    }
}

class Dog extends Animal {
	
}

class Puppy extends Dog{
	
}
