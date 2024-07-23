
from time import sleep, time
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

    checkbox1 =driver.find_element(By.XPATH,"//input[@class='willDisappear']")
    print("Is CheckBox selected ? ", checkbox1.is_selected)

    sleep(10)
    
    driver.find_element(By.XPATH, "//input[@class='willDisappear']").click

    print("Is CheckBox selected after checkmark ? ", checkbox1.is_selected)