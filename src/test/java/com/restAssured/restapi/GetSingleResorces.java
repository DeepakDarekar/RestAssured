package com.restAssured.restapi;

import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GetSingleResorces {
	String url = "https://reqres.in/api/unknown/10";
	@Test
	public void restValidation() {
		given().log().all().when().get("url").then().log().all().assertThat().statusCode(200)
				.and().body("data.id",equalTo(2),"data.name",equalTo("fuchsia rose"));
	
	}
}
