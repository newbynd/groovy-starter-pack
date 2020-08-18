//BASIC STRINGS
def string = 'This is a string'
def string2 = "This is a string"
String string3 = "This is a string"

assert string instanceof String
assert string2 instanceof String
assert string3 instanceof String

def groovyString = "$string, now this is a GString"  //When we use $, we are interpolating a string
assert groovyString instanceof GString

//CONCAT STRINGS
def concatString = string + string2
assert concatString == "This is a stringThis is a string" && 'This is a stringThis is a string'

/*
To escape characters

\b -> backspace
\f -> formfeed
\n -> newline
\r -> carriage return
\s -> single space
\t -> tabulation
\\ -> backslash
\' -> single quote  'To avoid this quote \' we need a backslash' 
\" -> double quote
*/


//MULTILINE
def multiLineString ='''line one
line two
line three'''
assert multiLineString == "line one\nline two\nline three"

def multiLineStringWithNewLines ='''
line one
line two
line three
'''
assert multiLineStringWithNewLines == "\nline one\nline two\nline three\n"

def multiLineStringWithoutNewLines ='''\
line one
line two
line three\
'''
assert multiLineStringWithoutNewLines == multiLineString

//SLASHY STRINGS ARE ALSO STRINGS
def slashyString = / .hi, I'm a kind of String too!*.*/
assert slashyString == " .hi, I'm a kind of String too!*.*"
assert slashyString instanceof String
assert 'String' == /String/

//CHARACTERS
char charExample = 'A' 
assert charExample instanceof Character

def charExample2 = 'B' as char 
assert charExample2 instanceof Character