package File_handling;

import java.io.File;

public class FileInfo {
	public static void main(String[] args) {

		File myObj = new File("D:\\\\File Handling\\\\File Creation\\\\venkat");

		if (myObj.exists()) {

			System.out.println("File Name :" + myObj.getName());

			System.out.println("Absolute Path :" + myObj.getAbsolutePath());

			System.out.println("Writable :" + myObj.canWrite());

			System.out.println("Readable :" + myObj.canRead());

			System.out.println("File size in Bytes :" + myObj.length());

		} else {

			System.out.println("The File does not exists.");

		}

	}

}
