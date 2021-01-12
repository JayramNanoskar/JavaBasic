package object_cloning;
public class CloningDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		/**
		 * Cloning- Combination of Shallow copy and Deep copy
		 * It is looks like shallow cloning but internally it is like deep cloning.
		 * A class we want to be clone need to implement Cloneable interface 
		 * otherwise JVM won't allow us to clone that object for security reason
		 * because hacker can steal the object data/state having credentials also.
		 */
		Alien obj = new Alien("Pranit", "Mishra", "Nagpur"); //Creates object in heap memory and reference in stack memory
		
		Alien obj1 = (Alien) obj.clone();//Creates object in heap memory and reference in stack memory
		
		obj.firstName = "Rohit";
		obj1.lastName = "Kedar";
		
		System.out.println(obj);
		System.out.println(obj.firstName); // Rohit
		System.out.println(obj.lastName); // Mishra
		System.out.println(obj.location); // Nagpur
		
		System.out.println(obj1);
		System.out.println(obj1.firstName);// Pranit
		System.out.println(obj1.lastName); // Kedar
		System.out.println(obj1.location); // Nagpur
	}

}

class Alien implements Cloneable{
	String firstName;
	String lastName;
	String location;
	
	public Alien(String fname, String lname, String loc){
		this.firstName = fname;
		this.lastName = lname;
		this.location = loc;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone(); //Calling parent class protected method
	}
}
