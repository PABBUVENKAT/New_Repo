package MYSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Delete_Data {
	public static void main(String[] args) throws Exception {
		// Create a Connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/self_check_in", "root", "Venkat");
		// Create statement/Query
		Statement stat = con.createStatement();

		// DELETING DATA
		String d = "DELETE FROM user_data WHERE AGE = 21";
		stat.execute(d);
		System.out.println("name is Deleted......into DB");
		
		// Close Connection
		con.close();
		System.out.println("Query is executed......");
	}

}
