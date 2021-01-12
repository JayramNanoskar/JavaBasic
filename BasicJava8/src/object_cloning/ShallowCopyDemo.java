package object_cloning;
public class ShallowCopyDemo {

	/**
	 * Object copy can be done with
	 * Shallow copy, Deep copy, Cloning.
	 */
	public static void main(String[] args) {
		/**
		 * Shallow copy-
		 * We get same/one object in heap and multiple references in stack.
		 * When we change value of any object, it will reflect on all other(original and shallow copy) objects.
		 */
		User obj = new User("Vikas", "Jain", "Mumbai"); //Creates object in heap memory and reference in stack memory
		
		User obj1 = obj; //Creates just reference in stack memory and uses same object from heap memory
		
		obj.firstName = "Rohit";
		obj1.lastName = "More";
		
		System.out.println(obj);
		System.out.println(obj.firstName); // Rohit
		System.out.println(obj.lastName); // More
		System.out.println(obj.location); // Mumbai
		
		System.out.println(obj1);
		System.out.println(obj1.firstName);// Rohit
		System.out.println(obj1.lastName); // More
		System.out.println(obj1.location); // Mumbai
	}
}

class User{
	String firstName;
	String lastName;
	String location;
	
	User(String fname, String lname, String loc){
		this.firstName = fname;
		this.lastName = lname;
		this.location = loc;
	}
}
