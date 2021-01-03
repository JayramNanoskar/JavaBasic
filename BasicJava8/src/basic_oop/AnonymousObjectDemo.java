package basic_oop;
public class AnonymousObjectDemo {

	public static void main(String[] args) {
		/**
		 * Anonymous object - new MyClass()
		 * It won't create space in stack memory for reference, it will just used heap memory
		 * It should be used when we need object to be used only once(fewer times) as it saves stack memory, few LOC and
		 * It will directly eligible for GC once action performed
		 */
		new MyClass().print(); //Bye Printing...
		System.out.println(new MyClass().str); //Hi - calling final variable
	}

}

class MyClass{
	final String str = "Hi";
	void print(){
		String str =  "Bye"; //Local variable will be preferred inside method if it has same name as final variable
		System.out.println(str+" Printing...");
	}
}
