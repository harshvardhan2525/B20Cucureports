package com.basic.TestGoogle;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
//cucumber & restassured combined pgm
public class testingooglestepdef {
	Response res;
	@Given("^I start rest assured testing$")
	public void i_start_rest_assured_testing()  {
	  System.out.println("starting test case"); 
	}

	@When("^I hit google website$")
	public void i_hit_google_website()  {
	    res=RestAssured.given().get("https://www.google.com/");
	}

	@Then("^I check status code for google response$")
	public void i_check_status_code_for_google_response() {
		int stCode = res.getStatusCode();
		Assert.assertTrue(stCode==200);
	}


}
