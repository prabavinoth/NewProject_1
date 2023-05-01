package org.restassu;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Delete {
	public static void main(String[] args) {
		RequestSpecification given = RestAssured.given();
		RequestSpecification header = given.header("Content-Type", "application/json");
		RequestSpecification pathParam = given.pathParam("page", "2");
		Response delete = given.log().all().delete("https://reqres.in/api/users/{page}");
		int statusCode = delete.getStatusCode();
		System.out.println(statusCode);
		ResponseBody body = delete.getBody();
		String asPrettyString = body.asPrettyString();
		System.out.println(asPrettyString);
		
	}
	

}
