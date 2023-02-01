package MYSQL;

import java.sql.*;

public class Table_Data {

	public static void main(String[] args) throws Exception {

		// Create a Connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/self_check_in", "root", "Venkat");
		// Create statement/Query
		Statement stat = con.createStatement();
		String a = "select NAME,AGE,AADHAR_NO,MOBILE_NO,ADDRESS FROM self_check_in.user_data ";
		// Execute statement/Query & store data in result set
		ResultSet Rs = stat.executeQuery(a);
		while (Rs.next()) {
			String NAME = Rs.getString("NAME");
			int AGE = Rs.getInt("AGE");
			String AADHAR_NO = Rs.getString("AADHAR_NO");
			String MOBILE_NO = Rs.getString("MOBILE_NO");
			String ADDRESS = Rs.getString("ADDRESS");

			System.out.println("  #  " + NAME + " : " + AGE + " : " + AADHAR_NO + " : " + MOBILE_NO + " : " + ADDRESS);
		}
		// Close Connection
		con.close();
		System.out.println("Query is executed......");
	}

}