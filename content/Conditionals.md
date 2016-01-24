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
    
# chained if statements

# nested if statements

# switch statement

# Exercises
