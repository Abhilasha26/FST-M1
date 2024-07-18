package project;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Chrome_PopupsLogin {
	AndroidDriver driver;
	WebDriverWait wait;


	@BeforeClass
	public void setup() throws MalformedURLException {
		UiAutomator2Options options = new UiAutomator2Options();
		options.setPlatformName("android");
		options.setAutomationName("UiAutomator2");
		options.setAppPackage("com.android.chrome");
		options.setAppActivity("com.google.android.apps.chrome.Main");
		options.noReset();

		URL serverUrl = new URL("http://localhost:4723/");

		driver = new AndroidDriver(serverUrl, options);
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));

	}
	@Test(priority = 1)
	public void LoginForm() throws Exception
	{
		driver.get("https://v1.training-support.net/selenium");

		Thread.sleep(1000);

		String UiScrollable = "UiScrollable(UiSelector().scrollable(true))";
		//Scroll using UiScrollable
		driver.findElement(AppiumBy.androidUIAutomator(UiScrollable +".scrollForward(5)"));
		Thread.sleep(5000);

		wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.view.View[@text=\"Popups  Tooltips and Modals \"]")));
		driver.findElement(AppiumBy.xpath("//android.view.View[@text=\"Popups  Tooltips and Modals \"]")).click();
		Thread.sleep(5000);

		//signin button click
		driver.findElement(AppiumBy.xpath("//android.widget.Button[@text=\"Sign In \"]")).click();

	} 

	@Test(priority = 2, dependsOnMethods = "LoginForm")
	public void CorrectLogin() throws Exception
	{
		String C_UserName="admin";
		String C_Password="password";
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id=\"username\"]")).sendKeys(C_UserName);
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id=\"password\"]")).sendKeys(C_Password);
		driver.findElement(AppiumBy.xpath("//android.widget.Button[@text=\"Log in\"]")).click();
		Thread.sleep(5000);

		String C_confirmationMsg=driver.findElement(AppiumBy.xpath("//android.view.View[@resource-id=\"action-confirmation\"]")).getText();
		System.out.println("Correct login confirmation msg is :"+C_confirmationMsg);
		Assert.assertEquals(C_confirmationMsg,"Welcome Back, admin");

	}
	@Test(priority = 3, dependsOnMethods = "LoginForm")
	public void InCorrectLogin() throws Exception
	{
		String In_UserName="admin1";
		String In_Password="password1";
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id=\"username\"]")).sendKeys(In_UserName);
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id=\"password\"]")).sendKeys(In_Password);
		driver.findElement(AppiumBy.xpath("//android.widget.Button[@text=\"Log in\"]")).click();
		Thread.sleep(5000);

		String In_confirmationMsg=driver.findElement(AppiumBy.xpath("//android.view.View[@resource-id=\"action-confirmation\"]")).getText();
		System.out.println("InCorrect login confirmation msg is :"+In_confirmationMsg);
		Assert.assertEquals(In_confirmationMsg, "Invalid Credentials");

	}

}
