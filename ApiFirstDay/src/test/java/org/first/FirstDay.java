package org.first;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class FirstDay {

	public static void main(String[] args) throws IOException, ParseException {

		FileReader reader = new FileReader(
				"C:\\Users\\svinu\\eclipse-workspace\\ApiFirstDay\\src\\test\\resources\\ApijsonFirst\\FirstDay.json");

		JSONParser jsonparser = new JSONParser();

		Object obj = jsonparser.parse(reader);

		JSONObject j = (JSONObject) obj;
		Object firstName = j.get("FirstName");
		System.out.println("FirstName: " + firstName);
		Object lastName = j.get("LastName");
		System.out.println("LastName : " + lastName);
		Object email = j.get("Email");
		System.out.println("Email: "+ email);
		Object phone = j.get("PhoneNo");
		System.out.println("PhoneNo: "+ phone);
		Object pass = j.get("Password");
		System.out.println("password: "+ pass);
		Object cpass = j.get("Confirm Password");
		System.out.println("Confirm Password: "+ cpass);
		Object dob = j.get("Dateofbirth");
		System.out.println("Dateofbirth: "+ dob);
		Object Gender = j.get("Gender");
		System.out.println("Gender: "+ Gender);
		
		
	
	
	
	
	
	
	
	
	
	}

}
