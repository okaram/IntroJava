The `switch` statement
===

Another conditional statement, the `switch` statement, allows us to have more than one option; however, we have to use specific values, not conditions, and it only works on integral types (ints, char, long) and, since Java 7, on Strings.

The syntax is as follows:
```java
    switch(expression) {
        case val1:
        case val2:
            // do stuff
            break;
        case val3:
            // do other stuff
            break;
        default: // this gets executed if none of the others were
            // do some other stuff
    }
```

As an example, consider a function to provide the name of the month, given a number (1=January, 2=Feb,...12=December). We could use a series of if statements, but it would look nicer with a switch statement, like this:

```java
	public static String dayName(int day) // 1=Sunday, ... 7=Saturday
	{
		switch(day) {
		case 1:
			return "Sunday";
		case 2:
			return "Monday";
		case 3:
			return "Tuesday";
		case 4:
			return "Wednesday";
		case 5:
			return "Thursday";
		case 6:
			return "Friday";
		case 7:
			return "Saturday";
		default:
			return "Invalid day";
		}
	}
```

Notice how, since we're using return statements, we do not need `break`s.

As another example, consider another function that would tell us how many days a month has (assuming it's not a leap year). It would look like this:

```java
	public static int daysInMonth(int month) // 1=Jan, ... 12=Dec
	{
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 31;
		case 2:
			return 28; // Feb, assuming not leap year
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		}
		return 0; // just in case we got something outside our range :)
	}
```

# Other Resources
+ [The switch statement](http://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html) - From Oracle's Java tutorial

# Exercises

+ If you look at most phone numeric keyboards, you'll notice there are small letters next to the numbers; each number corresponds to 3 or 4 letters. Write a function called letterToNumber that takes a char and returns the corresponding number (or 0 if the character is not a letter or doesn't correspond to a number).

+ Write a function called digitToWord that takes an int (from 0 to 9) and returns a String, the corresponding name for the digit (Zero, or One, or ...). Return "Invalid Number" if the parameter is not between 0 and 9.

