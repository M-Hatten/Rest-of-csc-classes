"""
What does this code do?
- take a series of numbers from the user, all single digit and seperated only by a comma
- put numbers into a dynamic array (list) and print the list on the screen
- finds minimum number
- finds average number
- print both on screen
"""

#Take user input
print("Enter single digit numbers separated by commas: ")
userInput = input()

#initialize array
numList = []


#pull ints from input and put them in an array
for x in userInput:
    if x != ',':
        num = int(x)
        numList.append(num)

#Print out list
print("Your numbers are: ", numList)

#Find minimum
smallest = numList[0]
for x in numList:
    if x < smallest:
        smallest = x

#print minimum
print ("Minimum number is: ", smallest)

#Find average
numOfnums = 0.0
total = 0.0
for x in numList:
    numOfnums += 1.0
    total += x
avgNum = total / numOfnums

print("Average is: ", avgNum)
