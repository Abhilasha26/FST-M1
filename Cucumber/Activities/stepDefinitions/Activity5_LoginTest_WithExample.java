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

public class Activity5_LoginTest_WithExample {

	WebDriver driver;
	WebDriverWait wait;

	@Given("User is on LoginTest")
	public void LoginSetup()
	{
		driver =new FirefoxDriver();
		wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://v1.training-support.net/selenium/login-form");//open browser
	}
	@When("User enters {string} and {string}")
	public void CredentialsWithExample(String Username,String Password) throws Exception
	{
		driver.findElement(By.id("username")).sendKeys(Username);//enter username
		driver.findElement(By.id("password")).sendKeys(Password);//enter password
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Log in']")).click();// click on login button

	}
	@Then("Read the page title and confirmation message")
	public void TitlePrint()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("action-confirmation")));

		String pageTitle=driver.getTitle(); //get the title
		System.out.println("Page Title is : "+pageTitle);
		String confirmationMsg=driver.findElement(By.id("action-confirmation")).getText();//get the confirmation msg
		System.out.println("Confirmation Msg is :"+confirmationMsg);

		if (confirmationMsg.contains("admin"))
		{
			Assert.assertEquals(confirmationMsg, "Welcome Back, admin");
		}
		else
		{
			Assert.assertEquals(confirmationMsg, "Invalid Credentials");
		}

	}
	@And("Close the Browser")
	public void closeBrowser(){
		driver.quit();
	}


}
