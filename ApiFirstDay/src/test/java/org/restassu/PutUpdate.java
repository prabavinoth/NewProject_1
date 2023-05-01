package org.restassu;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PutUpdate {
	
	public static void main(String[] args) {
		RequestSpecification given = RestAssured.given();
		RequestSpecification header = given.header("Content-Type", "application/json");
		RequestSpecification reqspec = given.log().all().body("{\r\n" + 
				"    \"name\": \"morpheus\",\r\n" + 
				"    \"job\": \"zion resident\"\r\n" + 
				"}");
		Response put = reqspec.put("https://reqres.in/api/users/2");
		System.out.println(put.getStatusCode());
		System.out.println(put.getBody().asPrettyString());
		
		
	}

}
