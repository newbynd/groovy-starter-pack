def listOfNumbers = [24, 900]
assert listOfNumbers.size() == 2
assert listOfNumbers instanceof java.util.List
assert listOfNumbers instanceof java.util.ArrayList

//LISTS ARE HETEROGENEOUS
def heterogeneousList = [1, "a", true]
assert heterogeneousList.size() == 3
assert listOfNumbers instanceof java.util.List
assert heterogeneousList instanceof java.util.ArrayList

//WE CAN SPECIFY THE EXACT TYPE OF A LIST
LinkedList linkedListOfNumbers = [25, 901]
assert linkedListOfNumbers instanceof java.util.List
assert linkedListOfNumbers instanceof java.util.LinkedList

//ACCESSING ELEMENTS
def listOfNumbers2 = [24, 900, 42, 50000]
assert listOfNumbers2[0] == 24
assert listOfNumbers2[-1] == 50000
assert listOfNumbers2.getAt(0) == 24
assert listOfNumbers2.getAt(0..1) == [24, 900]

//MODIFYING ELEMENTS
listOfNumbers2[0] = 24000
assert listOfNumbers2[0] == 24000

//ADDING ELEMENTS
listOfNumbers2 << 29
assert listOfNumbers2.size() == 5

//LISTS CAN CONTAIN ANOTHER LISTS
def listOfLists = [["hi, i'm a list", 3], ["me too", true]]
assert listOfLists[0][0] == "hi, i'm a list"
assert listOfLists[1][0] == "me too"
assert listOfLists[1][1] == true

//REVERSE LISTS
def listToReverse = [1, 2, 3]
assert listToReverse.reverse() == [3, 2, 1]

//FINDALL
assert listToReverse.findAll { it == 1 } == [1]


