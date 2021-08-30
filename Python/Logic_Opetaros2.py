'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
Logic exercise #2
'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''

#Only ifs
def smallerl (a,b,c):
    smaller = a;
    if (b < smaller):
        smaller = b
    if (c < smaller):
        smaller = c

    return smaller

#If else and if
def smaller2(a,b,c):
    if(a<b):
        smaller = a
    else:smaller = b
    if(c<smaller):
        smaller=c

    return smaller

#Nested if else
def smaller3(a,b,c):
    if(a<b):
        if(a<c):
            smaller = a
        else:smaller = c
    else: #a >=b
        if(b<c):
            smaller = b
        else:smaller = c

    return smaller

#Nested if else and elif
def smaller4(a,b,c):
    if(a<b):
        if(a<c):
            smaller = a
        else:smaller = c

    elif(b<c):
        smaller = b
    else:smaller = c

    return smaller

#All elifs using and
def smaller5(a,b,c):
    if(a<b)and(b<c):
        smaller=a
    elif(b<a)and(b<c):
        smaller=b
    elif(c<a)and(c<b):
        smaller=c

    return smaller

#main program -- testing all methods
print ("Calling smallerl:", smallerl(1,2,3))
print ("Calling smallerl:", smallerl(2,1,3))
print ("Calling smallerl:", smallerl(3,2,1)) 
print ("Calling smaller2:", smallerl(1,2,3))
print ("Calling smaller2:", smallerl(2,1,3))
print ("Calling smaller2:", smallerl(3,2,1)) 
print ("Calling smaller3:", smaller3(1,2,3))
print ("Calling smaller3:", smaller3(2,1,3))
print ("Calling smaller4:", smaller4(1,2,3))
print ("Calling smaller4:", smaller4(2,1,3))
print ("Calling smaller5:", smaller5(1,2,3))
print ("Calling smaller5:", smaller5(2,1,3))

