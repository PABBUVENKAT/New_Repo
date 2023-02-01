package File_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileData {
	public static void main(String[] args) throws FileNotFoundException {
		File c2 = new File("D:\\File Handling\\File Creation\\venkat");
		Scanner Reader = new Scanner(c2);
		while (Reader.hasNextLine()) {
			String data = Reader.nextLine();
			System.out.println(data);
		}
		Reader.close();
	}
}