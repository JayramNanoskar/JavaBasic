package exception_handling;

import java.io.File;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;

public class TryWithResourcesDemo {

	/**
	 * Try-With-Resources
	 * Here, we do not need at least finally block with try block. Just try block is sufficient.
	 * Here we can directly create resources with try block.
	 * No need to declare it outside try, initialize inside try and closing in finally block.
	 * As soon as we are done with try block, resource get deallocated even if we get an error or not.
	 * We can use TryWithResources in Socket, Database, Files etc.
	 */
	public static void main(String[] args) {
		
		//try-with-resources
		try(Scanner sc = new Scanner(new File("E:\\Document\\input.xml"))){
			while(sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
			System.out.println("...Read successful...");
		}
		catch (Exception e) {
			System.out.println("Something went wrong while...Reading...");
			System.out.println(e);
		}
		finally{
			System.out.println("----Done...with try-with-single-resources----");
		}
		
		//try-with-resources With Multiple Resources
		try(PrintWriter pw = new PrintWriter(new File("E:\\Document\\output.xml")); //implementation of Writer class means extends Writer class
				Scanner sc = new Scanner(new File("E:\\Document\\input.xml"))) {
			while(sc.hasNext()) {
				pw.print(sc.nextLine());
			}
			System.out.println("...Write successful...");
		}
		catch(Exception e){
			System.out.println("Something went wrong while...Writing...");
			System.out.println(e);
		}
		finally{
			System.out.println("----Done...with try-with-multiple-resources----");
		}
	}

}
