package com.restAssured.restapi;

import org.testng.annotations.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;
import static io.restassured.RestAssured.*;

public class GetListUsers {
	String url = "https://reqres.in/api/users?page=2";
	@Test
	public void restValidation() {
		given().log().all().when().get("url").then().log().all().assertThat().statusCode(200).
		and().body("data.id",hasItems(1,2,3,4,5,6));
	}
}
