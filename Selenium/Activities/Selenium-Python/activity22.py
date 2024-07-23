
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.support import expected_conditions
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from webdriver_manager.firefox import GeckoDriverManager
from selenium.webdriver.support.ui import Select
from time import sleep, time
from selenium.webdriver.common.action_chains import ActionChains

#set up the firefox driver with webdrivermanager
service=FirefoxService(GeckoDriverManager().install())

 # Start the Driver
with webdriver.Firefox(service=service) as driver:
    wait=WebDriverWait(driver,10)
    
    #launch the URL and print page title in console
    driver.get("https://v1.training-support.net/selenium/popups")
    print("The Title of the page is :", driver.title)

    #Find the Sign in button 
    button = driver.find_element(By.CLASS_NAME,"orange")
		 
	#move the cursor on top of button
    ActionChains(driver).move_to_element(button).perform()
	#print tooltip msg
    tooltipMsg = button.get_attribute("data-tooltip")
    print("TooltipMsg is :", tooltipMsg)
	        
    #Click the button and wait for the modal to appear
    button.click()   

	#enter user id and password
    driver.find_element(By.ID,"username").send_keys("admin")
    driver.find_element(By.ID,"password").send_keys("password")
    driver.find_element(By.XPATH, "//button[@onclick='signIn()']").click()
	    
    sleep(5000)
    confirmationMsg = driver.find_element(By.ID,"action-confirmation").text
    print("Confirmation Msg is :", confirmationMsg)