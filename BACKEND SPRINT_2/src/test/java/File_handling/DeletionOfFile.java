package File_handling;

import java.io.File;
import java.io.IOException;

public class DeletionOfFile {
	public static void main(String[] args) throws IOException {
		File myObj = new File("D:\\File Handling\\File Creation\\venkat");
		myObj.delete();
		System.out.println("File is Delected");
	}
}
