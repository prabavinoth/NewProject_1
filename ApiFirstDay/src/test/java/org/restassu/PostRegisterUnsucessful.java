package org.restassu;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostRegisterUnsucessful {
	
	public static void main(String[] args) {
		RequestSpecification given = RestAssured.given();
		RequestSpecification header = given.header("Content-Type", "application/json");
		RequestSpecification reqspec = given.log().all().body("{\r\n" + 
				"    \"email\": \"sydney@fife\"\r\n" + 
				"}");
		Response post = reqspec.post("https://reqres.in/api/register");
		System.out.println(post.getStatusCode());
		System.out.println(post.getBody().asPrettyString());
		
		
	}

}
