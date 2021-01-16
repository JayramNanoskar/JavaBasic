package enums;

/**
 * We can create Enum inside class or outside class but not inside method
 * We can use Enum in switch case.
 * Behind the scene Enum is class and constants are objects.
 * class Sport{
 * 		static final Sport BASKETBALL = new Sport();
 * 		static final Sport HOCKEY = new Sport();
 * }
 */
public class WithEnumDemo {

	public static void main(String[] args) {
		System.out.println(Animal.DOG); //DOG //DOG is static constant. So calling with class name.
		System.out.println(Sport.BASKETBALL); //BASKETBALL
		
		Animal val = Animal.CAT;
		
		switch (val) {
		case DOG:
			System.out.println("Dog");
			break;
		case CAT:
			System.out.println("Cat"); //Cat
			break;
		default:
			break;
		}
	}
	
	enum Sport{
		BASKETBALL, HOCKEY; //';' is an optional
	}

}

enum Animal{
	DOG, CAT; //';' is an optional
}
