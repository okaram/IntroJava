Boxed Values
===

In Java, we distinguish between *primitives*, like int and double, and *objects* like Strings and the ones we create. For primitives, Java stores and passes around the actual values, whereas for objects we store *references* to them in variables, and the actual object is stored in another location in memory.

Sometimes, we want to store and pass around a reference to a primitive value; we could create our own classes, but Java provides its own, which we in general call 'boxed' primitives. They usually have the same name as the primitive, but starting with an upper case letter (but for some primitives, the spell the whole word :). The objects are immutable (they don't have any `set` methods) and follow a similar pattern. They are useful mostly for using within collections.

|Primitive | Class |
|---    | --- |
| int       | [Integer](http://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html) 
| double    | [Double](http://docs.oracle.com/javase/8/docs/api/java/lang/Double.html) 
| char      | [Character](http://docs.oracle.com/javase/8/docs/api/java/lang/Character.html)

# Example (with int/Integer)

```java
		Integer i=new Integer(3);
		int j=i.intValue();
```

# Auto-boxing and unboxing

It is cumbersome to keep some variables unboxed (as ints) and some boxed, and manually box and unbox to go from one kind to the other; Java (since version 6) provides automatic boxing and unboxing, so in many cases we can ignore their difference (but it is useful to be aware of the distinction, for when the 'magic' doesn't work).

For example, we can do:
```java
		Integer i=new Integer(3);
		int j=i; // auto unboxing !!
        i=j; // auto boxing
```
