import pandas

#read csv
dataframe=pandas.read_csv('employees.csv')
print(dataframe)

#write CSV

data={
    "Vehicle Type": ["Car","Car", "Bike"],
    "Manufacturer":["Maruti","Toyota","Harley"],
    "Model":["city","corolla","QWE"]
}

DataFrame =pandas.DataFrame(data)

DataFrame.to_csv("employees.csv")