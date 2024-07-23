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
    sortableDataRow=driver.find_elements(By.XPATH,"//table[@id='sortableTable']/tbody/tr")
    print("No of rows in Table:",len(sortableDataRow))
		
	#Find the number of columns
    sortableDataCol=driver.find_elements(By.XPATH,"//table[@id='sortableTable']/tbody/tr[1]/td")
    print("No of rows in Table:", len(sortableDataCol))
		
	#Find and print the cell value at the second row second column.
    secondcellData=driver.find_element(By.XPATH, "//table[@id='sortableTable']/tbody/tr[2]/td[2]")
    print("2nd cell value before Sorting:", secondcellData.text)	
		
	#Click the header of the first column to sort by name.
    driver.find_element(By.XPATH, "//table[@id='sortableTable']/thead/tr/th").click()
    secondcellData2=driver.find_element(By.XPATH, "//table[@id='sortableTable']/tbody/tr[2]/td[2]")
    print("2nd cell value After Sorting:", secondcellData2.text)
		
	#Print the cell values of the table footer.
    footerValues=driver.find_elements(By.XPATH, "//table[@id='sortableTable']/tfoot/tr")
    print("FooterValues are :")
    for footervalue in footerValues:
        print(footervalue.text)
		