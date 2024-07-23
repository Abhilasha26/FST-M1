
from ast import Assert
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.support import expected_conditions
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from webdriver_manager.firefox import GeckoDriverManager

    #set up the firefox driver with webdrivermanager
service= FirefoxService(GeckoDriverManager().install())


    # Start the Driver
with webdriver.Firefox(service=service) as driver:
    wait = WebDriverWait(driver, 10)
    #navigate to URL
    driver.get("https://v1.training-support.net/selenium/dynamic-attributes")

    #Print Page Title
    print("Page Title is : ", driver.title)
    
    #Enter Username password for signin
    driver.find_element(By.XPATH,"//input[contains(@class,\"-username\")]").send_keys("admin3")
    driver.find_element(By.XPATH,"//input[contains(@class,\"-password\")]").send_keys("password")
    driver.find_element(By.XPATH,"//label[text()='Confirm Password']/following-sibling::input").send_keys("password")
    driver.find_element(By.XPATH,"//input[@type='email']").send_keys("game@ssh")
    driver.find_element(By.XPATH, "//button[@onclick='signUp()']").click()
    print("Signed up successfully")
    wait.until(expected_conditions.visibility_of_element_located((By.ID, "action-confirmation")))
    #wait.until(expected_conditions.visibility_of_all_elements_located(By.ID,"action-confirmation"))
	
    #verify the confimation msg
    confimationMsg=driver.find_element(By.ID,"action-confirmation")
    Message=confimationMsg.text
    print("Confimation msg is :", Message)
    



