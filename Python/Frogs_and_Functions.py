'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
First part of this exercise draws frogs as output
Second part determines the largest number out of 4 input integers
'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''

#Functions

def frog():
    print ("         @..@")
    print ("        (----)")
    print ("       ( >__< )")
    print ("       ^^ ~~ ^^")
    
#Main program

print ("One frog...")
frog()
print ("Two frog...")
frog()
print ("Three frog...")
frog()
print ("Four...")
frog()

# the four numbers, returns and prints the largest number

def getLarger(num1, num2):
    if(num1 > num2):
        return num1
    else:
        return num2

firstNumber = int(input("Enter a number: "))
secondNumber = int(input("Enter a second number: "))
thirdNumber = int(input("Enter a third number: "))
fourthNumber = int(input("Enter a fourth number: "))
largestNumber = getLarger(firstNumber,secondNumber)
largestNumber = getLarger(largestNumber,thirdNumber)
largestNumber = getLarger(largestNumber,fourthNumber)
print("The largest number is", largestNumber)
