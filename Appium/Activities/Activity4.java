package activities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Activity4 {
	
AndroidDriver driver; // driver declaration
WebDriverWait wait; // delcare Webdriver Wait
	
	@BeforeClass
	public void setup() throws MalformedURLException {
		
		//desired capabilities
		UiAutomator2Options options = new UiAutomator2Options();
		options.setPlatformName("android");
		options.setAutomationName("UiAutomator2");
		options.setAppPackage("com.google.android.contacts"); // this is application specific
		options.setAppActivity("com.android.contacts.activities.PeopleActivity");// this is application specific
		options.noReset();
		
		//server address
		URL serverUrl = new URL("http://localhost:4723/"); 
		//driver initilaization
		driver = new AndroidDriver(serverUrl, options);
		//initilaze the wait
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	} 

	@Test
	public void createContact()
	{
		
		String FirstName="Aaditya-Test";
		String LastName="Varma-Test";
		String PhoneNumber="9187654321";
		//Find and click the button to add a new contact.
		driver.findElement(AppiumBy.accessibilityId("Create contact")).click();
		
		//apply wait to load create contact page
		wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//android.widget.EditText[@text='First name']")));
		
		//Find and fill the first name, last name, and phone number fields with the data provided
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='First name']")).sendKeys(FirstName);
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='Last name']")).sendKeys(LastName);
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='Phone']")).sendKeys(PhoneNumber);
		//Click on Save.
		driver.findElement(AppiumBy.id("toolbar_button")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("large_title")));
		
		String contact = driver.findElement(AppiumBy.id("large_title")).getText();
		System.out.println("Contact is :"+contact);
		
		Assert.assertEquals(contact,"Aaditya-Test Varma-Test");
	
	}
	
	// Tear down method
    @AfterClass
    public void tearDown() {
        // Close the app
        driver.quit();

}
}
