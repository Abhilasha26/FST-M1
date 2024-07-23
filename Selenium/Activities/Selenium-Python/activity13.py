
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
    driver.get("https://v1.training-support.net/selenium/tables")

        #Print Page Title
    print("Page Title is : ", driver.title)
        #Find the number of rows
    tableDataRows =driver.find_elements(By.XPATH, "//table[@class='ui celled striped table']/tbody/tr")
    print("No of rows in the table are :", len(tableDataRows))
            
        #find the number of columns
    tableDataCols =driver.find_elements(By.XPATH,"//table[@class='ui celled striped table']/tbody/tr[1]/td")
    print("No of rows in the table are :",len(tableDataCols))
            
        #Find and print all the cell values in the third row of the table.
    thridRowData=driver.find_elements(By.XPATH,"//table[@class='ui celled striped table']/tbody/tr[3]")
    print("Third Row values are :")
    for data in thridRowData:
        print(data.text)
            
        #Find and print the cell value at the second row second column.
    SecondCellData =driver.find_element(By.XPATH, "//table[@class='ui celled striped table']/tbody/tr[2]/td[2]")
    print("2nd Cell Value is :", SecondCellData.text)
      
