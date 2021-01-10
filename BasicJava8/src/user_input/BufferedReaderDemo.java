package user_input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Plase enter number..."); //48
		int num = Integer.parseInt(br.readLine()); // Here Integer -class, parseInt- static method -> converting String to int
		System.out.println("Entered Number => "+num); //48
		
		System.out.println("Please enter string..."); //It is good.
		String str = br.readLine();
		System.out.println("Entered String => "+str); //It is good.
		br.close();
	}

}
