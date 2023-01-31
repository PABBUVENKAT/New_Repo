package file_to_database;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.sql.*;

public class DataImporting {
	private String NAME;
	private int AGE;
	private double AADHAR_NO;
	private double MOBILE_NO;
	private String ADDRESS;

	public void readdate() {
		try {
			Scanner input = new Scanner(new File(
					"C:\\Users\\venka\\eclipse-workspace\\SPRINT_2\\src\\test\\java\\file_to_database\\userdata.txt"));
			while (input.hasNextLine()) {
				NAME = "";
				String line;
				line = input.nextLine();
				// Now process the line of text for each data item
				try (Scanner data = new Scanner(line)) {
					while (!data.hasNextInt()) {
						NAME += data.next() + " ";
					}
					NAME = NAME.trim();
					// Get AGE
					if (data.hasNextInt()) {
						AGE = data.nextInt();
					}
					// Get AADHAR_NO
					if (data.hasNextLong()) {
						AADHAR_NO = data.nextDouble();
					}
					// GET MOBILE_NO
					if (data.hasNextLong()) {
						MOBILE_NO = data.nextDouble();
					}
					// GET ADDRESS
					if (data.hasNextLine()) {
						ADDRESS = data.nextLine();
					}
				}
				// check data
				// System.out.println(NAME + "\t" + AGE + "\t" + AADHAR_NO + "\t" + MOBILE_NO +"\t"+ ADDRESS);
				savedata(); // call the method to save the data into database
			}
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
	}
	// now save the data into the database
	private void savedata() {
		try (Connection con = connect();
				PreparedStatement pstat = con.prepareStatement("INSERT INTO user_data VALUES(?,?,?,?,?)")) {
			pstat.setString(1, NAME);
			pstat.setInt(2, AGE);
			pstat.setDouble(3, AADHAR_NO);
			pstat.setDouble(4, MOBILE_NO);
			pstat.setString(5, ADDRESS);
			pstat.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e);
		}
		System.out.println("Data Sucessfully Inserted");
	}
	// Create a connection to the database
	private Connection connect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/self_check_in", "root", "Venkat");
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println(e);
			return null;
		}
	}
	static class FDemo {
		public static void main(String[] args) {
			DataImporting emp = new DataImporting();
			try {
				emp.readdate();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}