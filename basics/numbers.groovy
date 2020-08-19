//PRIMITIVE TYPES
/*
byte 
short 
int   
long
BigInteger 
*/

def oneDef = 1
Integer one = 1
assert oneDef instanceof Integer

assert Byte.MAX_VALUE == 127
assert Byte.MIN_VALUE == -128

assert Short.MAX_VALUE == 32767
assert Short.MIN_VALUE == -32768

assert Integer.MAX_VALUE == 2147483647
assert Integer.MIN_VALUE == -2147483648

assert Long.MAX_VALUE == 9223372036854775807
assert Long.MIN_VALUE == -9223372036854775808

//WORKING WITH DECIMALS
float  floatExample = 31.856
double doubleExample = 1.345
BigDecimal bigDecimalExample =  floatExample ** doubleExample

//CASTING WITH SUFFIXES
/*
int  -> I or i
long -> L or l
float -> F or f
double -> D or d
BigInteger / BigDecimal-> G or g
*/
def integer = 42I
def integer2 = 42i
assert integer == new Integer('42')
assert integer2 == new Integer('42')


//USING UNDERSCORE
long creditCardNumber = 1234_5678_9012_3456L
assert creditCardNumber == 1234567890123456

long hexBytes = 0xFF_EC_DE_5E
assert hexBytes == 4293713502

long bytes = 0b11111111_11101100_11011110_01011110
assert bytes == 4293713502