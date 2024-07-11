#read xls file
import pandas as pd
from pandas import read_excel

dataframe=pd.read_excel('Activity19.xlsx')

print(dataframe)

#---print no of rows and columns
print("no of rows and columns in xls file are :", dataframe.shape)

#---print data in email column
print("Email column data values:")
print(dataframe["Email"])

#---Sorting the data based on Firstname in assending order
print("First Name column in Assending order:")
print(dataframe.sort_values('FirstName'))