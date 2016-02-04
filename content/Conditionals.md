Conditionals (if)
===

Many times, in life and programming, we need to act differently depending on certain conditions. In Java we do this with an if statement. 

# Syntax
The syntax is simple:
```java
if (condition) {
    ...
} else {
    ...
}
```

And a real example (inside a function):
```java
public static String booleanToYesNo(boolean b)
{
    if( b ) {
        return "Yes";
    } else {
        return "No";
    }
}
```

A few highlights about the syntax:
+ The parenthesis around the condition are required 
+ the braces are not strictly required; if you don't put braces then only the first statement is considered to be inside the if; it is a very good idea to always put braces, so feel free to use it as if they were required :)
+ the `else` clause is not required; you can have an `if` with no `else`, and in that case nothing gets done if the condition is not met.
+ *indentation* (starting some lines deeper than others) is important, although not required by the language. It is impportant to use a *consistent* indentation scheme, although it usually doesn't matter which particular one you use. 
    + Your IDE can automatically indent code (source/format in Eclipse).
    + Use indentation to show structure; basically, every { leads to a deeper level of indentation
    + tabs vs spaces is a thing (yeah, is what we geeks do)
    + Whether the { goes on a new line is also subject to debate :(
    + be consistent !
## another example

Let us define the abs function, which returns the absolute value of an int (the absolute value is always positive).

```java
	public static int abs(int number)
	{
		if(number<0) {
			return -number;
		} else {
			return number;
		}
	}
```
    
# nested if statements

Inside the braces for an if/else, we can put any statements, including another if statement. We call an if inside another if a *nested* if statement. As far as Java is concerned, we can nest at any level, although if our conditions are too complicated, chances are we're approaching the problem wrong.

As an example, let us defne the `sign` function, which takes a number and returns -1 if the number is negative, 1 if positive and 0 if 0.

```java
	public static int sign(int number)
	{
		if( number<0 ) {
			return -1;
		} else {
			if ( number>0 ) {
				return 1;
			} else {
				return 0;
			}
		}
	}
```

# chained if statements

Many times we have more than two mutually exclusive possibilities; in that case, we normally write them as a chained if statement (tecnically, this are nested if statements, with the nesting happening in the else part, but we format them with all options at the same level, which makes more sense).

For example, we could write the sign function as follows:
```java
	public static int sign(int number)
	{
		if( number<0 ) {
			return -1;
		} else if ( number>0 ) {
			return 1;
		} else {
			return 0;
		}
	}
```

# Ternary operator

Java has an operator that works similar to an if statement, but it yields a value (as it is an operator). It syntax is like this:
```java
condition ? valueForTrue : valueForFalse
```
For example, we could write the abs function as follows:
```java
	public static int abs(int number)
	{
		return number<0 ? -number : number;
	}
```

# More examples 

## [FizzBuzz](https://en.wikipedia.org/wiki/Fizz_buzz)

A now popular interview question asks for printing numbers in sequence, but printing Fizz if the number is divisible by 3, Buzz if it is divisible by 5, FizzBuzz if it is divisible by both (and the number if neither :). We will define a similar problem; we will define a function that, given an int, will return a String; either Fizz, Buzz, FizzBuzz, or the number (as a String), according to the rules. It is a simple problem, but can be error-prone.

We can do it with nested ifs:
```java
	public static String FizzBuzzNested(int number) {
		if(number % 3 ==0) {
			if(number % 5 == 0) {
				return "FizzBuzz";
			} else {
				return "Fizz";
			}
		} else {
			if(number % 5 ==0) {
				return "Buzz";
			} else {
				return ""+number;
			}
		}
	}
```

Or with chained if statements:
```java
	public static String FizzBuzzChained(int number) {
		if( (number%3==0) && (number%5==0)) { // or if (number%15==0), but ...
			return "FizzBuzz";
		}
		else if( number%3 == 0 ) {
			return "Fizz";
		} else if( number%5 == 0 ) {
			return "Buzz";
		} else {
			return ""+number;
		}
	}
```
## Max and Min



# Exercises
+ The taxes for 
| Tax Rate  | Min income    | Max Income    |
| --------- | ----------    | ----------    |
|   10      |   $  0        |   $  9,225    |
|   15      |   $  9,226    |   $ 37,450    |
