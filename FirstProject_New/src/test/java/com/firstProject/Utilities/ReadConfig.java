package com.firstProject.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig() {
		
		File file = new File("./Configuration/Config.properties");
		
		try {
			FileInputStream input = new FileInputStream(file);
			pro = new Properties();
			pro.load(input);
			
		} catch (Exception e) {
			
			System.out.println("Exception is " + e.getMessage());
			
		}	
	}
	
	public String getApplicationURL() {
		String url = pro.getProperty("baseURL");
		return url;
	}
	
	public String getUserName() {
		String username = pro.getProperty("userName");
		return username;
	}
	
	public String getPassWord() {
		String password = pro.getProperty("passWord");
		return password;
	}
	
	public String getChromePath() {
		String chrome = pro.getProperty("ChromePath");
		return chrome;
	}



}
