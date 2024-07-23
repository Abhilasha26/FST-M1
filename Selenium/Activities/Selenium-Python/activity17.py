from ast import Assert
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.support import expected_conditions
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from webdriver_manager.firefox import GeckoDriverManager
from selenium.webdriver.support.ui import Select

    #set up the firefox driver with webdrivermanager
service= FirefoxService(GeckoDriverManager().install())

    # Start the Driver
with webdriver.Firefox(service=service) as driver:
    wait = WebDriverWait(driver, 10)
    #navigate to URL
    driver.get("https://v1.training-support.net/selenium/selects")

    #Print Page Title
    print("Page Title is : ", driver.title)

    #Find the dropdown
    dropdownElement =driver.find_element(By.ID, "single-select")
	#Pass the WebElement to the Select object
    dropdown_obj= Select(dropdownElement)
		 
	#Select the second option using the visible text.
    
    dropdown_obj.select_by_visible_text("Option 2")
    print("Selected 2nd value from dropdown is:", dropdown_obj.first_selected_option.text)
		 
	#Select the third option using the index.
    dropdown_obj.select_by_index(3)
    print("Selected 3rd value from dropdown is:", dropdown_obj.first_selected_option.text)
		 
	#Select the fourth option using the value.
    dropdown_obj.select_by_value("4")
    print("Selected 4th value from dropdown is:", dropdown_obj.first_selected_option.text)
		 
	#Get all the options and print them to the console.
    print("List of dropdown values are : ")
    options=dropdown_obj.options
    for option in options:
        print("Dropdown value :", option.text)



