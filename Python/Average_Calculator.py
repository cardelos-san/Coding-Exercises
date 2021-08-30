'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
Calculates the average of 3 number
'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''

def average (num1, num2, num3):
    ave = (num1 + num2 + num3)/3
    return ave

# Main program
firstNumber = int(input ("Please enter first number: "))
secondNumber = int (input ("Please enter second number: "))
thirdNumber = int (input ("Please enter third number: "))
calculated_average = average(firstNumber, secondNumber, thirdNumber)
print ("The average is %.3f" %calculated_average)
