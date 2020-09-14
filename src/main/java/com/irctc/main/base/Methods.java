package com.irctc.main.base;

import static io.restassured.RestAssured.*;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Methods {
	
	BaseAPI baseAPI;
	String hostURI;
	Response response;

	public Methods() {
		if (baseAPI == null) {
			baseAPI = new BaseAPI();
		}
		
	}
	
	public RequestSpecification requestObject() {
		return given();
	}
	
	public Response getRequest(String uri) {
		response = given().get(uri);
		return response;
	}
	
	
	
}
