#Activity10-Tuple Number Checker
#take user input in list 

userinputdata= list(input("Please enter numbers for List with comma separators :").split("," ))
print("User entered number in list :")
print(userinputdata)
print("Type of userinputdata before convert:")
print(type(userinputdata)) #print the type of userinputdata as list or tuple

#covert the list into tuple
userinputdata=tuple(userinputdata)

print("Type of userinputdata now:" )
print(type(userinputdata)) # print the type of userinputdata as list or tuple

# to check if num in tuple is divided by 5 or not
for num in userinputdata :
    if(int(num)%5==0):
        print(int(num), "is divisble by 5")