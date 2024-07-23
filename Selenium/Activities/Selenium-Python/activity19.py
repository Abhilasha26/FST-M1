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

    #************************Accept the alert**************************

    #Find the button to open a CONFIRM alert and click it.
    driver.find_element(By.ID, "confirm").click()

    #wait untill alert is present 
    #wait.until(expected_conditions.alert_is_present())

    #Switch focus from main window to alert box
    confirm_alert= driver.switch_to.alert
    alertText=confirm_alert.text

    #print the text of alert 
    print("Text Alert",alertText )
    sleep(5)
 
    #accept the alert
    confirm_alert.accept()

    #************************Cancel the Alert******************
    driver.find_element(By.ID, "confirm").click()

    #wait.until(expected_conditions.alert_is_present)
    confirm_alert= driver.switch_to.alert
    alertText=confirm_alert.text
    print("Text Alert",alertText )
    sleep(5)
    confirm_alert.dismiss()