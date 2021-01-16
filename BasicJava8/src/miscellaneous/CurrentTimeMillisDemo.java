package miscellaneous;

import java.util.ArrayList;

public class CurrentTimeMillisDemo {

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis(); //static method in System class and in default java.lang package
		System.out.println("Execution Start Time : "+start); //1610827805915 //Gives milliseconds from 1st January 1970
		
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i = 1; i <= 1000000; i++){
			al.add(i);
		}
		
		long end = System.currentTimeMillis();
		System.out.println("Execution End Time : "+end); //1610827805978
		
		System.out.println("Execution Time Required : "+(end-start)); //63 //print time in milliseconds
	}

}
