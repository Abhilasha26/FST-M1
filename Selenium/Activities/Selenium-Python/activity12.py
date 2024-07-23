from time import sleep, time
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
    #navigate to URL
    driver.get("https://v1.training-support.net/selenium/dynamic-controls")

    #Print Page Title
    print("Page Title is : ", driver.title)

    inputTxtField =driver.find_element(By.ID,"input-text")

    print("Is input field enabled ? ", inputTxtField.is_enabled())
  

    Enable_button=driver.find_element(By.ID, "toggleInput")
    Enable_button.click()

    print("Is input field enabled after enable button click ? ", inputTxtField.is_enabled())
