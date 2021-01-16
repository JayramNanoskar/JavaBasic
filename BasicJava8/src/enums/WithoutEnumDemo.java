package enums;

/**
 * Enums - Introduced since JDK 1.5
 * Mainly used to create range of constants.
 * Prior JDK 1.5, we used to do same functionality with interfaces as below.
 */

public class WithoutEnumDemo {

	public static void main(String[] args) {
		if(Fruit.APPLE == "Apple") { //using interface final, static variable
			System.out.println("Match"); //Match
		}
	}

}

interface Fruit{
	static String APPLE = "Apple"; //by default variables inside interface are constant(final)
	static String MANGO = "Mango";
}
