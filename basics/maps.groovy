def mapExample = ["Spain": "Madrid", "United Kingdom": "London", "Austria": "Vienna"]

//Multiple ways to get a value from a Map
assert mapExample.Spain == 'Madrid'
assert mapExample."Spain" == 'Madrid'
assert mapExample./United Kingdom/ == 'London'
assert mapExample['Spain'] == 'Madrid'

//containsKey
assert mapExample.containsKey("Spain")

//Class
assert mapExample instanceof java.util.LinkedHashMap

//GETTING KEYS
//Will print [Spain, United Kingdom, Austria]
println mapExample.keySet()

//GETTING MAPS
//Will print [Madrid, London, Vienna]
println mapExample.values()

//size
assert mapExample.size() == 3

//sort numeric or alphabetic
assert mapExample.sort() == [ "Austria": "Vienna", "Spain": "Madrid", "United Kingdom": "London"]

//We can set Values with variables, but not with Keys like you can see in the next example, unless you set the (Key) like this.
def randomCountry = "Germany"
def randomCity = "Berlin"
def randomCityMap = [(randomCountry): (randomCity), randomCountry: randomCity]
assert randomCityMap == [Germany: "Berlin", randomCountry: "Berlin"]

//Adding or deleting entries
def numbers = ["one": 1, "two": 2, "three": 3]
assert numbers.plus("four": 4) == ['one':1, 'two':2, 'three':3, 'four':4]
assert numbers.minus("one":1) == ['two':2, 'three':3]

//WORKING WITH CLOSURES
numbers.eachWithIndex{entry, i -> println "$i $entry.key: $entry.value"}
numbers.eachWithIndex{key, value, i -> println "$i $key: $value"}
//__ find
assert numbers.find{it.key == "one"}.value == 1
assert numbers.find{it.value == 2}.key == "two"
//__every
assert numbers.every{ it -> it.value instanceof Integer}
assert numbers.every{ it -> it.key instanceof String}
//__any
assert numbers.any{ it -> it.value instanceof Integer}

//GROUPING ENTRIES WITH A CONDITIONAL
assert numbers.groupBy{it.value % 2} == [0:['two':2], 1:['one':1, 'three':3]]
assert numbers.groupBy{it.value == 3} == [false:['one':1, 'two':2], true:['three':3]]