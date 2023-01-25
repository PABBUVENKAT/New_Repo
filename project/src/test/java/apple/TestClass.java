package apple;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass {
	@Test
	public void Test() throws InterruptedException {
		//WebDriverManager.chromedriver().setup();
		WebDriver cdriver = new ChromeDriver();
		cdriver.manage().window().maximize();
		cdriver.get("https://innojc.kredily.com/company/dashboard/");
		cdriver.findElement(By.id("signInFormEmailAddress")).sendKeys("7731831827");
		cdriver.findElement(By.id("signInFormPassword")).sendKeys("Venkat@12232");
		//cdriver.findElement(By.xpath("//*[@id=\"signInForm\"]/div/div[4]/div[1]/div/label[1]")).click();
		cdriver.findElement(By.id("signinSubmitBtn")).click();

		}
	@Test
	public void test1() throws InterruptedException {
		ChromeDriver a = new ChromeDriver();
    	a.manage().window().maximize();
    	a.get("https://www.youtube.com/watch?v=epAFDEJImrU");
    	a.findElement(By.xpath("//*[@id=\"movie_player\"]/div[30]/div[2]/div[1]/button")).click();
    	Thread.sleep(5000);
    	a.manage().window().minimize();	
		}
	@SuppressWarnings("deprecation")
	@Test
	public void Test2() throws InterruptedException {
		ChromeDriver b = new ChromeDriver();
		b.manage().window().maximize();
		b.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		b.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		b.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
		b.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
		b.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		b.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a/span")).click();
	}
	@Test
	public void Test3() {
	}

	
}
