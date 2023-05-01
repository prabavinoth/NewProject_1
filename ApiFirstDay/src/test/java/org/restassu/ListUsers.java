package org.restassu;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class ListUsers {
	
	public static void main(String[] args) {
		
		RequestSpecification reqspc = RestAssured.given();
		RequestSpecification header = reqspc.header("Content-Type", "application/json");
		RequestSpecification queryParam = reqspc.queryParam("page","2");
		Response response = reqspc.log().all().get("https://reqres.in/api/users");
		int statuscode = response.getStatusCode();
		System.out.println(statuscode);
		ResponseBody responseBody = response.getBody();
		String asPrettyString = responseBody.asPrettyString();
		System.out.println(asPrettyString);
		
		
	}
	
	
	
	
	

}
