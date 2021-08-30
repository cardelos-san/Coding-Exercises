'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
Loops exercise
Draws different shapes using For Loops
'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''


#Right Triangle
for line in range (1,11):
    for space_count in range (10-line):
        print(" ", end="")
    for o_count in range (line):
        print ("0", end="")
    print()

#Tree
for line in range (1,11):
    for space_count in range (10-line):
        print(" ", end="")
    for o_count in range (2*line-1):
        print("O", end="")
    print()

#Diamond
num_space=9
num_o_count=1
for line in range (10):
    for space_count in range (num_space):
        print(" ", end="")
    for o_count in range (num_o_count):
        print("O", end="")
    print()
    num_space=num_space-1
    num_o_count=num_o_count+2
num_space=0
num_o_count=19
for line in range (10):
    for space_count in range (num_space):
        print(" ", end="")
    for o_count in range (num_o_count):
        print("O", end="")
    print()
    num_space=num_space+1
    num_o_count=num_o_count-2

