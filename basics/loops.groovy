def arrayListExample = ["a", "b", "c"]

//Classic Java for
for (int i; i < arrayListExample.size(); i++) { 
   println arrayListExample[i]
}

//For 'in' o ':'
for (String value : arrayListExample){
    println value
}

for (String value in arrayListExample){
    println value
}

//Enumerate
for (int i in 1..5) {
    println(i);
}

//each loop
arrayListExample.each(){ it -> println it}
//you can also use this form
arrayListExample.each { it -> println it}

//eachWithIndex . The first parameter of the closure is the value, and the second is the index
arrayListExample.eachWithIndex { letterValue, letterIndex ->
    println "Index ${letterIndex} equals letter ${letterValue}"
}

//each loop countdown
(5..1).each {
    println "$it seconds"
    sleep(1000)
}
println "time!"

//WHILE loop
def counter = 0
while (counter < arrayListExample.size()){
    println arrayListExample[counter]
    counter ++
}