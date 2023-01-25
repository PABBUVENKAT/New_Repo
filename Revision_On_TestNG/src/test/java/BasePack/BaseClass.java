package BasePack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	public static WebDriver cdriver;
	
	@BeforeTest
	public void BrowserLanch() {
		cdriver = new ChromeDriver();
		cdriver.manage().window().maximize();
	}
	/*@AfterTest
	public void BrowserClose() {
		cdriver.quit();
	}*/
}
