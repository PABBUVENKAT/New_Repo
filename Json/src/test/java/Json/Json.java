package Json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Json {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		//creating a JSON parser object 
		JSONParser jsonparse = new JSONParser(); 
		 
		//parsing the content of the json object 
		JSONObject jsonobject = (JSONObject) jsonparse.parse(new FileReader("C:\\Users\\ADMIN\\eclipse-workspace\\Json\\JSONFile\\employee.json")); 
		 
		//reading the data from the JSON file 
		String ID = (String) jsonobject.get("id"); 
		String Firstname = (String) jsonobject.get("name"); 
		String type = (String) jsonobject.get("type");
		 
		System.out.println(ID); 
		System.out.println(Firstname); 
		System.out.println(type);
		
		}  


	}

