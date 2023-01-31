package File_handling;

import java.io.File;
import java.io.IOException;

public class FileCreation {
	public static void main(String[] args) throws IOException { 
		File myObj = new File("D:\\File Handling\\File Creation\\venkat");
		if(myObj.createNewFile()) {
			System.out.println("File is Created with name("+ myObj.getName()+")");
		} else {
			System.out.println("File is already existed.");	
		}
	}
}
		 