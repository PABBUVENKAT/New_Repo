  package Json;

import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class JsonTest {
	WebDriver driver;
	
	
	@SuppressWarnings("deprecation")
	@BeforeClass
	void Setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("ChromeBrowser is Sucessfully Lanched");
	}
	@AfterClass
	void close() {
		driver.quit();
		System.out.println("ChromeBrowser is Sucessfully Closed");
	}
	
	@Test(dataProvider = "venkat") 
		void login(String data){
		String users[] = data.split(",");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys(users[0]);
		driver.findElement(By.name("password")).sendKeys(users[1]);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
		String Act_title = driver.getTitle();
		String Exp_title = "OrangeHRM";
		Assert.assertEquals(Act_title, Exp_title);
		System.out.println("Act_title : "+driver.getTitle());
		
		
	}
	
	@DataProvider(name = "venkat")
	public String[] readJson() throws IOException, ParseException {
		JSONParser jsonParser = new JSONParser();
		FileReader reader = new FileReader(".\\JSONFile\\Test.json");
		Object obj = jsonParser.parse(reader);
		JSONObject userLoginsJsonobj = (JSONObject) obj;
		JSONArray  userloginsArray = (JSONArray)userLoginsJsonobj.get("userlogins");
		
		String arr[] = new String[userloginsArray.size()];
		
		for(int i=0;i<userloginsArray.size();i++)
		{
			JSONObject user = (JSONObject) userloginsArray.get(i);
			String username = (String) user.get("username");
			String password = (String) user.get("mailid");
			
			arr[i] = username+","+password;
			
			
		}
		return arr;
		
	}

}
 