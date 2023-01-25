package Log4j;

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
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/self_check_in","root","Venkat");
			log.info("Connected Successfully");
		} else {
			log.error("error");
		}
		Statement stmt = con.createStatement();
		String a = "INSERT INTO user_data VALUES('HARIKA',23,'156411111111','9966778855','HYD')";
		stmt.execute(a);
		System.out.println("Data Inserted Successfully");
		con.close();
	}
}
