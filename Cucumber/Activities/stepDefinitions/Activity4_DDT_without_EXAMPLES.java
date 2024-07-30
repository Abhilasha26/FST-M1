package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Activity4_DDT_without_EXAMPLES {
	WebDriver driver;
	static WebDriverWait wait;

	@Given("User is on Test Login page")
	public void setup_withoutExample() {
		//Setup instances
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));

		//Open browser
		driver.get("https://v1.training-support.net/selenium/login-form");
	}
	@When("User enters {string} and {string} in login form")
	public void credentials_withoutExample(String username, String password) throws Throwable {
		//Enter username from Feature file
		driver.findElement(By.id("username")).sendKeys(username);
		//Enter password from Feature file
		driver.findElement(By.id("password")).sendKeys(password);
		//Click Login
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("Read the page title and confirmation message after login")
	public void titleAndHeading_withoutExample() {
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
	@And("Teardown the browser")
	public void Browser_teardown() {
		//Close browser
		driver.close();
	}
}
