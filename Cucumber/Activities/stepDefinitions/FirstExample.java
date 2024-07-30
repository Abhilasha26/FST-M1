package stepDefinitions;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstExample extends BaseClass {
	
	@BeforeAll
	public static void setUp()
	{
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		
	}
	@AfterAll
    public static void tearDown()
    {
    	//driver.quit();
    }
	
	@Given("User login to app")
	public void LogintoApp()
	{
		 driver.get("https://v1.training-support.net");
		System.out.println("Title of page is :" +driver.getTitle());
		//Assertions.assertEquals("", driver.getTitle());
	}
     @When("User click on About button")
     public void clickButton()
     {
    	 driver.findElement(By.id("about-link")).click();
    	 
     }
     @Then("Show Title of the page")
     public void showResults()
     {
    	 System.out.println("Title of page after button click :" +driver.getTitle());
    	 Assertions.assertEquals("About Training Support", driver.getTitle());
     }
	
}