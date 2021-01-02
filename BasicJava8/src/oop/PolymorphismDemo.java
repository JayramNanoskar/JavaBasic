package oop;
public class PolymorphismDemo {

	public static void main(String[] args) {
		Multiplication multi = new Multiplication();
		/**
		 * Static Polymorphism/ CompileTime polymorphism/ Early binding i.e. Method overloading
		 * Does not need parent, child concept
		 * Methods has same name but different parameter list(count of arguments/sequence/type of arguments)
		 */
		System.out.println(Multiplication.Multiply(3, 7));
		System.out.println(multi.Multiply(3.5, 2)); //we can call static method with object object but best way to use class name only for memory management
		System.out.println(Multiplication.Multiply(3, 6, 2));
		
		/**
		 * Dynamic Polymorphism/ RunTime polymorphism/ Late binding i.e. Method overriding
		 * Need parent, child concept
		 * Methods has same name and same parameter list
		 */
		Person per = new Person();
		per.identity(); //I am Human
		per = new Doctor(); 
		per.identity(); //I am Doctor //Dynamic method dispatch- because it decides which method to call at runtime
		per = new Advocate();
		per.identity(); //I am Advocate
	}
}

class Multiplication{
	static int Multiply(int a, int b) {// 2 parameters
		return a*b;
	}
	
	static int Multiply(int a, int b, int c) {//different count of parameter
		return a*b*c;
	}
	
	static double Multiply(double a, double b) {//different type of parameter
		return a*b;
	}
}

class Person{
	void eat() {
		System.out.println("Eating");
	}
	
	void identity(){
		System.out.println("I am Human");
	}
}

class Doctor extends Person{
	void checkPatient(){
		System.out.println("Checking patient");
	}
	
	void identity(){
		System.out.println("I am Doctor");
	}
}

class Advocate extends Person{
	void handleClient() {
		System.out.println("Handling client");
	}
	
	void identity(){
		System.out.println("I am Advocate");
	}
}

