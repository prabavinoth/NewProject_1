package org.restassu;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostLoginSucessful {
	

	public static void main(String[] args) {
		RequestSpecification given = RestAssured.given();
		RequestSpecification header = given.header("Content-Type", "application/json");
		RequestSpecification reqspec = given.log().all().body("{\r\n" + 
				"    \"email\": \"eve.holt@reqres.in\",\r\n" + 
				"    \"password\": \"cityslicka\"\r\n" + 
				"}");
		Response post = reqspec.post("https://reqres.in/api/login");
		System.out.println(post.getStatusCode());
		System.out.println(post.getBody().asPrettyString());
		
		
	}

}
