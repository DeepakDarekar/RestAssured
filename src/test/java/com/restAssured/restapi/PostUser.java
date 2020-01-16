package com.restAssured.restapi;

import org.testng.annotations.Test;
/*
import com.jayway.restassured.response.Response;

import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;*/

import static io.restassured.RestAssured.*;

public class PostUser {
	@Test
	public void createNewUser() {
		String userPayload = "{\r\n" +
		        "  \"name\": \"Sachin\",\n" +
		        "  \"job\": \"leader\"\n" +
		        "}";
		
		 @SuppressWarnings("unused")
		io.restassured.response.Response response = given()
          .body(userPayload)
          .post("https://reqres.in/api/users")
          .andReturn()
          .then()
          .statusCode(201)
          .log().all()
          .extract()
          .response();
				
	}
}
