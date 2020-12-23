package basic_oop;
public class ObjectPassDemo {

	public static void main(String[] args) {
		/**
		 * In general programming, Methods of passing arguments to a function - call by value & call by reference
		 * In Java - Functionality of call by reference is achieved by call by value only
		 * Reference/Object as a parameter get passed as a hash code of it internally 
		 */
		passPrimitiveValues(10); // Passing primitive as a value
		
		Student student = new Student();
		student.setName("Aron");
		passObjectReference(student); // Passing object as a value
	}
	
	static void passPrimitiveValues(int val) {
		System.out.println("---- Printing Primitive value----");
		System.out.println(val);
	}
	
	static void passObjectReference(Object ref) {
		System.out.println("---- Printing Object value----");
		System.out.println(ref); // Print hash code - by calling toString() of Student class or Parent/Object class
		Student st = (Student)ref;
		System.out.println("Object Name : "+st.getName());
	}
}


/**
 * POJO VS Java Bean
 * Java Bean - should implement Serializable interface and Fields have only private visibility.
 * POJO - Not any compulsion, just should not implement/extend any interface/class
 */
class Student{ // Creating POJO
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
