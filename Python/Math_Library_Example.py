'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
math library exercise
'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''

import math
num = float (input("Enter a floating point number, either positive or negative"))
print ("The absolute value of", num, "is", abs(num))
print ("The integer portion of", num, "is", int(num))
print (num, "rounded to the next number is", round(num))
print ("The floor of", num, "is", math.floor(num))
print ("The ceil of", num, "is", math.ceil(num))
print (num, "to the 3rd power is", pow(num,3))
