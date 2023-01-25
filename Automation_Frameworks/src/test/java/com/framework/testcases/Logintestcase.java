package com.framework.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.framework.pages.BaseClass;
import com.framework.pages.LoginPage;
import com.framework.utility.ExcelDataProvider;

public class Logintestcase extends BaseClass{
	
	@Test
	public void Testcase() {
		
		ExcelDataProvider excel = new ExcelDataProvider();
		
		System.out.println("Test is Started");
		LoginPage loginpage = PageFactory.initElements(a, LoginPage.class);
		loginpage.LoginToHRM(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));
		System.out.println("Test is Completed");
	}
	
}
