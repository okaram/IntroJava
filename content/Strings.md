String variables
===

Many times we need a data type to represent words and phrases. In Java (and many other languages) we call this type [String](http://docs.oracle.com/javase/7/docs/api/java/lang/String.html).

Strings are somewhat special in Java. Although they are not primitives, like ints or booleans, they have a constant representation. Also, like primitives, String values are immutable (you cannot change their value, although you can use them to create other values).

# String variables 

In Java, you declare String variables by using the data type String (notice the capital S) as such:

```java
String s1;
```

# String constants

We denote constants of type string by writing the word inside double quotes, `"like this"`.

```java
String word1="one";
String word2="word";
```

# char variables

Strings are composed of characters (letters, digits and such); the primitive data type that can contains characters is `char`, and we can declare constants of this type by using single quote marks, like `'a'`.

```java
char letter='b';
```

# escaping

# Some string methods