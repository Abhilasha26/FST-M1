package activities;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Activity3 {
	AndroidDriver driver; // driver declaration
	
	@BeforeClass
	public void setup() throws MalformedURLException {
		
		//desired capabilities
		UiAutomator2Options options = new UiAutomator2Options();
		options.setPlatformName("android");
		options.setAutomationName("UiAutomator2");
		options.setAppPackage("com.google.android.calculator"); // this is application specific
		options.setAppActivity("com.android.calculator2.Calculator");// this is application specific
		options.noReset();
		
		//server address
		URL serverUrl = new URL("http://localhost:4723/"); 
		//driver initilaization
		driver = new AndroidDriver(serverUrl, options);
	} 

	//-------------Calculate 5 + 9 and print the result to the console.
	@Test
	public void sum()
	{
		
		driver.findElement(AppiumBy.id("digit_5")).click();
		driver.findElement(AppiumBy.accessibilityId("plus")).click();
		driver.findElement(AppiumBy.id("digit_9")).click();
		driver.findElement(AppiumBy.accessibilityId("equals")).click();
		String sumResult= driver.findElement(AppiumBy.id("result_final")).getText();
		System.out.println("result is :"+sumResult);
		Assert.assertEquals(sumResult,"14");
		driver.findElement(AppiumBy.accessibilityId("clear")).click();
	}
	
	//-------Calculate 10 - 5 and print the result to the console.
	@Test
	public void substract()
	{
		
		driver.findElement(AppiumBy.id("digit_1")).click();
		driver.findElement(AppiumBy.id("digit_0")).click();
		driver.findElement(AppiumBy.accessibilityId("minus")).click();
		driver.findElement(AppiumBy.id("digit_5")).click();
		driver.findElement(AppiumBy.accessibilityId("equals")).click();
		String subResult= driver.findElement(AppiumBy.id("result_final")).getText();
		System.out.println("result is :"+subResult);
		Assert.assertEquals(subResult,"5");
		driver.findElement(AppiumBy.accessibilityId("clear")).click();
	}
	
	//----------------Calculate 5 * 100 and print the result to the console.
	@Test
	public void multiplication()
	{
		//Calculate 5 * 100 and print the result to the console.
		driver.findElement(AppiumBy.id("digit_5")).click();
		driver.findElement(AppiumBy.accessibilityId("multiply")).click();
		driver.findElement(AppiumBy.id("digit_1")).click();
		driver.findElement(AppiumBy.id("digit_0")).click();
		driver.findElement(AppiumBy.id("digit_0")).click();
		driver.findElement(AppiumBy.accessibilityId("equals")).click();
		String subResult= driver.findElement(AppiumBy.id("result_final")).getText();
		System.out.println("result is :"+ subResult);
		Assert.assertEquals(subResult,"500");
		driver.findElement(AppiumBy.accessibilityId("clear")).click();
	}
	
	
	//----------------Calculate 50 / 2 and print the result to the console.
	@Test
	public void division()
	{
	
		driver.findElement(AppiumBy.id("digit_5")).click();
		driver.findElement(AppiumBy.id("digit_0")).click();
		driver.findElement(AppiumBy.accessibilityId("divide")).click();
		driver.findElement(AppiumBy.id("digit_2")).click();
		driver.findElement(AppiumBy.accessibilityId("equals")).click();
		String divResult= driver.findElement(AppiumBy.id("result_final")).getText();
		System.out.println("result is :"+divResult);
		Assert.assertEquals(divResult,"25");
		driver.findElement(AppiumBy.accessibilityId("clear")).click();
	}
	
}
