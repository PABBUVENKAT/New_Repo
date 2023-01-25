package mongoDB;

import com.mongodb.*;
import com.mongodb.MongoClient;

public class DML_Operation {
	@SuppressWarnings({ "deprecation", "resource" })
	public static void main(String[] args) {
		MongoClient mongoclient = new MongoClient("localhost",27017);
		System.out.println("Connection Estadlished Sucessfully");
		DB db = mongoclient.getDB("admin");
		db.getCollection("Parthu");
	}
}
