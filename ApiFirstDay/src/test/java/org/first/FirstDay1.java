package org.first;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class FirstDay1 {

	public static void main(String[] args) throws IOException, ParseException {

		FileReader reader = new FileReader(
				"C:\\Users\\svinu\\eclipse-workspace\\ApiFirstDay\\src\\test\\resources\\ApijsonFirst\\FirstDay1.json");
		JSONParser jsonp = new JSONParser();
		Object obj = jsonp.parse(reader);
		JSONObject I = (JSONObject)obj;
		System.out.println("data");
		Object Data = I.get("data");
		JSONObject Data1 = (JSONObject) Data;
		System.out.println("ID:" + Data1.get("id"));
		System.out.println("Email:" + Data1.get("email"));
		System.out.println("FirstName:" + Data1.get("first_name"));
		System.out.println("LastName:" + Data1.get("last_name"));
		System.out.println("Avatar:" + Data1.get("avatar"));
		System.out.println("support");
		Object Support = I.get("support");
		JSONObject Support1 = (JSONObject) Support;
		System.out.println("URL:" + Support1.get("url"));
		System.out.println("text:" + Support1.get("text"));
	

	}

}
