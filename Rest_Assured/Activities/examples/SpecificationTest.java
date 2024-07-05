package examples;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThanOrEqualTo;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class SpecificationTest {
	
	RequestSpecification requestSpec;
	ResponseSpecification responseSpec;
	int petId;
	
	@BeforeClass
	public void setUp()
	{   //RequestSpecification
		requestSpec=new RequestSpecBuilder().
				       setBaseUri("https://petstore.swagger.io/v2/pet").
				       addHeader("Content-Type","application/json").
				       build();
				
		//ResponseSpecification
		//expectResponse time is expecting time in Long value not interger value, hence used 3000L
		responseSpec=new ResponseSpecBuilder().
				     expectStatusCode(200).
				     expectResponseTime(lessThanOrEqualTo(3000L)).
				     build();
		
	}
	
	//POST https://petstore.swagger.io/v2/pet
	@Test(priority = 1)
	public void postRequest()
	{
		//create request body
		Map<String,Object> reqBody= new HashMap<String,Object>();
		reqBody.put("id", 26002);
		reqBody.put("name", "Bruno1");
		reqBody.put("status", "alive");
		
		Response response = given().spec(requestSpec).body(reqBody).log().all().
				            when().post();
		//Extract the Petid
		petId=response.then().extract().path("id");
		//Assertation
		response.then().spec(responseSpec).body("status",equalTo("alive")).log().all();
	}
	
	//GET https://petstore.swagger.io/v2/pet/{petId}
	@Test(dependsOnMethods = {"postRequest"},priority = 2)
	public void getRequest()
	{
		
		given().spec(requestSpec).pathParam("petId",petId).log().all().
		when().get("/{petId}").
		then().spec(responseSpec).body("status",equalTo("alive")).log().all();	
		
	}
	
	//DELETE https://petstore.swagger.io/v2/pet/{petId}
	@Test(dependsOnMethods = {"postRequest"},priority = 3)
	public void deleteRequest()
	{
		given().spec(requestSpec).pathParam("petId",petId).log().all().
		when().delete("/{petId}").
		then().spec(responseSpec).body("message",equalTo(""+petId));	
		
	}

}
