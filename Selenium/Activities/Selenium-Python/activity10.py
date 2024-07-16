
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.support import expected_conditions
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from webdriver_manager.firefox import GeckoDriverManager

#Set up the Firefox Driver with WebDriverManger
service = FirefoxService(GeckoDriverManager().install())

# Start the Driver
with webdriver.Firefox(service=service) as driver:
    # Navigate to the URL
    driver.get("https://v1.training-support.net/selenium/dynamic-controls")
    # Print the title of the page
    print("Page title is: ", driver.title)

    checkbox1 =driver.find_element(By.XPATH,"//input[@class='willDisappear']").is_displayed()
    print("Is CheckBox enabled before click on  Remove button 1st time ? ", checkbox1)
    driver.find_element(By.XPATH,"//input[@class='willDisappear']").click()

    driver.find_element(By.ID,"toggleCheckbox").click()
    checkbox2 =driver.find_element(By.XPATH, "//input[@class='willDisappear']").is_displayed()
    print("Is CheckBox enabled before click on  After button 2nd time? ", checkbox2)

    driver.find_element(By.ID,"toggleCheckbox").click()
    checkbox3 =driver.find_element(By.XPATH, "//input[@class='willDisappear']").is_displayed()
    print("Is CheckBox enabled before click on  After button 3rd time? ", checkbox3)

    checkboxSelected =driver.find_element(By.XPATH, "//input[@class='willDisappear']").is_selected()
    print("Is checkbox selected ", checkboxSelected)


    driver.close
		 