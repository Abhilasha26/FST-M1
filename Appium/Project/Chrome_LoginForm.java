/*Opening a page on the browser and testing a simple login page with correct and incorrect credentials*/

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

public class Chrome_LoginForm {
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
		driver.findElement(AppiumBy.androidUIAutomator(UiScrollable +".scrollForward(14) .scrollTextIntoView(\"Login Form  Please sign in. \")"));
		Thread.sleep(5000);

		wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.view.View[@text=\"Login Form  Please sign in. \"]")));

		Thread.sleep(10000);
		driver.findElement(AppiumBy.xpath("//android.view.View[@text=\"Login Form  Please sign in. \"]")).click();

	} 
	@Test(priority = 2,dependsOnMethods = "LoginForm")
	public void correctCred() throws Exception
	{

		String user_name="admin";
		String pass_word="Password";

		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id=\"username\"]")).sendKeys(user_name);
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id=\"password\"]")).sendKeys(pass_word);
		driver.findElement(AppiumBy.xpath("//android.widget.Button[@text=\"Log in\"]")).click();
		Thread.sleep(2000);

		String welcomemsg1= driver.findElement(AppiumBy.xpath("//android.view.View[@resource-id=\"action-confirmation\"]")).getText();
		Assert.assertEquals(welcomemsg1,"Welcome Back, admin");
	}

	@Test(priority = 3,dependsOnMethods ="LoginForm")
	public void InCorrectCred() throws Exception
	{
		String username="admin1";
		String password="password1";

		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id=\"username\"]")).sendKeys(username);
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id=\"password\"]")).sendKeys(password);
		driver.findElement(AppiumBy.xpath("//android.widget.Button[@text=\"Log in\"]")).click();
		Thread.sleep(2000);

		String welcomemsg2= driver.findElement(AppiumBy.xpath("//android.view.View[@resource-id=\"action-confirmation\"]")).getText();
		Assert.assertEquals(welcomemsg2,"Invalid Credentials");

	}



}
