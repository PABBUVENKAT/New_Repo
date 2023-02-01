package MYSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Update_Data {
	public static void main(String[] args) throws Exception {
		// Create a Connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/self_check_in", "root", "Venkat");
		// Create statement/Query
		Statement stat = con.createStatement();

		// UPDATEING DATA
		String u = "UPDATE user_data SET NAME ='V_A_M_S_I' WHERE AGE = 25";
		stat.execute(u);
		System.out.println("Data is UPDATED......into DB");

		// Close Connection
		con.close();
		System.out.println("Query is executed......");
	}
}