package apple;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {
	WebDriver a;
	

	
	@SuppressWarnings("deprecation")
	@Test
	public void Launch() {
		WebDriver a = new ChromeDriver();
		a.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		a.manage().window().maximize();
		a.get("https://innojc.kredily.com/company/dashboard/");	
	}
	//@Test
	//public void Website() throws InterruptedException {
		//Thread.sleep(1000);
		//a.get("https://innojc.kredily.com/company/dashboard/");	
	//}
	@Test
	public void Login() throws Exception {
		Thread.sleep(1000);
		a.findElement(By.id("signInFormEmailAddress")).sendKeys("7731831827");
		Thread.sleep(1000);
	    a.findElement(By.id("signInFormPassword")).sendKeys("Venkat@12232");
	}
	@Test
	public void Sign() throws InterruptedException {
		Thread.sleep(1000);
		a.findElement(By.id("signinSubmitBtn")).click();
	}

	
}

