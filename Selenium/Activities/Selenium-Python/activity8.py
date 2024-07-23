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
    
    #launch the URL and print page title in console
    driver.get("https://v1.training-support.net/selenium/dynamic-controls")
    print("The Title of the page is :", driver.title)

    #click on Remove Checkbox button
    driver.find_element(By.ID, "toggleCheckbox").click()
		
    #get the handle of checkbox field and check wheather field is visible or not
    checkboxfield=driver.find_element(By.ID,"dynamicCheckbox")
    wait.until(expected_conditions.invisibility_of_element(checkboxfield))
    print("Is checkbox field displayed? :", checkboxfield.is_displayed())
		
	#click the Add checkbox button
    driver.find_element(By.ID, "toggleCheckbox").click()
		
	#wait for checkboxfield to be visible
    wait.until(expected_conditions.visibility_of(checkboxfield))
    print("Is checkbox field displayed after Addcheckbox ? :", checkboxfield.is_displayed())