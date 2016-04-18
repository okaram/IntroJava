Exceptions
===

Many times operations find unexpected errors; we could make every function or method return an object containing both an error condition and the actual value, but this is cumbersome.

Java (and other programming languages) supports Exceptions and exception handling.

## Exception classes
+ interface [Throwable](http://docs.oracle.com/javase/8/docs/api/java/lang/Throwable.html)
+ class [Exception](http://docs.oracle.com/javase/8/docs/api/java/lang/Exception.html)
+ class [RuntimeException](http://docs.oracle.com/javase/8/docs/api/java/lang/RuntimeException.html)

## Throwing
```java
throw new Exception("bad stuff happened");
```

## Try / catch
When we know the code migh generate an Exception:
```java
try {
    ...
} catch(Exception e) {
}
finally {
}
```

## Declaring that you throw an exception
```java
int foo() throws Exception {
}
```
The compiler ensures that you deal with exceptions (except subclasses of RuntimeException)

## Defining your own
Just extend Exception 

    