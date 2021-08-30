'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
Converts inches to centimeters
'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''

def inchesToCm(inch):
    convert = 2.2*inch
    return convert

#Main Prgram

inches = float(input("Please enter inches: "))
equation = inchesToCm(inches)
print (inches, "inches to centimeters is %.3f" %equation)
