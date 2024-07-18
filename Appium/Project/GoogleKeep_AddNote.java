package project;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class GoogleKeep_AddNote {
         
	AndroidDriver driver;
	
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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	} 
   @Test
   public void googlekeep_addNote()
   {
	   driver.findElement(AppiumBy.accessibilityId("New text note")).click();
	   driver.findElement(AppiumBy.id("editable_title")).sendKeys("Appium Note");
	   driver.findElement(AppiumBy.id("edit_note_text")).sendKeys("This note is created using appium code");
	   driver.findElement(AppiumBy.id("editable_title")).click();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   
	   driver.findElement(AppiumBy.accessibilityId("Navigate up")).click();
	   
	  driver.findElement(AppiumBy.id("browse_note_interior_content")).click();
	  String NoteTitle =driver.findElement(AppiumBy.id("editable_title")).getText();
	  System.out.println("Note Text is:"+NoteTitle);
	  Assert.assertEquals(NoteTitle,"Appium Note" );
   }

   
   
}
