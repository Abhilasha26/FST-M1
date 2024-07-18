package project;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class GoogleTask {
AndroidDriver driver;
	
	@BeforeClass
	public void setup() throws MalformedURLException {
		UiAutomator2Options options = new UiAutomator2Options();
		options.setPlatformName("android");
		options.setAutomationName("UiAutomator2");
		options.setAppPackage("com.google.android.apps.tasks");
		options.setAppActivity(".ui.TaskListsActivity");
		options.noReset();
		
		URL serverUrl = new URL("http://localhost:4723/");
		
		driver = new AndroidDriver(serverUrl, options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	} 

	@Test
	public void createTask()
	{
		//task1
		driver.findElement(AppiumBy.accessibilityId("Create new task")).click();
		driver.findElement(AppiumBy.id("add_task_title")).sendKeys("Complete Activity with Google Tasks");
		driver.findElement(AppiumBy.id("add_task_done")).click();
		
		//task2
		driver.findElement(AppiumBy.accessibilityId("Create new task")).click();
		driver.findElement(AppiumBy.id("add_task_title")).sendKeys("Complete Activity with Google Keep");
		driver.findElement(AppiumBy.id("add_task_done")).click();
		
	  //task3
		driver.findElement(AppiumBy.accessibilityId("Create new task")).click();
		driver.findElement(AppiumBy.id("add_task_title")).sendKeys("Complete the second Activity Google Keep");
		driver.findElement(AppiumBy.id("add_task_done")).click();
		
		driver.findElement(AppiumBy.accessibilityId("My Tasks")).click();
		
		List<WebElement>taskItems=driver.findElements(AppiumBy.id("task_name"));
		System.out.println("Tasklist count is :"+taskItems.size());
		
		for(WebElement taskItem : taskItems)	
		{
			System.out.println("Task is :");
			System.out.println(taskItem.getText());
		}
		Assert.assertEquals(taskItems.get(2).getText(),"Complete Activity with Google Tasks");
		Assert.assertEquals(taskItems.get(1).getText(),"Complete Activity with Google Keep");
		Assert.assertEquals(taskItems.get(0).getText(),"Complete the second Activity Google Keep");
}
	}


