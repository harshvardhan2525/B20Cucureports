package com.basic.restassuredsamplecode;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestingGoogle {
	
	public static void main(String args[]){
		
		Response res=RestAssured.given().get("https://www.google.com/");
		int stcode= res.getStatusCode();
		System.out.println(""+stcode);
		
		
	}

}
