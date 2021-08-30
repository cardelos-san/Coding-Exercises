'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
Generates a random number, and user tries to guess
'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''

#Functions and definitions

import random


def guess(userNumber, generate):
    if(userNumber < generate):
        print("Sorry you lose")
        print("The number was", generate)
    elif(userNumber > generate):
         print("Sorry you lose")
         print("The number was", generate)
    elif(userNumber == generate):
         print("You've won!, you guessed the number", generate)
    return userNumber    



#Main Program
print("Now is your chance to win the lottery!")
userNumber = int(input("Please enter a number from 1 to 10: "))

##Added walrus operator

while ((generate := random.randint(1,10)) != userNumber):
    guess(userNumber, generate)
    userNumber = int(input("Please enter a number from 1 to 10: "))
 
print("You've won!, you guessed the number", generate)


    
    
    
