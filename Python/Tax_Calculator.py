'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
Tax Calculator Exercise
'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''


print ("Net pay calculator")
hours = float (input ("Enter the hours: "))
rate = float (input ("Enter the rate: "))
grossPay = hours*rate
federalTax = 20/100 * grossPay
stateTax = 5/100 * grossPay
sSTax = 6.2/100 * grossPay
netPay = grossPay - federalTax - stateTax - sSTax
print ("Your gross pay is %.2f" % grossPay)
print ("Your federal tax deduction is %.2f" % federalTax)
print ("Your state tax deduction %.2f" % stateTax)
print ("your social security tax deduction %.2f" % sSTax)
print ("Your net pay is %.2f" % netPay)

