package userManagement;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;

public class GetUsers {
	
	@Test
	public void getUserData() {
		//Provide the body
		given().
		//provide the url or uri
		when().get("https://reqres.in/api/users?page=2").
		//validation go with then
		then().assertThat().statusCode(200);
		
		
	}
	@Test
	public void validateGetResponseBody() {
		//Set base URI for the API
		RestAssured.baseURI = "https://reqres.in";
		
		//send a GET request and validate the response body using 'then'
		given().
		when().get("/api/users/2").
		then().assertThat().statusCode(200).
		extract().response();	
		
	}
	
	public void validateResponseHasItes() {
		
		RestAssured.baseURI = "https://reqres.in";
		
		Response response = given().
		when().get("/api/users?page=2")
		.then().extract().response();
		
		//Use Hamcrest to check that the response body contains specific items	
	}
	
	@Test(description = "Validate the status code for GET users endpoint")
	public void validateResponseBodyGetPathParam() {
		
		Response resp = given().pathParam("raceSeason", 2017).when().get("http://ergast.com/api/f1/{raceSeason}/circuits.json");
		
		int actualStatusCode = resp.statusCode();
		
		assertEquals(actualStatusCode, 200);
		System.out.println(resp.body().asString());
		
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
