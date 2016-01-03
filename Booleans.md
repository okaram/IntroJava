Boolean Variables and Operators
===

Another important type of values in programming is that of *boolean*, which contains only the values *true* and *false*. Although we use logic and booleans in our daily life, non-programmers don't tend to see them as values having operators.

## Boolean variables ([Video](https://youtu.be/h7ss6NgYB5M))

We can declare variables with the type *boolean*; we can put the values 'true' or 'false' into them; for example:
```java
boolean b1=true;
boolean b2=false;
```

## Boolean operators

We can combine booleans with the 3 standard logic operators:
* !, not - this inverts its value; !false becomes true, !true becomes false.
* &&, and - this binary operator yields true only if both its operands are true.
* ||, or - this binary operator yields true if either of its operands (or both) is true. Notice that when both operands are true, the result is true.

### Examples
```java
boolean earthIsRound=true;
boolean earthIsNotRound=!earthIsRound;
boolean earthIsSquare=false;

boolean earthIsRoundOrSquare= earthIsRound || earthIsSquare; // what would be the value ?
boolean earthIsRoundAndSquare= earthIsRound && earthIsSquare; // what would be the value ?
```

### Short circuiting

Although it is not important right now, you should know that binary boolean operators in java do NOT evaluate both sides, unless needed; so if we're using an && operator, the first side is evaluated and, if we get false, we know the end result is false, so the compiler will NOT evaluate the other side. This might be important later, when the expressions on each side can be complex and have side effects.
 
## Relational operators ([Video](https://www.youtube.com/ZIjRLlcHL4w))

We also have operators that allow us to compare two values, and yield a boolean (we call these *relational* operators, since they allow us to establish relationships among values). Notice that, as a rule, we can only compare objects of the same type.

The relational operators are:
+ == : which tests whether its operands are equal (notice this is two equal signs, ==, very close to the assignment operator, =, which is a constant source of confusion and grief :)
+  != : not equal
+ <, > : less than, greater than 
+ \>= : greater than, or equal
+ <= : less than, or equal 

### Examples

```java
int a=9;

boolean isA10 = a==10;

boolean isAGreaterThanOrEqualTo10 = a>=10;
boolean isALessThanOrEqualTo20 = a<=20;

boolean isABetween10And20 =  isAGreaterThanOrEqualTo10 && isALessThanOrEqualTo20;
// we can also write as
isABetween10And20 =  (a>=10) && (a<=20);
```
## Exercises
Remember, you can check with [JavaRepl](http://javarepl.com)
 
1. What would be the value of *ans* at the end of the following code fragment ?
    ```java
    int a=10;
    int b=20;
    boolean isAGreaterThanB=a>b;
    boolean isBGreaterThanA=b>a;
    
    boolean ans= isAGreaterThanB || isBGreaterThanA;    
    ```
 
2. What would be the value of *ans* at the end of the following code fragment ?
    ```java
    int x=10;
    
    boolean ans= (x%2)==1; // remember, % is the modulo/remainder operator
    ```
3. What would be the value of *ans* at the end of the following code fragment ?
    ```java
    
    ```
 