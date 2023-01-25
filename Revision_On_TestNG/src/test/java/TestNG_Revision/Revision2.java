package TestNG_Revision;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import BasePack.BaseClass;

public class Revision2 extends BaseClass {

	@Test
	public void OrangeHRM() throws Exception {
		cdriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		cdriver.findElement(By.name("username")).sendKeys("Admin");
		cdriver.findElement(By.name("password")).sendKeys("admin123");
		
	}
	@Test
	public void Login() throws Exception {
		cdriver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	}
	
}
