package object_cloning;
public class DeepCopyDemo {

	public static void main(String[] args) {
		/**
		 * Deep copy-
		 * We get object in heap and single reference in stack.
		 * When we change value of any object, it will not reflect on all other(original and deep copy) objects.
		 */
		Person obj = new Person("Jini","Salah","Kolkata"); //Creates object in heap memory and reference in stack memory
		
		Person obj1 = new Person("Jini","Salah","Kolkata"); //Creates object in heap memory and reference in stack memory
		
		obj.firstName = "Rohit";
		obj1.lastName = "More";
		
		System.out.println(obj);
		System.out.println(obj.firstName); // Rohit
		System.out.println(obj.lastName); // Salah
		System.out.println(obj.location); // Kolkata
		
		System.out.println(obj1);
		System.out.println(obj1.firstName);// Jini
		System.out.println(obj1.lastName); // More
		System.out.println(obj1.location); // Kolkata
	}

}

class Person{
	String firstName;
	String lastName;
	String location;
	
	public Person(String fname, String lname, String loc){
		this.firstName = fname;
		this.lastName = lname;
		this.location = loc;
	}
}
