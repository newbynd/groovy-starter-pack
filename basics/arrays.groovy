//If we want arrays of one type, we have to declarate it
Integer[] arrayOfNumbers = [20, 40, 60]
assert arrayOfNumbers.class == Integer[]
assert arrayOfNumbers.size() == 3

//ACCESSING ELEMENTS
assert arrayOfNumbers[1] == 40
assert arrayOfNumbers[-1] == 60
assert arrayOfNumbers.getAt(0) == 20
//__ get a range
assert arrayOfNumbers.getAt(0..1) == [20, 40]

//MODIFYNG ELEMENTS
arrayOfNumbers[1] = 41
assert arrayOfNumbers[1] == 41

//ADDING ELEMENTS
arrayOfNumbers + 400
assert arrayOfNumbers.size() == 4

//DELETING ELEMENTS
arrayOfNumbers + arrayOfNumbers[-1]
assert arrayOfNumbers.size() == 3

//SUM OF ALL NUMBERS
assert arrayOfNumbers.sum() == 121

//OTHER TYPES
def buyList = ['Oranges', 'Water'] as String[]
assert buyList instanceof String[]

//SUM OF ALL STRINGS
assert buyList.sum() == 'OrangesWater'