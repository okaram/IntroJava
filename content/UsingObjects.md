Using Objects
===

We have now used String objects, but haven't looked at all the things we can normally do with objects. Here we will show the things we can do, and practice some examples.

We will use the [java.awt.Point](https://docs.oracle.com/javase/8/docs/api/java/awt/Point.html),  the [java.awt.Rectangle](https://docs.oracle.com/javase/8/docs/api/java/awt/Rectangle.html) and the [java.awt.Dimension](https://docs.oracle.com/javase/8/docs/api/java/awt/Dimension.html) classes.

## import statements
As mentioned before, the full name of java classes includes the package name, so the class is really java.awt.Point instead of just Point; we can use import statements to tell the compiler we want to refer to them just with the class name; so we can do:
```java
import java.awt.Point;
import java.awt.Dimension;
import java.awt.Rectangle;
```

and then we can refer to them just as Point, Rectangle and Dimension.

## Creating objects - new

We create new objects with the keyword  `new`. We normally assign this newly created object to a variable. For example, the following statement:
```java
		Point pt1=new  Point(10,10);
```
creates a new point, and assigns it to the variable pt1 (which is also being declared here).

### Constructor arguments

Notice that we are passing some arguments to the Point constructor; we are doing Point(10,10), to create a point at 10,10. This (not coincidentally) looks like a function call; after the keyword `new`, we use the class name (Point) almost as if it was a function that creates a new point given its parameters. We need to look at the documentation of a class to see what parameters its constructors expect (classes may have more than one constructor).

## Common class methods

## Equality vs Identity

+ Create them - new
+ Access public instance variables
    + Read
    + Write
+ Access public methods
+ Assign
+ Compare (references)

## Example: java.awt.Point

## Example: java.awt.Rectangle

