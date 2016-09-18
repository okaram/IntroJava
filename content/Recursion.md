Recursion
===

We have seen how to define functions (and how to use if statements). We can use functions to calculate any values, if we use *recursion*; that is if we allow functions to call themselves.

## Factorial
The standard example is the factorial function, which can be defined as 1*2*3*...*n, or, recursively as:

n! = n * (n-1)!

and 0! = 1 (so we know where to start).

We can define this function in Java as:
```java
	public int factorial(int n) {
		if(n<=0)
			return 1;
		else
			return n*factorial(n-1);
	}
```
Notice that, since this definition doesn't cover the factorial of negative numbers, and I'm paranoid, I'm using <=0 as my condition.

Imagine that we try to calculate factorial(4), the execution will go as follows:
+ factorial(4) => is n<=0 ? no (it is 4), then return 4*factorial(3) ; ok , let's calculate factorial(3) ...
+ factorial(3) => is n<=0 ? no (it is 3), so return 3*factorial(2) ; ok, let's calculate factorial(2) ...
+ factorial(2) => is n<=0 ? no (it is 2), so return 2*factorial(1) ; ok, let's calculate factorial(1) ...
+ factorial(1) => is n<=0 ? no (it is 1), so return 1*factorial(0) ; ok, let's calculate factorial(0) ...
+ factorial(0) => is n<=0 ? yes ! so return 1 (and the whole stack unravels)

## Power

As another example, let's define the power function, that raises a base to an exponent; raising 2 to the 3rd power would be 2x2x2=8 (we're multiplying 2 three times).

We can define it recursively as: pow(base, exponent)=
+ 1 if exponent = 0 (anything to the 0th power is 1 by convention)
+ base * pow(base, exponent-1) otherwise

Or in Java:
```java
	public int pow(int base, int exponent) {
		if(exponent<=0)
			return 1;
		else
			return base*pow(base,exponent-1);
	}
```

### Quick check
+ Can you trace how would we calculate pow(3,2) ? How about pow(4,3) ?

## Counting and printing

As another example, let's define a function that prints all numbers counting down to 0; it takes one parameter, so if we call it with 10 it would do the standard countdown: 10,9,8,7,6,5,4,3,2,1,0. If we reach 0, we know we're done. Otherwise, we print the current number, and call again with the next number down, until we reach 0.

```java
	public static void printCountDown(int from)
	{
		if(from<0)
			return;
		else {
			System.out.println(from);
			printCountDown(from-1);
		}
	}
```


### More counting
As another example, here's counting up, from a given number, by a given step. We stop when we reach *to*.

```java
void PrintCountUp(PrintStream out, int from, int to, int step) {
    if(from<=to) {
        out.println(from);
        PrintCountUp(out, from+step, to, step);
    }
}
```


## Accumulators
Many times, when we use recursive functions to calculate values, we can pass our function an extra parameter, and use it to accumulate the current value (we call this extra parameter an accumulator). For example, we could write the power function with an accumulator as follows (changing the name so we can distinguish between them):
```java
public static int pow_accum(int base, int exponent, int current) {
	if(exponent<=0)
		return current;
	else
		return pow_accum(base,exponent-1, current*base);
}
```

In this case, if the exponent is 0, we are done, and we return the current accumulated value; otherwise, we call ourselves, decrementing the exponent, and multiplying the accumulator by the base. In the end, we would have multiplied that accumulator by the base the required number of times.

Notice this function takes three arguments, instead of two, and would need to be called with an initial value of 1 for current. We can make sure it is called the right way, by defining a *wrapper* function, that just calls our function with the appropriate initial value, as follows:
```java
public static int pow_accum(int base, int exponent)
{
	return pow_accum(base, exponent, 1);
}
```
## Characters in a string
We saw that we can obtain a string's lenght by using the .lenght method, and we can use charAt to get the character at a given place. Given this, we can create functions that go over all the characters in a string; for example ...
```java
	// returns true if the string contains the character
	// we start looking at the char with index from (so if from is 3, we just care whether the string
	// contains the c in its 4th through last characters
	private static boolean stringContains(String s, char c, int from)
	{
		if(from>=s.length())
			return false;
		else if (s.charAt(from)==c)
			return true;
		else
			return stringContains(s,c,from+1);
	}
	
	public static boolean stringContains(String s, char c)
	{
		return stringContains(s,c,0);
	}
```
## Exercises
+ Define a function printCountDown that takes two integers, say `from` and `to` (assuming from is bigger than to), and prints all the numbers between from and to (including both from and to). 
+ Define a function printCountUp that takes two integers, say `from` and `to` (now assuming from is smaller than to), and prints all the numbers between from and to (including both from and to).
