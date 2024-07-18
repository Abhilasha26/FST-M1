package activities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Activity6 {

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
	
	@Test
	public void Chrome_Test() throws Exception {
		
		driver.get("https://v1.training-support.net/selenium/lazy-loading");
		Thread.sleep(5000);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(AppiumBy.xpath("//android.view.View[@text=\"Lazy Loading\"]")));
		
		// Find all the image elements on the page
        List<WebElement> imageElements = driver.findElements(AppiumBy.className("android.widget.Image"));
 
        // Print the number of images
        System.out.println("Before scroll: " + imageElements.size());
        
        String UiScrollable = "UiScrollable(UiSelector().scrollable(true))";
        // Scroll using UiScrollable
        driver.findElement(AppiumBy.androidUIAutomator(UiScrollable + ".scrollForward(7) .scrollTextIntoView(\"helen\")"));
        
     // Get image elements after scroll
        imageElements = driver.findElements(AppiumBy.className("android.widget.Image"));
 
        // Print the number of images after scroll
        System.out.println("After scroll: " + imageElements.size());
 
        // Assertions
        Assert.assertEquals(imageElements.size(), 5);
    }
		
	}

