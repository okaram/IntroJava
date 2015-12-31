Boolean Variables and Operators
===

Another important type of values in programming is that of *boolean*, which contains only the values *true* and *false*. Although we use logic and booleans in our daily life, non-programmers don't tend to see them as values having operators.

## Boolean variables

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

## Relational operators

### Examples

## Exercises
 