#Find the sum of 0 to 10 number using recursion.
def sum(n):
    if n<=1:
        return n
    else:
        return n+sum(n-1)   
print("The sum of 0 to 10 number is :",sum(10))
