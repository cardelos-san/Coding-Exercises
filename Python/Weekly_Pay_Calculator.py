'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
Weekly Pay Calculator exercise
'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''

hourlyWage = float (input ("Please enter your hourly wage: "))
totalRegularHours = int (input ("Now enter regular hours number: "))
totalOvertimeHours = int (input ("And lastly, please enter overtime hours: "))
overTimePay = totalOvertimeHours*hourlyWage*1.5
totalWeeklyPay = totalRegularHours*hourlyWage+overTimePay
print ("Your weekly pay is $"+ str (totalWeeklyPay))
