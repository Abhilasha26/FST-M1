#check 1st and last number is same in list

listnumbers= list(input("Please enter numbers for List with comma separators :").split("," ))
print("user entered list is :")
print(listnumbers)
list_length= int(len(listnumbers))
print("Length of the list is :")
print(list_length)

if listnumbers[0]==listnumbers[list_length-1]:
    print("first and last value matched")
else:
    print("values are not same")
    raise SystemExit