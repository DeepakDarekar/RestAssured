package com.restAssured.restapi;

import org.testng.annotations.Test;

import static org.hamcrest.Matchers.equalTo;

import static io.restassured.RestAssured.*;

public class GetSingleUser {
	String url= "https://reqres.in/api/users/2";
	@Test
	public void restValidation() {
		given().log().all().when().get("url").then().log().all().assertThat().statusCode(200).
		and().body("data.id",equalTo(2));
	}
}
