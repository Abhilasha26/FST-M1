package activities;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Actvitity1_BasicLocators {
AndroidDriver driver;
	
	@BeforeClass
	public void setup() throws MalformedURLException {
		UiAutomator2Options options = new UiAutomator2Options();
		options.setPlatformName("android");
		options.setAutomationName("UiAutomator2");
		options.setAppPackage("com.google.android.calculator");
		options.setAppActivity("com.android.calculator2.Calculator");
		options.noReset();
		
		URL serverUrl = new URL("http://localhost:4723/");
		
		driver = new AndroidDriver(serverUrl, options);
	} 
	@Test
	public void AddTest()
	{
		driver.findElement(AppiumBy.id("digit_9")).click();
		driver.findElement(AppiumBy.accessibilityId("plus")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.Button[contains(@text, '5')]")).click();
		driver.findElement(AppiumBy.accessibilityId("equals")).click();
		String result = driver.findElement(AppiumBy.id("result")).getText();
		System.out.println("result is :"+result);
	}
	

}
