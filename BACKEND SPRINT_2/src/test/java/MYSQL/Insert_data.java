package MYSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert_data {
	public static void main(String[] args) throws Exception {
		// Create a Connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/self_check_in", "root", "Venkat");
		// Create statement/Query
		Statement stat = con.createStatement();

		// INSERTING DATA
		String a = "INSERT INTO user_data VALUES('VAISHU',21,'111111111111','9966778855','VISHAKAPATANAM')";
		String b = "INSERT INTO user_data VALUES('VENKAT',22,'222222222222','9897867539','TUNI')";
		String c = "INSERT INTO user_data VALUES('PARDHA',23,'444444444444','9977553311','KADAPA')";
		String d = "INSERT INTO user_data VALUES('SAI',24,'333333333333','9988776655','VIZAG')";
		String e = "INSERT INTO user_data VALUES('VINAY',25,'555555555555','8866442277','GUNTUR')";
		String f = "INSERT INTO user_data VALUES('SURYA',26,'667788995544','8864549955','NZB')";

		stat.execute(a);
		stat.execute(b);
		stat.execute(c);
		stat.execute(d);
		stat.execute(e);
		stat.execute(f);
		System.out.println("Data is inserted......into DB");

		// Close Connection
		con.close();
		System.out.println("Query is executed......");
	}
}