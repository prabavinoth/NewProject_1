package org.restassu;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class PetImageUpload {
	
	public static void main(String[] args) {
		RequestSpecification given = RestAssured.given();
		RequestSpecification header = given.header("Content-Type", "application/json");
		RequestSpecification pathParam = given.pathParam("page", "123");
		Response response = given.log().all().post("https://petstore.swagger.io/v2/pet/123/uploadImage{page}");
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		ResponseBody body = response.getBody();
		String asPrettyString = body.asPrettyString();
		System.err.println(asPrettyString);
		
		

}
}
