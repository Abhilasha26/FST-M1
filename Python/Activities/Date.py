from datetime import datetime

x= datetime.now()
print(x)

print("year is : ", x.year)
print("Day is :" ,x.strftime("%a"))
print("Weekday as Number:",x.strftime("%w"))
print("Day of the month:",x.strftime("%d"))
print("Month is :",x.strftime("%m"))
print("Month Name :",x.strftime("%B"))
print("Time in Seconds :",x.strftime("%S"))
print("local version of date and time :",x.strftime("%c"))
print("local version of date  :",x.strftime("%x"))