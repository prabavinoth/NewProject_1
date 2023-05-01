package org.restassu;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class PetUserLogin {
	
	public static void main(String[] args) {
		RequestSpecification given = RestAssured.given();
		RequestSpecification header = given.header("content-type", "application/json");
		RequestSpecification queryParam = given.queryParam("page", "2");
		Response response = given.get("https://petstore.swagger.io/v2/user/login?username=string&password=string");
		int statusCode = response.statusCode();
		System.out.println(statusCode);
		ResponseBody body = response.getBody();
		String asPrettyString = body.asPrettyString();
		System.out.println(asPrettyString);
	}

}
