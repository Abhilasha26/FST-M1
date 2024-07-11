#Custom function to calculate sum

def calculate_Sum(num):
    sum=0
    for number in num:
        sum +=number
    return sum

numberList =[2, 4, 6, 8, 10]

result= calculate_Sum(numberList)

print ("The sum of list's number is : ",str(result) )

