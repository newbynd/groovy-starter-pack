//If we want arrays of one type, we have to declarate it
Integer[] arrayOfNumbers = [20, 40, 60]
assert arrayOfNumbers.class == Integer[]
assert arrayOfNumbers.size() == 3

//ACCESSING ELEMENTS
assert arrayOfNumbers[1] == 40
assert arrayOfNumbers[-1] == 60

//MODIFYNG ELEMENTS
arrayOfNumbers[1] = 41
assert arrayOfNumbers[1] == 41

//SUM OF ALL NUMBERS
assert arrayOfNumbers.sum() == 121

//OTHER TYPES
def buyList = ['Oranges', 'Water'] as String[]
assert buyList instanceof String[]

//SUM OF ALL STRINGS
assert buyList.sum() == 'OrangesWater'