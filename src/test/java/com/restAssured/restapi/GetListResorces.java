package com.restAssured.restapi;

import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GetListResorces {
	String url ="https://reqres.in/api/unknown";
	@Test
	public void restValidation() {
		given().log().all().when().get(url).then().log().all().assertThat().statusCode(200)
				.and().body("data.id",hasItems(1,2,3,4,5,6));
	
	}
}
