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

    dropdownSelect=driver.find_element(By.ID, "multi-select")
    multiSelect= Select(dropdownSelect)
	
    #Select the "JavaScript" option using the visible text.
    multiSelect.select_by_visible_text("Javascript")
    for options in multiSelect.all_selected_options:
        print("options selected are :", options.text)
    		
    #Select the 4th, 5th and 6th options using the index.
    for i in range(4,6):
        multiSelect.select_by_index(i)
    for options in multiSelect.all_selected_options:
        print("indexed options selected are :", options.text)
		
	#Select the "NodeJS" option using the value.
    multiSelect.select_by_value("node")
	
	#print all selected options
    print("******All selected options are*******")
    allOptions=multiSelect.all_selected_options
    for allSelectedOption in allOptions:
        print(allSelectedOption.text)

	#Deselect the 5th option using index.
    multiSelect.deselect_by_index(5)
		
    print("********Final List after Deselect******")
	#print all values after deselec
    finalSelectedOptions=multiSelect.all_selected_options

    
    for finalList in finalSelectedOptions:
       print(finalList.text)