# create a list of user entered numbers

listnumbers= list(input("Please enter numbers for List with comma separators :").split("," ))
print("User entered List is: ")
print((listnumbers))
sum=0
for number in listnumbers:
    sum+= int(number)
    print(sum)
 

