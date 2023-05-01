package org.restassu;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostCreate {
	public static void main(String[] args) {
		RequestSpecification given = RestAssured.given();
		RequestSpecification header = given.header("Content-Type", "application/json");
		RequestSpecification reqspec = given.log().all().body("{\r\n" + 
				"    \"name\": \"morpheus\",\r\n" + 
				"    \"job\": \"leader\"\r\n" + 
				"}");
		Response post = reqspec.post("https://reqres.in/api/users");
		System.out.println(post.getStatusCode());
		System.out.println(post.getBody().asPrettyString());
		
		
	}

}
