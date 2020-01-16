package com.restAssured.restapi;

import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GetDelay {
	String url = "https://reqres.in/api/users?delay=3";
	@Test
	public void restValidation() {
		given().log().all().when().get("url").then().log().all().assertThat().statusCode(200)
				.and().body("total_pages",equalTo(2),"data.first_name",equalTo("George"));
	
	}
}
