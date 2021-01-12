package file_handling;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

public class QRCodeDemo {

	public static void main(String[] args) throws IOException {
		System.out.println("Creating QRCode...");
		QRCodeDemo.createQR("Jayram Subhash Nanoskar", "E:\\Jars\\QRCodeJar\\MyQRCode.jpg");
	}

	public static void createQR(String data, String path) throws IOException{
		ByteArrayOutputStream out = QRCode.from(data).to(ImageType.JPG).stream(); //Creating QRCode in string format
		
		File f = new File(path); //File to write QRCode
		FileOutputStream fos = new FileOutputStream(f);
		
		fos.write(out.toByteArray()); //Converting stream into an byte array
		fos.flush(); //Don't want to wait till buffer get full. So, flush means Done.
		System.out.println("QRCode created !!");
	}

}
