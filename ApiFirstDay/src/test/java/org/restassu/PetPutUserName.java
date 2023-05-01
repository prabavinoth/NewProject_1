package org.restassu;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PetPutUserName {
	public static void main(String[] args) {
		

	
	RequestSpecification given = RestAssured.given();
	RequestSpecification header = given.header("Content-Type", "application/json");
	RequestSpecification reqspec = given.log().all().body("{\r\n" + 
			"  \"id\": 0,\r\n" + 
			"  \"username\": \"string\",\r\n" + 
			"  \"firstName\": \"string\",\r\n" + 
			"  \"lastName\": \"string\",\r\n" + 
			"  \"email\": \"string\",\r\n" + 
			"  \"password\": \"string\",\r\n" + 
			"  \"phone\": \"string\",\r\n" + 
			"  \"userStatus\": 0\r\n" + 
			"}");
	Response login = reqspec.put("https://petstore.swagger.io/v2/user/string");
	System.out.println(login.getStatusCode());
	System.out.println(login.body().asPrettyString());
	

	
	}
	
}


