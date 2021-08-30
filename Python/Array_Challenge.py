'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
ArrayChallenge(arr) takes an array as input, and returns the string
"true" if the sum of every integer in the array but the largest number is
equal to the largest number in the array, or false if it is not.
'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''

def ArrayChallenge(arr):
    answer = "false"
    largestNum = 0
    result = 0

    for number in arr:
        if(number>largestNum):
            largestNum = number
            
    for number in arr:
        if(number!=largestNum):
            result+= number

    if(result == largestNum):
        answer = "true"

    else:
        answer = "false"

    return (answer)

arr = [5,7,16,1,2]
arr2 = [3,5,-1,8,12]
arr3 = [1,15,-1,5,20]

print(ArrayChallenge(arr))
print(ArrayChallenge(arr2))
print(ArrayChallenge(arr3))
