from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.support import expected_conditions
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from webdriver_manager.firefox import GeckoDriverManager
from time import sleep, time


#et up the firefox driver with webdrivermanager
service=FirefoxService(GeckoDriverManager().install())

 # Start the Driver
with webdriver.Firefox(service=service) as driver:
    wait=WebDriverWait(driver,10)

    driver.get("https://v1.training-support.net/selenium/target-practice")
    print("The Title of the Page is : ", driver.title)
	 
	#Find the 3rd header on the page and print it's text to the console.
    tDElementText= driver.find_element(By.XPATH, "//h3[@id='third-header']").text
    print("The text of Third Elemnet is :",tDElementText)
	
	#Find the 5th header on the page and print it's color.
    fTElementcolor= driver.find_element(By.XPATH, "//h5[@class='ui green header']")
    print("Fifth heading colour is: ", fTElementcolor.value_of_css_property("color"))

	
	#Find the violet button and print all it's classes.
    violetbuttonclass=driver.find_element(By.XPATH,"//button[text()='Violet']").text
    print("The Violet Button class is :", violetbuttonclass)
	
	#Find the grey button and print it's text.
	
    GreytbuttonText=driver.find_element(By.XPATH, "//button[text()='Grey']").text
    print("The text of Grey button is  :", GreytbuttonText)
    driver.close