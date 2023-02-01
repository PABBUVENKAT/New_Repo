package Logging;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Logging {
	static Logger log = Logger.getLogger(Logging.class.getName());

	public static void main(String[] args) throws SQLException {
		int num = 5;
		BasicConfigurator.configure();
		Connection con = null;
		if (num < 10) {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/self_check_in", "root", "Venkat");
			log.info("Connected Successfully");
		} else {
			log.error("error");
		}
		
		int num1 = 6;
		Statement stmt = con.createStatement();
		String a = "INSERT INTO user_data VALUES('venkat',23,'156411111111','9966778855','HYD')";
		if(num1 > 10 ) {
			stmt.execute(a);
			log.info("data sucessfully inserted");
		} else {
			log.error("data not inserted");
		}
		con.close();
	}
}