package org.restassu;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class PetFindByStatusAvailable {
	public static void main(String[] args) {
		RequestSpecification given = RestAssured.given();
		RequestSpecification header = given.header("Content-Type", "application/json");
		RequestSpecification queryParam = given.queryParam("status","pending");
		Response response = given.log().all().get("https://petstore.swagger.io/v2/pet/findByStatus");
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		ResponseBody body = response.getBody();
		String asPrettyString = body.asPrettyString();
		System.err.println(asPrettyString);
	}

}
