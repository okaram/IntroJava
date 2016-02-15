Loops
===

We have now seen how to iterate by using recursion; recursion is a powerful tool, but Java also supports loops for iteration. A loop lets you go back and execute the same code over and over again depending on a condition.

## The do-while loop

The `do-while` loop allows you to execute a block of statements while a condition is true (your statements inside the loop should change the condition so that it eventually isn't true, or you get into an infinite loop). The statements are executed at least once.

It's syntax is as follows:
```java
do {
    // stuff here
} while(condition) ;
```

The condition is any boolean expression (the parenthesis are needed here), and the semicolon at the end is mandatory.

### Example

`do-while` loops are commonly used when reading from input, since we normally want to read at least once. The following function reads numbers and adds them up, until the user enters 0, and then returns the sum.

```java
	public static int readAndSum(Scanner in)
	{
		int sum=0;
		int input;
		do {
			System.out.println("Please enter a number (0 to stop)");
			input=in.nextInt();
			sum+=input;
		} while(input!=0);
		return sum;
	}
```
## The while loop
The `while` loop is similar, but the condition is at the top and the loop may not execute at all if the condition is not true (the `do-while` executes at least once).

The syntax is as follows:
```java
while (condition) {
    // do stuff
}
```

### Examples

We can use a while loop to calculate the power function:
```java
	int power(int base, int exponent)
	{
		int pow=1;
		while(exponent>0) {
			pow*=base;
			--exponent;
		}
		return pow;
	}
```

As another example, consider a function that checks whether a digit occurs within a number 
```java
	public static boolean containsDigit(int number, int digit)
	{
		while(number!=0){
			int lastDigit=number%10;
			if(lastDigit==digit)
				return true;
			number /=10;
		}
		return false;
	}
```

## The for loop
Many times our while loops end up with a familiar pattern (check power, for example). First, we initialize a variable, then we have a while loop, and inside the loop we (besides other statements) modify our variable; this pattern is so common that the for loop was introduced to make the pattern clearer. Its syntax is as follows:
```
for(initialization; condition; increment) {
}
```

In the initialization part we could actually define a variable, and if we do so its scope is within the loop only. We can also include several initialization and increment clauses, separating them with comma, but if you're doing this you may want to use a while loop (I won't even provide an example of this :).

### Example
```java
	int power_for(int base, int exponent)
	{
		int pow=1;
		for(int i=0; i<exponent; ++i) {
			pow*=base;
		}
		return pow;
	}
```

## Loops are equivalent !
Notice all 3 loops are very similar and we can always rewrite our programs (maybe by adding a variable or repeat a few statements) to use a particular kind of loop. It is mostly a matter of style which loop to use.

## break and continue
