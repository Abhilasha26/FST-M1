package project;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class GoogleKeep_Reminder {
	
		AndroidDriver driver;
		WebDriverWait wait;
	
	@BeforeClass
	public void setup() throws MalformedURLException {
		UiAutomator2Options options = new UiAutomator2Options();
		options.setPlatformName("android");
		options.setAutomationName("UiAutomator2");
		options.setAppPackage("com.google.android.keep");
		options.setAppActivity(".activities.BrowseActivity");
		options.noReset();
		
		URL serverUrl = new URL("http://localhost:4723/");
		
		driver = new AndroidDriver(serverUrl, options);
		wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		
       }
	
	@Test
	public void googleKeep_reminder()
	{
		driver.findElement(AppiumBy.accessibilityId("New text note")).click();
		driver.findElement(AppiumBy.id("editable_title")).sendKeys("Appium Reminder");
		driver.findElement(AppiumBy.id("edit_note_text")).sendKeys("This reminder is created using appium code");
		driver.findElement(AppiumBy.id("menu_reminder")).click();
		System.out.println("Title and desc entered");
		
		//reminder button click
		WebElement dateTimebutton = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.google.android.keep:id/menu_text\" and @text=\"Pick a date & time\"]"));
		dateTimebutton.click();
		//click on date dropdown
		driver.findElement(AppiumBy.xpath("//android.widget.Spinner[@content-desc=\"Date - Currently selected - July 15\"]")).click();
		//click on option "Today"
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.google.android.keep:id/text\" and @text=\"Today\"]")).click();
		System.out.println("selected today's date");
	    
		//click on Time dropdown
	    driver.findElement(AppiumBy.xpath("//android.widget.LinearLayout[@resource-id=\"com.google.android.keep:id/time_spinner\"]")).click();
	    
	    //Select Afternoon
	    driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.google.android.keep:id/text\" and @text=\"Afternoon\"]")).click();
	    System.out.println("selected time");
	    //Save reminder
	    driver.findElement(AppiumBy.id("save")).click();
	    System.out.println("data saved");
	    
	    // Assertion of Title
	    String ReminderTitle =driver.findElement(AppiumBy.id("editable_title")).getText();
		System.out.println("Note Text is:"+ReminderTitle);
		Assert.assertEquals(ReminderTitle,"Appium Reminder" );
		  
		//Assertion of reminder date and time
		String DateAndTime=driver.findElement(AppiumBy.accessibilityId("Time reminder Today, 1:00 PM")).getText();
		System.out.println("reminder time is :"+DateAndTime);
		Assert.assertEquals(DateAndTime,"Today, 1:00 PM");
		
	}
}
