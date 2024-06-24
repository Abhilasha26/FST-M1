
# Take User Name as Input
user1= input("Please enter User1 name :")
user2= input("Please enter User2 name :")

# Take answer from user 
user1_answer1= input(user1 +" please choose your answer either rock ,paper or scissors ? ").lower()
user2_answer2 =input(user2 +" please choose your answer either rock ,paper or scissors  ? ").lower()

# Print User's Answer
print(user1 + "answer1 is :"+user1_answer1)
print(user2 + "answer2 is :"+user2_answer2)

# To check who wins
if user1_answer1==user2_answer2:
    print("its a tie")
elif user1_answer1== "rock":
    if user2_answer2=="scissors":
        print("Rock Wins!!!!!!")
    else:
        print("Paper Wins!!!!!")
elif user1_answer1=="scissors":
    if user2_answer2=="paper":
        print("Scissors Wins!!!!!")
    else:
        print("Rock Wins")
elif user1_answer1=="paper":
    if user2_answer2=="rock":
        print("Paper Wins!!!!!")
    else:
        print("Scissors Wins!!!!!")
else:
    print("Invalid Input !! Please try Again")
