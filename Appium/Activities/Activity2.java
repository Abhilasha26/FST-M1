package activities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Activity2 {
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
		driver.get("https://v1.training-support.net/");

		Thread.sleep(1000);
		String PageHeading=driver.findElement(AppiumBy.xpath("//android.view.View[@text=\"Training Support\"]")).getText();
		System.out.println("Heading Title is :"+PageHeading);
		
		driver.findElement(AppiumBy.xpath("//android.view.View[@resource-id=\"about-link\"]")).click();
		Thread.sleep(2000);
		
		String AboutUsTitle =driver.findElement(AppiumBy.xpath("//android.view.View[@text=\"About Us\"]")).getText();
		System.out.println("Page Title after button click:"+AboutUsTitle);
		
	}
	// Tear down method
    @AfterClass
    public void tearDown() {
        // Close the app
        driver.quit();
    }

}
