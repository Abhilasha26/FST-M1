fruit_dict={
    "apple": 120,
    "banana": 200,
    "grapes": 400,
    "pineapple":100
}

fruit_check= input("Please enter fruit name to check the availability : ").lower()

if(fruit_check in fruit_dict):
    print("Fruit is available in shop")
else:
    print("Fruit is not available")