package string;
public class StringDemo {

	/**
	 * Strings are immutable/Cannot change - to increase the performance
	 * Mainly two memories - Heap and Stack
	 * String Constant Pool(SCP) resides in Heap memory
	 * Generally, Objects get stored in heap memory and References, Variables get stored in stack memory.
	 */
	
	/**
	 * Fly-weight design pattern in SCP
	 * - Many references shares the same object in string pool.
	 * - It minimizes memory usage by Reusability/sharing
	 */
	public static void main(String[] args) {
		
		String str = "David"; // Gets entry in stack memory and in SCP (inside heap memory)
		
		String str1 = "David"; // Gets entry in stack memory and in SCP (inside heap memory) // Here, in SCP same object being used as previous. So no new creation in SCP
		
		str = "Vikas"; //Won't change value directly here, SCP will have both the values
					   //Gets entry in SCP (inside heap memory) and just previous reference get update in stack memory
		
		String str2 = new String("David"); //Gets entry in stack memory, heap memory and SCP in heap memory(if already not exist else share the one which exist like here)
		
		
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);
	}

}
