package File_handling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
	public static void main(String[] args) throws IOException {
		FileWriter c1 = new FileWriter("D:\\File Handling\\File Creation\\venkat");
		c1.write("RECORD: 1");
		c1.write("\nNAME           :VENKAT");
		c1.write("\nMOBILE NO.     :7731831827");
		c1.write("\nAADHAR NO.     :668085506026");
		c1.write("\n");
		c1.write("\n");
		c1.write("RECORD : 2");
		c1.write("\nNAME           :PARDHA");
		c1.write("\nMOBILE NO.     :7788963546");
		c1.write("\nAADHAR NO.     :444455556666");
		c1.write("\n");
		c1.write("\n");
		c1.write("RECORD : 3");
		c1.write("\nNAME           :SURYA");
		c1.write("\nMOBILE NO.     :9973782939");
		c1.write("\nAADHAR NO.     :777788889999");
		c1.write("\n");
		c1.write("\n");
		c1.write("RECORD : 4");
		c1.write("\nNAME           :SAI");
		c1.write("\nMOBILE NO.     :9987654321");
		c1.write("\nAADHAR NO.     :000011112222");
		c1.close();
		System.out.println("Successfully write the File.");
	}
}