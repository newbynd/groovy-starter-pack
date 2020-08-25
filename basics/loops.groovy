def arrayListExample = ["a", "b", "c"]

// WHILE loop
def counter = 0
while (counter < arrayListExample.size()){
    println arrayListExample[counter]
    counter ++
}

// Classic Java for
for (int i; i < arrayListExample.size(); i++) { 
   println arrayListExample[i]
}

// For 'in' o ':'
for (String value : arrayListExample){
    println value
}

for (String value in arrayListExample){
    println value
}

// We can use loops with maps using the properties '.key' and '.value'
def mapExample = [one: "1", two: "2"]
for ( item in mapExample ) {
    println "Word $item.key equals to number $item.value"
}

// Enumerate
for (int i in 1..5) {
    println(i);
}

// each loop
arrayListExample.each(){ it -> println it}
//  you can also use this form
arrayListExample.each { it -> println it}

// eachWithIndex . The first parameter of the closure is the value, and the second is the index
arrayListExample.eachWithIndex { letterValue, letterIndex ->
    println "Index ${letterIndex} equals letter ${letterValue}"
}

// each loop countdown
(5..1).each {
    println "$it seconds"
    sleep(1000)
}
println "time!"

// times loop
5.times { num  ->
   println "Test " + num
}

// step loop -> this will print every number with a step of 2, from 0 until 80 (not included): 0, 2, 4 ...74, 76, 78
//  Useful to print pair numbers, for example
0.step 80, 2, {
   print it + " "
}
//this one will start with 1, so it will print only odd numbers: 1, 3, 5 ... 75, 77, 79
1.step 80, 2, {
   print it + " "
}