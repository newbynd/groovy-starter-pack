// Documentation: https://groovy-lang.org/closures.html

// A closure in Groovy is an open, anonymous, block of code that can take arguments,
// return a value and be assigned to a variable.
// This is a basic closure. As you can see, you can call the closure as a function.
def closure = { true == true }
assert closure() == true
assert closure.call() == true

// You also can use arguments inside the closure, using the form ->
def twoArgumentClosure = { int num1, int num2 -> num1+num2 }
assert twoArgumentClosure(1,2) == 3

// You can set one, both or all the arguments without explicit declaration
def twoArgumentClosure2 = { num1, int num2 -> num1+num2 }
assert twoArgumentClosure2(1,2) == 3

// A closure accepts implicits parameters named 'it'.
def implicitParameter = { "Groovy $it!" }
assert implicitParameter('Rocks') == "Groovy Rocks!"

// You can use args to accept any amount of parameters in the closure.
def summation = { int... args -> args.sum() }           
assert summation(12, 4) == 16

// Can use a similar expression, with '[]' instead of '...'
def summation2 = { int[] args -> args.sum() }           
assert summation2(12, 4, 1) == 17


// In GStrings, if you set a closure inside, it wont update the value if you do that:
def num = 20
def a = "${num}"
assert a == 20
num = 40
assert a != 40

// It isn't a real closure, because the value is the same over time. You can use { -> param} instead
// and you would be able to modify the GString during the state of your program.
def num = 20
def a = "${->num}"
assert a == 20
num = 40
assert a == 40
