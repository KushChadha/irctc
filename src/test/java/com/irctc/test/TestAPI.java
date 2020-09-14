package com.irctc.test;

import com.irctc.main.base.Methods;

public class TestAPI {
	Methods methods;
	
	public TestAPI() {
		if (methods == null) {
			methods = new Methods();
		}
	}

	public void getTrain() {
		methods.requestObject()
			.queryParam(parameterName, parameterValues)
	}
}
