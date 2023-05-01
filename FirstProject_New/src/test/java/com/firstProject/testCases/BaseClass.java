package com.firstProject.testCases;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.firstProject.Utilities.ReadConfig;

public class BaseClass {
	
	ReadConfig config = new ReadConfig();

	public String baseURL = config.getApplicationURL();
	public String userName = config.getUserName();
	public String passWord = config.getPassWord();
	public static WebDriver driver;
	public static Logger logger;



	@BeforeClass
	public void normalBrowser() {
		System.setProperty("webdriver.chrome.driver",config.getChromePath());
		driver = new ChromeDriver();



		logger = Logger.getLogger("FirstProject");
		PropertyConfigurator.configure("log4j.properties");
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();


	}


}
