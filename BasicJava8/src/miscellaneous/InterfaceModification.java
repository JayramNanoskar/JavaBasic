package miscellaneous;

/**
 * Yes, now we can modify java interfaces even once they are published since JDK 1.8, prior JDK 1.8 it was not allowed.
 * So we cannot declare but it is possible to define method in interface since JDK 1.8
 * Before Java 8, interfaces could have only abstract methods but since Java 8, we can have Default methods and Static methods.
 */
public class InterfaceModification {

	public static void main(String[] args) {
		
		Hero h = new Hero();
		
		h.act(); //Hero acting...
		h.brave(); //Hero is brave...
		h.comedy(); //Comedy...//Accessing interface default method by object of child class.
		
		Villain v = new Villain();
		
		v.act(); //Villain acting...
		v.fraud(); //Villain is fraud...
		v.comedy(); //Comedy...//Accessing interface default method by object of child class.
		
		Actor.action(); //Action... //Accessing interface static method directly by Interface name same as class.
	}

}


/**
 * So here even after publishing an interface Actor with just one abstract method act(),
 * we could change it by adding default & static method.
 */
interface Actor{
	void act();
	/**
	 * Defining method in already published interface
	 * It will be available to all its child.
	 */
	default void comedy(){
		System.out.println("Comedy...");
	}
	
	static void action(){
		System.out.println("Action...");
	}
}


class Hero implements Actor{
	@Override
	public void act() {
		System.out.println("Hero acting...");
	}
	
	public void brave(){
		System.out.println("Hero is brave...");
	}
	
}


class Villain implements Actor{
	@Override
	public void act() {
		System.out.println("Villain acting...");
	}
	
	public void fraud(){
		System.out.println("Villain is fraud...");
	}
}
