package enums;

/**
 * With Enum we can create constructor, variable and methods  which makes it enum different from other languages.
 * Enum can implement an interface but cannot extend any class.
 */
public class CustomEnumDemo {

	public static void main(String[] args) {
		System.out.println(Mobile.APPLE); //APPLE
		System.out.println(Mobile.APPLE.getprice()); //80
		System.out.println(Mobile.APPLE.ordinal()); //0 //Each constant has an order
		
		System.out.println(Mobile.SAMSUNG); //SAMSUNG
		System.out.println(Mobile.SAMSUNG.getprice()); //100 //calling Parameterized constructor
		System.out.println(Mobile.SAMSUNG.ordinal()); //1
		
		Mobile m[] = Mobile.values();
		for(Mobile mobile: m) {
			/**
			 * Output :
			 * APPLE
			 * SAMSUNG
			 * HTC
			 */
			System.out.println(mobile);
		}
	}

}

enum Mobile implements A{
	
	APPLE, SAMSUNG(100), HTC;
	int price;
	Mobile(){
		price = 80;
		System.out.println("Default constructor called");
	}
	Mobile(int p){
		price = p;
		System.out.println("Parameterized constructor called");
	}
	public int getprice() {
		return price;
	}
}

interface A{
	
}
