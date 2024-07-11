import pandas as pd

data={
    "Usernames":["admin","Charles","Deku"],
    "Password" :["password","Charl13","AllMight"]
}

dataframes=pd.DataFrame(data)
print(dataframes)

#for writing CSV
dataframes.to_csv("credential.csv", index=False)