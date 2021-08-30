'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
Part 1: Iterates through a list and counts repeated values
Part 2: Demonstrates the use of various array methods
'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''

#Part 1

ballot = ["y", "y", "n", "y", "n", "y", "y", "n", "y",
          "n", "y", "n", "n", "y","n", "y", "y"]
numY = ballot.count ("y")
numN = ballot.count ("n")

print ("Number of YES votes:", numY)
print ("Number of NO votes:", numN)

if numY > numN:
    print ("The ballot was approved.")
else:
    print ("The ballot was not approved.")

print (ballot.index("y"))
print (ballot.index("n"))

#Part 2

list1 = ["Mary Smith", 132, "Jean Jones", 156, "Karent Karter", 167]
print("LIST", list1)
name = input("Name to add to the list: ")
average = int(input("Average: "))
list1.append(name)
list1.append(average)
print("UPDATED LIST", list1)
print("There are now", len(list1),"in the list")
updateName = input("Whose average needs updating? ")
updateAvg =  int(input("What is the new averege number?"))

list1.pop(list1.index(updateName) + 1)
list1.insert(list1.index(updateName) + 1, updateAvg)

print("UPDATED LIST", list1)


        
