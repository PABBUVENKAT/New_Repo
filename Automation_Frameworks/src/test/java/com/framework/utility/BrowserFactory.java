package com.framework.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory {
	WebDriver a;
	
	public static WebDriver startApplication(WebDriver a,String Browsername,String url) {
		if(Browsername.equalsIgnoreCase("chrome")) {
			a = new ChromeDriver();
		}
		else if (Browsername.equalsIgnoreCase("firefox")) {
			a = new FirefoxDriver();
		}
		else if (Browsername.equalsIgnoreCase("edge")) {
			a = new EdgeDriver();
		}
		else if (Browsername.equalsIgnoreCase("safari")) {
			a = new SafariDriver();
		}
		else
		{
			System.out.println("We Don't Support This Browser");
		}
		a.manage().window().maximize();
		//a.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		a.get(url);
		//a.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		return a;
	}
	public static WebDriver quitApplication(WebDriver a) throws Exception {
		Thread.sleep(6000);
		a.quit();
		return a;
	}

}
