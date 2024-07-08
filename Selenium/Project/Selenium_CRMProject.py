# Import webdriver from selenium
from ast import Assert
import time

from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.support import expected_conditions
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from webdriver_manager.firefox import GeckoDriverManager
	
from selenium.webdriver.support.select import Select

# Set up the Firefox Driver with WebDriverManger
service = FirefoxService(GeckoDriverManager().install())
# Start the Driver
with webdriver.Firefox(service=service) as driver:
    # Navigate to the URL
    driver.get("http://alchemy.hguy.co/orangehrm")

    
#*************************** Print the title of the page***********
    print("Page title is: ", driver.title)

#****************************URL of Header Image ************
    imgUrl= driver.find_element(By.XPATH, "//div[@id='divLogo']/img" )
    print("Image URL Header is: ", imgUrl.get_attribute("src") )

#**************************LoginApp*****************

    wait = WebDriverWait(driver, 30)

    username =driver.find_element(By.ID, "txtUsername")
    username.send_keys("orange")
    password=driver.find_element(By.ID, "txtPassword")
    password.send_keys("orangepassword123")
    
    driver.find_element(By.ID,"btnLogin").click()
    
    dashboard_menu=wait.until(expected_conditions.presence_of_element_located((By.ID ,"menu_dashboard_index")))
    print("Login Successfully done")

    print(("Page Title after login: ", driver.title))
    print("-------------------Title done----------------------")
    time.sleep(10)

  #****************************ADD EMP*******************

    FirstName = "Josh1"
    lastName =  "Zen1"
	
    driver.find_element(By.ID,"menu_pim_viewPimModule").click()
    driver.find_element(By.ID,"menu_pim_viewPimModule").click()
    wait = WebDriverWait(driver, 30)
    wait.until(expected_conditions.presence_of_element_located((By.NAME,"btnAdd")))
	
    driver.find_element(By.NAME,"btnAdd").click()

    driver.find_element(By.ID,"firstName").send_keys(FirstName)
    driver.find_element(By.ID, "lastName").send_keys(lastName)
    driver.find_element(By.ID,"btnSave").click()
    time.sleep(10)

    empID = driver.find_element(By.ID, "personal_txtEmployeeId").get_attribute("value")
    print("Emp Id is :" ,empID)
    print("-----------------------Add Emp done------------------")
	
	#********************search emp*******************
    driver.find_element(By.ID,"menu_pim_viewPimModule").click()
    driver.find_element(By.ID ,"menu_pim_viewPimModule").click()
    driver.find_element(By.ID,"empsearch_id").send_keys(empID)
    driver.find_element(By.ID,"searchBtn").click()
    tbElement=driver.find_element(By.XPATH,"//tbody//tr//td[2]/a")
    tableValue=tbElement.text
    print("table value is :" , tableValue)
    assert tableValue == empID

    print("-----------------Search Emp done------------")
    time.sleep(10)

    #*************************Edit User Info**************

    driver.find_element(By.ID,"menu_pim_viewMyDetails").click()
    driver.find_element(By.ID,"menu_pim_viewMyDetails").click()
    driver.find_element(By.ID ,"btnSave").click()
    driver.find_element(By.ID,"personal_txtEmpFirstName").clear()
    driver.find_element(By.ID,"personal_txtEmpFirstName").send_keys("Rachel")
    driver.find_element(By.ID,"personal_txtEmpLastName").clear()
    driver.find_element(By.ID,"personal_txtEmpLastName").send_keys("Zane")
		
    genderElement= driver.find_element(By.ID,"personal_optGender_2")
    genderElement.click()
	
		
    NationalityDropDown = driver.find_element(By.ID,"personal_cmbNation")
    dropdown_object = Select(NationalityDropDown)
    # Get all options inside the select as a list
    options = dropdown_object.options
    dropdown_object.select_by_visible_text("German")	
		#dob
    driver.find_element(By.ID,"personal_DOB").clear()
    driver.find_element(By.ID,"personal_DOB").send_keys("2000-10-04")
		
		#save button
    driver.find_element(By.ID, "btnSave").click()
    time.sleep(10)

    print("--------------Edit User done-------------")

#***********************************Directory Menu********************
    directoryElement= driver.find_element(By.ID,"menu_directory_viewDirectory")
    flag =directoryElement.is_displayed
    print("Is Directory Menu Visible: " , flag)
    driver.find_element(By.ID,"menu_directory_viewDirectory").click()
    driver.find_element(By.ID,"menu_directory_viewDirectory").click()

    #Search Directory Header
    Header= driver.find_element(By.XPATH,"//div[@class='head']/h1")
    actualHeader =  Header.text
    expectHeader="Search Directory"
    print("Header Value is :", actualHeader)
    assert actualHeader == expectHeader

    print("---------------------Directory Menu done--------------------")
    time.sleep(10)

#************************************Add Qualification*************
    driver.find_element(By.ID,"menu_pim_viewMyDetails").click()
    driver.find_element(By.ID,"menu_pim_viewMyDetails").click()
		
	#Qualification nav menu
    driver.find_element(By.XPATH,"//ul[@id='sidenav']/li[9]").click()
    time.sleep(10)
		
	#WorkExp- Add button
    driver.find_element(By.ID,"addWorkExperience").click()
		
	#Enter Details
    driver.find_element(By.ID,"experience_employer").send_keys("Artistic")
    driver.find_element(By.ID,"experience_jobtitle").send_keys("Artist")
    driver.find_element(By.ID,"btnWorkExpSave").click()

    print("--------------------Add Qualification done----------------")

#******************************Apply Leave************************
    FromDate ="2024-07-05"
    ToDate ="2024-07-07"
    driver.find_element(By.ID,"menu_dashboard_index").click()
    driver.find_element(By.ID,"menu_dashboard_index").click()
    driver.find_element(By.XPATH,"//tbody/tr/td[4]").click()
    time.sleep(10)
		
	#dropdown select
    LeaveType =driver.find_element(By.ID,"applyleave_txtLeaveType")
    leaveobj =Select(LeaveType)
    options=leaveobj.options
    leaveobj.select_by_visible_text("DayOff")
	
    applyFromDate= driver.find_element(By.ID,"applyleave_txtFromDate")
    applyFromDate.clear()
    applyFromDate.send_keys(FromDate)
    applyToDate= driver.find_element(By.ID,"applyleave_txtToDate")
    applyToDate.clear()
    applyToDate.send_keys(ToDate)
		
	#applybutton
    driver.find_element(By.ID,"applyBtn").click()

    print("-----------------Leave Applied done-----------------")
		
#**************************My Leave List*******************
		
    driver.find_element(By.ID, "menu_leave_viewMyLeaveList").click()
    time.sleep(10)
    searchFromDate= driver.find_element(By.ID, "calFromDate")
    searchFromDate.clear()
    searchFromDate.send_keys(FromDate)
    searchToDate= driver.find_element(By.ID,"calToDate")
    searchToDate.clear()
    searchToDate.send_keys(ToDate)
     #searchbutton
    driver.find_element(By.ID,"btnSearch").click()
    time.sleep(10)

    print("------------------My Leave List done-----------------")
    
#*********************Emergency Contact******************
    
    driver.find_element(By.ID,"menu_pim_viewMyDetails").click()
    driver.find_element(By.ID,"menu_pim_viewMyDetails").click()
		
    #Emergency Contact side menu
    driver.find_element(By.XPATH,"//ul[@id='sidenav']/li[3]").click()
		
    rows=driver.find_elements(By.XPATH, "//table[@id='emgcontact_list']/tbody/tr")
    print("Row Size is :", len(rows))
	
    #print all the row values in console
    for row in rows:
      print("Row Values are :", row.text)
    print("--------------------Emergency contact done---------")
