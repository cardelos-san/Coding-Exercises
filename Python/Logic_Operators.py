'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
Logic exercise
'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''

def experiment():
    if (1<2) and (3<4):
        print("Hello")

def experiment2(a,b):
    if(a<b) or (a>b):
        print("Hello again")

def experiment3():
    colors = ["Green", "Red", "Yellow"]
    color = "Blue"
    if color not in colors:
        print ("We ran out of blue!")
   
experiment()
experiment2(1,2)
experiment3()
