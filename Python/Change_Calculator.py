'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
Calculates change from a given amount of cents
'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''

cents = int (input("Please enter the the number of cents: ")) ## example input: 63
pennies = cents         ## pennies = 63
quarters = pennies//25  ## quarters = 2
pennies = pennies%25    ## pennies = 13
dimes = pennies//10     ## dimes = 1
pennies = pennies%10    ## pennies = 3
nickels = pennies//5    ## nickels = 0
pennies = pennies%5     ## pennies = 3
print ("The change of", cents, "is: ")
print (quarters, "quarter(s)")
print (dimes, "dime(s)")
print (nickels, "nickel(s)")
print (pennies, "pennie(s)")
