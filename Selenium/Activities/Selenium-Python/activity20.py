from ast import Assert
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.support import expected_conditions
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from webdriver_manager.firefox import GeckoDriverManager
from selenium.webdriver.support.ui import Select
from time import sleep, time
#set up the firefox driver with webdrivermanager
service=FirefoxService(GeckoDriverManager().install())

 # Start the Driver
with webdriver.Firefox(service=service) as driver:
    wait=WebDriverWait(driver,10)
    
    #launch the URL and print page title in console
    driver.get("https://v1.training-support.net/selenium/javascript-alerts")
    print("The Title of the page is :", driver.title)

    #Find the button to open a PROMPT alert and click it.
    driver.find_element(By.ID, "prompt").click()

    #Switch the focus from the main window to the Alert box and get the text in it and print it.
    alertwindow=driver.switch_to.alert
    print("ALert text is : ", alertwindow.text)

    alertwindow.send_keys("Awesome!!")
    sleep(5)
    alertwindow.accept()
