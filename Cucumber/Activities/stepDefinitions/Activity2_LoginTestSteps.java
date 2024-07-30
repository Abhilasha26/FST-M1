package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity2_LoginTestSteps extends BaseClass{
	
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
	
    
    @Given("User is on Login page")
    public void loginPage()
    { 
        //Open browser
        driver.get("https://v1.training-support.net/selenium/login-form");
    }
    
    @When("User enters username and password")
    public void enterCredentials() {
        //Enter username
        driver.findElement(By.id("username")).sendKeys("admin");
        //Enter password
        driver.findElement(By.id("password")).sendKeys("password");
        //Click Login
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
    
   
    @Then("get the confirmation text and verify message as \"Welcome Back,{string}")
    public void readTitleAndHeading() {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("action-confirmation")));
        
        //Read the page title and heading
        String pageTitle = driver.getTitle();
        String confirmMessage = driver.findElement(By.id("action-confirmation")).getText();
        
        //Print the page title and heading
        System.out.println("Page title is: " + pageTitle);
        System.out.println("Login message is: " + confirmMessage);
 
        //Assertion
        Assert.assertEquals(confirmMessage, "Welcome Back, admin");
    }
 
}


