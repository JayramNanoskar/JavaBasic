package file_handling;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandlingDemo {

	public static void main(String[] args) throws IOException {
		//Generally, Notepad follows UTF format
		writeToFile("E:\\Document\\demo.txt"); //Creates file if not exist
		readFromFile("E:\\Document\\demo.txt");
		
	}

	private static void writeToFile(String path) throws IOException {
		File f = new File(path);
		FileOutputStream fos = new FileOutputStream(f);
		DataOutputStream dos= new DataOutputStream(fos); //We are writing data into file. So can read it with open eyes.
		dos.writeUTF("Hello, you are welcome !!");
		System.out.println("Written to file successfully !!");
	}
	
	private static void readFromFile(String path) throws IOException {
		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		DataInputStream dis= new DataInputStream(fis);
		String data = dis.readUTF();
		System.out.println("Read successful !! => " + data); //Read successful !! => Hello, you are welcome !!
	}

}
