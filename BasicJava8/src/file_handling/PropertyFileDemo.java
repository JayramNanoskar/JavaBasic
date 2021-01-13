package file_handling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertyFileDemo {

	public static void main(String[] args) throws IOException {
		/**
		 * Properties file
		 * Used to write initial configuration within it required for project
		 * We have different choices like xml, yaml but people also prefer Properties file
		 * Properties file has keys, values
		 * Properties class extends Hashtable class
		 */
		Properties p = new Properties();
		OutputStream os = new FileOutputStream("E:\\Document\\dataconfig.properties");//OutputStream - abstract class
		p.setProperty("url", "localhost:3306/myDb");
		p.setProperty("uname", "jayram");
		p.setProperty("pass", "jayram");
	
		p.store(os, null); //Saving the file
		
		InputStream is = new FileInputStream("E:\\Document\\dataconfig.properties"); //InputStream - abstract class
		p.load(is); //Loading with data
		System.out.println(p);
		
		p.list(System.out); //Print all properties on console
		
		System.out.println(p.getProperty("uname"));//jayram
	}

}
