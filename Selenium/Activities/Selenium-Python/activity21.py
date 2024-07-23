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
    driver.get("https://v1.training-support.net/selenium/tab-opener")
    print("The Title of the page is :", driver.title)

    # Store the current window/tab handle
    original_window= driver.current_window_handle

    #Find the button to open a new tab and click it.
    driver.find_element(By.ID, "launcher").click()
    print( "1st button clicked")

    #wait for 2nd tab to be opened
    wait.until(expected_conditions.number_of_windows_to_be(2))
    #Print all the handles.
    print("All windows handle: ",driver.window_handles)

     #Switch to the newly opened tab, print it's title and heading.
    driver.switch_to.window(driver.window_handles[1])

    # Print the handle of the currently active tab/window
    print("Current Window handle is :", driver.current_window_handle)
    sleep(5)

    #get the title of new tab
    print("New tab Title is :", driver.title)
    # Print the new tab/window heading
    heading = driver.find_element(By.XPATH, "//div[@class='content']")
    print(heading.text)

    #open 3rd tab by clicking on button
    driver.find_element(By.ID,"actionButton").click()
    sleep(5)

     #wait for 3rd tab to be opened
    wait.until(expected_conditions.number_of_windows_to_be(3))
    #Print all the handles.
    print("All windows handle expected is 3 : ",driver.window_handles)
    #Switch to the newly opened tab, print it's title and heading.
    driver.switch_to.window(driver.window_handles[2])
    sleep(5)
    print("3rd tab title is: ", driver.title)
    sleep(5)

    #print the heading of 3rd tab
    headingMsg=driver.find_element(By.XPATH("//div[@class='content']"))
    print("3rd tab Heading msg is :", headingMsg.text)


    
    
