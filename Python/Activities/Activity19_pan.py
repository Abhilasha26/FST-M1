#Writing XLS file
import pandas as pd
from pandas import ExcelWriter

data={
    'FirstName':["Satvik", "Avinash", "Lahri"],
	'LastName':["Shah", "Kati", "Rath"],
	'Email':["satshah@example.com", "avinashK@example.com", "lahri.rath@example.com"],
	'PhoneNumber':["4537829158", "4892184058", "4528727830"]
}

dataframe=pd.DataFrame(data)
print(dataframe)

#write xls file

writer= ExcelWriter('Activity19.xlsx')
dataframe.to_excel(writer, 'Sheet1', index= False)
writer.close()

#Read xls file
dataframe=pd.read_excel('Activity19.xlsx', sheet_name="Sheet1")
print(dataframe["FirstName"][1]," ",dataframe["Email"][1])

print("Read data from xls")
print(dataframe)


