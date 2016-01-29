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
+ factorial(3) => is n>=0 ? no (it is 3), so return 3*factorial(2) ; ok, let's calculate factorial(2) ...
+ factorial(2) => is n>=0 ? no (it is 2), so return 3*factorial(1) ; ok, let's calculate factorial(1) ...
+ factorial(1) => is n>=0 ? no (it is 1), so return 3*factorial(0) ; ok, let's calculate factorial(0) ...
+ factorial(0) => is n>=0 ? yes ! so return 1 (and the whole stack unravels)

# Power

As another example, let's define the power function, that raises a base to an exponent; raising 2 to the 3rd power would be 2x2x2=8 (we're multiplying 2 three times).

We can define it recursively as: power(base, exponent)=
+ 1 if exponent = 0 (anything to the 0th power is 1 by convention)
+ base * power(base, exponent-1) otherwise

Or in Java:
```java
	public int pow(int base, int exponent) {
		if(exponent<=0)
			return 1;
		else
			return base*pow(base,exponent-1);
	}
```
