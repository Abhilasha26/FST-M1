import pandas as pd

dataframe = pd.read_csv("credential.csv")

print("full data of CSV:")
print(dataframe)

print("Data from Username column is :")
print(dataframe['Usernames'])

print("Second row data is :")
print("Username : ", dataframe["Usernames"][1] ,"|", "Password: ", dataframe["Password"][1])

print("Username column in assending order")
print(dataframe.sort_values('Usernames'))

print("Password Column in decending order")
print(dataframe.sort_values("Password",ascending=False))

