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
## Max and abstraction

Say we want to define a function, called max2, which returns the biggest of two ints; we can do it simply as:
```java
	public static int max2( int n1, int n2 )
	{
		if(n1>n2) {
			return n1;
		} else {
			return n2;
		}
	}
```

Now we want to define max3, that takes 3 integers and returns the biggest of those 3 integers. We can use a series of nested ifs; the code would look complicated and somewhat unbalanced, but works. 
```java
	public static int max3_nested( int n1, int n2, int n3 )
	{
		if(n1>=n2) {
			if(n1>=n3)
				return n1;
			else 
				return n3;
		} else {
			if (n2>=n3)
				return n2;
			else
				return n3;
		}
	}
```

We could also use a series of chained if statemens. Notice we need to be careful and use >= or we may return the wrong answer if some of the numbers are equal.
```java
public static int max3_chained(int n1, int n2, int n3)
{
	if(n1>=n2 && n1>=n3) 
			return n1;
	else if (n2>=n1 && n2>=n3)
			return n2;
	else 
		return n3; 
}
```

We could also use a sequence of if statments and a temporary variable, for a reasonably clean solution
```java
public static int max3_sequence(int n1, int n2, int n3)
{
	int max=n1;

	if(n2>=max) 
		max=n2;

	if(n3>=max) 
		max=n3;

	return max;
}
```

However, if we notice we already have max2, we can use it to arrive at the cleanest solution: 
```java
public static int max3(int n1, int n2, int n3)
{
	return max2( max2(n1,n2), n3 );		
}
```

# Exercises
+ The marginal income tax rates for a certain country (OK, the USA in 2015 according to wikipedia :), for people filing as single, are: 

| Tax Rate  | Min income    | Max Income    |
| --------- |---------      | ----------    |
|   10      |   $  0        |   $  9,225    |
|   15      |   $  9,226    |   $ 37,450    |
|   25      |   $ 37,451    |   $ 90,750    |
|   28      |   $ 90,751    |   $189,300    |
|   33      |   $189,301    |   $411,500    |
|   35      |   $411,501    |   $413,200    |
|   39.6    |   $413,201    |    no limit   |

+ Write a function, called taxRateForSingles, that takes an int and returns a double; the function uses if statements and returns the corresponding tax rate.

+ Write a function called taxAmountForSingles, that takes an int and returns a double; this function returns the *amount* owed in taxes for  the corresponding input (use the table above).

+ Define a max4 function that takes 4 integers and returns the largest one, by calling max2 several times.

+ Define a max4 function that takes 4 integers and returns the largest one, by using a sequence of if statements, like in max3_sequence.


