package com.firstProject.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver idriver;
	
	public LoginPage(WebDriver rdriver) {
		
		idriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name = "uid")
	WebElement txtUserName;
	
	@FindBy(name = "password")
	WebElement txtPassword;
	
	@FindBy(name = "btnLogin")
	WebElement btnLogin;
	
	public void userName(String uname) {
		txtUserName.sendKeys(uname);
}
	public void passWord(String pword) {
		txtPassword.sendKeys(pword);

}
	public void clickSubmit() {
		btnLogin.click();
		
	}
	
	
	
	
	

}
