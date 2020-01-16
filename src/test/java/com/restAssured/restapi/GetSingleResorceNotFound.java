package com.restAssured.restapi;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GetSingleResorceNotFound {
	String url = "https://reqres.in/api/unknown/23";
	@Test
	public void restValidation() {
		given().log().all().when().get(url).then().log().all().assertThat().statusCode(404);
		
	}
}
