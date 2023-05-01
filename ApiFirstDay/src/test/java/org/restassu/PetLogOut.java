package org.restassu;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class PetLogOut {
	
	public static void main(String[] args) {
		RequestSpecification given = RestAssured.given();
		Response response = given.get("https://petstore.swagger.io/v2/user/logout");
		int statusCode = response.statusCode();
		System.out.println(statusCode);
		ResponseBody body = response.getBody();
		String asPrettyString = body.asPrettyString();
		System.out.println(asPrettyString);
	}	

}
