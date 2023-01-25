package com.framework.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.framework.utility.BrowserFactory;
import com.framework.utility.ExcelDataProvider;

public class BaseClass {
	public WebDriver a;
	public ExcelDataProvider excel;
	
	/*@BeforeSuite
	public void setupsuite() {
		excel = new ExcelDataProvider();
	}*/

	@BeforeTest
	public void Setup() {
		a = BrowserFactory.startApplication(a, "chrome","https://innojc.kredily.com/company/dashboard/");
		System.out.println("Browser is launched");
	}
	

	@AfterTest
	public void close() throws Exception {
		BrowserFactory.quitApplication(a);
		System.out.println("Browser is closed");
	}
}
