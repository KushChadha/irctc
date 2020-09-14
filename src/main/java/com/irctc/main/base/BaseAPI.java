package com.irctc.main.base;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class BaseAPI {
	
	private RestAssured restAssured;
	RequestSpecification request;
	
	public BaseAPI() {
		
	}
	
	public RestAssured client() {
		this.restAssured = new RestAssured();
		return this.restAssured;
	}
	
	public RequestSpecification request() {
		request = RestAssured.given();
		return request;
	}
	
}
