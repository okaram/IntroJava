Void functions or methods
===

Although functions should return a value, we sometimes want to create a function or method that does not return a value, and just modify its parameters or the global state; for example, we could want to define a method that just prints something to the screen.

If we want to define a method that does not return a value, we use `void` as the return type (instead of int or double); if we need to return from the function, we still use a `return` statement, but with no value specified; if we do not specify a `return` statement, then the method will finish on its last line.

For example, a method that prints its argument 3 times would look like this:

```java
public static print3Times(String line) {
    System.out.println(line);
    System.out.println(line);
    System.out.println(line);
}
```