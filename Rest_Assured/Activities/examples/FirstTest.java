package examples;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;


public class FirstTest {
	
    //GET https://petstore.swagger.io/v2/pet/findByStatus?status=alive
	@Test(priority = 1)
	public void getRequestWithQueryParam()
	{
		Response response=
				given().
				     baseUri("https://petstore.swagger.io/v2/pet").
				     header("Content-Type","application/json").
				     queryParam("status","alive").
				when().
				      get("/findByStatus");
		
		//Print the response headers
			System.out.println(response.getHeaders());
		//print the response body
			System.out.println(response.getBody().asString());
			System.out.println("***************Body in proper JSON format************");
			System.out.println(response.getBody().asPrettyString());
		
		
		//extracts properties
			String petStatus=response.then().extract().path("[0].status");
			System.out.println("Pet status is: "+petStatus);
			Assert.assertEquals(petStatus, "alive");
		
		//RestAssured Assertation
			response.then().statusCode(200).body("[0].status",equalTo("alive"));				   			     
	}
	
	//GET https://petstore.swagger.io/v2/pet/{petId}
	@Test (priority = 2)
	public void getRequestWithPathParam()
	{
		given().
			baseUri("https://petstore.swagger.io/v2/pet").
			header("Content-Type","application/json").
		    pathParam("petId", 77232).log().all().
         when().
            get("/{petId}").
         then().
            statusCode(200).
            body("status",equalTo("alive")).log().all();
           
            

	}
}
