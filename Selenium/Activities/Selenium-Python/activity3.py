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
    
#*******************Activity-1 using xpath*******************
	#open the browser
    driver.get("https://v1.training-support.net")
	#Get the title of the page and print it to the console.
    print("Page title is :", driver.title)
	 
    #Find the "About Us" button on the page using it's id.
    driver.find_element(By.XPATH, "//a[@id='about-link']").click()
	#Get the title of the new page and print it to the console.
    print("New Page Title is :" , driver.title)
	 
#*******************Activity-2 using xpath*******************
	#open the browser
    driver.get("https://v1.training-support.net/selenium/login-form")
	 
	#Verify the page title
    print("Page Title is :", driver.title)
	 
    driver.find_element(By.XPATH,"//input[@id='username']").send_keys("admin")
	 
    driver.find_element(By.XPATH, "//input[@id='password']").send_keys("password")
	 
	#Print new page title
    print("New Page Title is :", driver.title)
	#find the "Log in" button using any locator and click it.
    driver.find_element(By.XPATH, "//button[@onclick='signIn()']").click()
	#Close the browser
    driver.close
	 