'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
MPG Calculator exercise
'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''

print ("Jake has a car with a tank size of 8 gallons, "
       +"and after travelling 60 miles, he has 6 gallons left.\n"
       +"Based on this information, how many males can Jake travel "
       +"on a full tank?")
tankSize = 8
milesTravelled = 60
gallonsLeft = 6
gallonsUsed = tankSize - gallonsLeft
mpg = milesTravelled/gallonsUsed
milesFullTank = mpg*tankSize
print ("Jake can travel", milesFullTank, "on a full tank")
