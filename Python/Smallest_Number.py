'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
Finds the smallest number between 3 numbers
'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''

def getSmaller(num1,num2):
    if num1 < num2:
        smaller = num1
    else:
        smaller = num2
    return smaller

#Main Program
userInput1 = int(input("Enter a number: "))
userInput2 = int (input("Enter a second number: "))
userInput3 = int (input("Enter a third number: "))

smallerNumber = getSmaller(userInput1, userInput2)
smallerNumber = getSmaller(userInput3,smallerNumber)
print ("The smaller of the three numbers is", smallerNumber)
                 

    
