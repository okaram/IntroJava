One of the most important things we do as programmers is manage complexity; functions allow us to encapsulate complex calculations into a black box, and call it when needed.

For example, imagine that you live in a country that uses strange measurement systems for mass, like ounces and pounds, and one pound is equal to 16 ounces; we could keep this knowledge in our head, and convert in our program when needed, but it would be better if we define a function, poundsToOunces, that encapsulates this conversion, so we can do things like: a=poundsToOunces(b).

Most of the times we want functions to perform a calculation and return a value; in Java, we define functions by specifying the return type, then the name of the function, and then a list of its parameters, followed by the actual code in braces. This is probably simpler with an example:

```java
int poundsToOunces(int pounds)
{
    return 16*pounds;   
}
```