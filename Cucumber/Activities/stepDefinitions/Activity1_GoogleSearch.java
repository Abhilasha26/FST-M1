package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity1_GoogleSearch extends BaseClass {
	
	@BeforeAll
	public static void setUp()
	{
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		
	}
	@AfterAll
    public static void tearDown()
    {
    	driver.quit();
    }
	
	@Given("^User is on Google Home Page$")
	public void googleSearch()
	{
		driver.get("https://www.google.com/");
		System.out.println("Print Title : " +driver.getTitle());
	}

	@When("^User types in Cheese and hits ENTER$")
	public void searchElement()
	{
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("cheese",Keys.RETURN);
		//driver.findElement(By.id("q")).sendKeys(Keys.ENTER);
	}
	
	@Then("^Show how many search results were shown$")
	public void showResult()
	{
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("result-stats")));
        String resultStats = driver.findElement(By.id("result-stats")).getText();
        System.out.println("Number of results found: " + resultStats);
		
	}

	
	}
