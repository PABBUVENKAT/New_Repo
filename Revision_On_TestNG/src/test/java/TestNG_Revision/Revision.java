package TestNG_Revision;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import BasePack.BaseClass;

public class Revision extends BaseClass  {

	@Test(priority = -1)
	public void GetURL() throws Exception {
		cdriver.get("https://demoqa.com/");
		Thread.sleep(1000);
		
	}
	@Test(priority = 1,testName = "element")
	public void clickelement() throws Exception {
		cdriver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]")).click();
	}
	@Test(priority = 2,testName = "testbox")
	public void clickTestbox() {
		cdriver.findElement(By.id("item-0")).click();
	}
	@Test(priority = 3,testName = "details")
	public void EnterDetails() throws InterruptedException {
		cdriver.findElement(By.id("userName")).sendKeys("Vaishunavi Vaishu");
		cdriver.findElement(By.id("userEmail")).sendKeys("vaishu99@gmail.com");
		cdriver.findElement(By.id("currentAddress")).sendKeys("Kerela");
		cdriver.findElement(By.id("permanentAddress")).sendKeys("Vizag");
		Thread.sleep(1000);
		cdriver.findElement(By.cssSelector("#submit")).click();
	}
	/*@Test(priority = 4,testName = "submit")
	public void Submit() throws Exception {
		Thread.sleep(1000);
		cdriver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		
	}*/
}
