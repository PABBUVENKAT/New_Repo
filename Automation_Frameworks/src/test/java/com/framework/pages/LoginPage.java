package com.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	WebDriver a;
	
	public LoginPage(WebDriver b) {
		this.a = b;
	}
	
	@FindBy(id="signInFormEmailAddress") WebElement EmailAddress;
	@FindBy(id="signInFormPassword") WebElement Password;
	@FindBy(id="signinSubmitBtn") WebElement SubmitBtn;
	
	public void LoginToHRM(String usernameApplication,String passwordApplication) {
		EmailAddress.sendKeys(usernameApplication);
		Password.sendKeys(passwordApplication);
		SubmitBtn.click();
	}
}
