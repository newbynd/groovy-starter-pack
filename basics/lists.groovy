//DOCS
//Groovy: https://groovy-lang.org/syntax.html
//LinkedList: https://docs.oracle.com/javase/7/docs/api/java/util/LinkedList.html
//ArrayList: https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html

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
def listOfNumbers2 = [24, 900, 42, 50000, 50000]
assert listOfNumbers2[0] == 24
assert listOfNumbers2[-1] == 50000
assert listOfNumbers2.getAt(0) == 24
//__ get a range
assert listOfNumbers2.getAt(0..1) == [24, 900]
//__ get all unique data
assert listOfNumbers2.unique() == [24, 900, 42, 50000]

//MODIFYING ELEMENTS
listOfNumbers2[0] = 24000
assert listOfNumbers2[0] == 24000
listOfNumbers2.putAt(0, 1)
assert listOfNumbers2[0] == 1
//ADDING ELEMENTS
//__ add element at the end of the list
listOfNumbers2 << 29
assert listOfNumbers2.size() == 5
//__ add element at the start of the list
listOfNumbers2.push(400)
assert listOfNumbers2.size() == 6

//DELETING ELEMENTS
//__ delete an element at the start of the list
listOfNumbers2.pop()
assert listOfNumbers2.size() == 5


//LISTS CAN CONTAIN ANOTHER LISTS
def listOfLists = [["hi, i'm a list", 3], ["me too", true]]
assert listOfLists[0][0] == "hi, i'm a list"
assert listOfLists[1][0] == "me too"
assert listOfLists[1][1] == true
//FLATTEN TO CONVERT 2 DIMENSIONAL ARRAY IN ONE DIMENSIONAL ARRAY
assert listOfLists.flatten() == ['hi, i\'m a list', 3, 'me too', true]

//REVERSE LISTS
def listToReverse = [1, 2, 3]
assert listToReverse.reverse() == [3, 2, 1]

//FINDALL
assert listToReverse.findAll { it == 1 } == [1]


