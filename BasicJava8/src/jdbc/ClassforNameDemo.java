package jdbc;

public class ClassforNameDemo {

	/**
	 * While doing JDBC Connectivity we do
	 * Class.forName("com.mysql.cj.jdbc.Driver"); //step 2.b loading/adding relevant jar/driver
	 * It actually loads Driver class and executes its static block which has driver registration code as
	 * DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
	 */
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		/**
		 * Output for below LOC will be together
		 * 	In static block
		 *  In instance block
		 *  In instance block
		 *  //Because loading will be only once and first.
		 */
		Class.forName("jdbc.Demo"); //calling static block
		Class.forName("jdbc.Demo").newInstance(); //calling static block and instance block
		Demo obj = new Demo(); //calling static block and instance block
	}

}

class Demo{
	/**
	 * static block - get called while loading the class, prior creating an object.
	 * instance block - get called during creation of an object.
	 */
	static{ //static block
		System.out.println("In static block");
	}
	
	{ //instance block
		System.out.println("In instance block");
	}
}
