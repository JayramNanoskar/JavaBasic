package file_handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectSerializationDeSerializationDemo {

	/**
	 * Serialization - Storing the state of an object in a file.
	 * File can be .text file, data file, .xml file etc
	 * .xml files are more efficient because it can transfer over network and also we can retrieve it on other machine.
	 * DeSerialization - Getting the state of an object from a file.
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		doSerialize("E:\\Document\\SerializationDemo.txt"); //Creates file if not exist
		doDeSerialize("E:\\Document\\SerializationDemo.txt");
	}

	/**
	 * Object serialization- means storing data in form of an object
	 * Aim is to store the state of an object
	 * By default java doesn't let us to store an object because it can be use for malicious purpose.
	 * To serialize the object we need to implement marker interface Serializable.
	 */
	public static void doSerialize(String path) throws IOException{
		Save obj = new Save();
		obj.i = 4;
		
		File f = new File(path);
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos); //We are writing object into file. So cannot read it with open eyes.
		oos.writeObject(obj);
	}
	
	public static void doDeSerialize(String path) throws IOException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream(path);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Save obj1 = (Save) ois.readObject();
		
		System.out.println("Value of obj1 : "+obj1.i);
	}
}

class Save implements Serializable{

	private static final long serialVersionUID = 1L;
	int i;
}
