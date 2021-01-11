package string;
public class StringBuilderDemo {

	public static void main(String[] args) {
		/**
		 * StringBuilder is
		 * Non-Thread safe, non-synchronized
		 * Mostly use in case application has single thread
		 * Faster than StringBuffer
		 */
		StringBuilder sb = new StringBuilder("Ok");
		sb.append(" Bye");
		System.out.println(sb); //Ok Bye
		
		//Performance comparison
		long startTime = System.currentTimeMillis();
		StringBuffer sbufftest = new StringBuffer("Hi");
		for(int i = 1; i<=100000; i++) {
			sbufftest.append("bye");
		}
		System.out.println("Time taken by StringBuffer is ="+ (System.currentTimeMillis() -  startTime)+"ms"); //11ms
		
		startTime = System.currentTimeMillis();
		StringBuilder sbuitest = new StringBuilder("Ok");
		for(int i = 1; i<=100000; i++) {
			sbuitest.append("bye");
		}
		System.out.println("Time taken by StringBuilder is ="+ (System.currentTimeMillis() -  startTime)+"ms"); //6ms
	}

}

