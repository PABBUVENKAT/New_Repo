package MYSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Creating_Table {
	public static void main(String[] args) throws Exception {
		// Create a Connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/self_check_in", "root", "Venkat");
		// Create statement/Query
		Statement stat = con.createStatement();
		// Creating Empty Table.
		String a = "CREATE TABLE USERDATA1" + "(NAME VARCHAR(40), " + " AGE VARCHAR(5), " + " AADHAR_NO VARCHAR(12), "
				+ "" + " MOBILE_NO VARCHAR(25), " + " ADDRESS VARCHAR(75))";

		stat.executeUpdate(a);
		System.out.println("Table Sucessfully Created");

		// Close Connection
		con.close();
		System.out.println("Query is executed......");
	}

}