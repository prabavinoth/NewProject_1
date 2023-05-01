package com.firstProject.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.firstProject.pageObjects.LoginPage;

public class Tc_loginTest_001 extends BaseClass  {

	@Test
	public void loginTest() {
		driver.get(baseURL);
		driver.manage().window().maximize();
		logger.info("URL is opened");

		LoginPage page = new LoginPage(driver);
		page.userName(userName);
		logger.info("Entered user name");
		page.passWord(passWord);
		logger.info("Entered password");

		page.clickSubmit();
		logger.info("Navigated to Home Page");
		
		
		logger.info("Validated the page Title");
		if (driver.getTitle().equals("Guru99 Bank Manager HomePage")) {

			Assert.assertTrue(true);

		}
		else 
		{
			logger.info("Validated the page Title false");
			Assert.assertTrue(false);
		}



	}



}
