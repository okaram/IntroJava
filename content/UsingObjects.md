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
		Point pt1=new Point(10,10);
        Point pt2=new Point(5,7 );
```
creates two new points, and assigns them to the variables pt1 and pt2 (which are also being declared here).

Notice each point object is independent of each other (although they come from the same *class*, which works as a template for the object).

### Constructor arguments

Notice that we are passing some arguments to the Point constructor; we are doing Point(10,10), to create a point at 10,10. This (not coincidentally) looks like a function call; after the keyword `new`, we use the class name (Point) almost as if it was a function that creates a new point given its parameters. We need to look at the documentation of a class to see what parameters its constructors expect (classes may have more than one constructor). 

Usually the constructor initializes the state of our object; in this case, pt1 and pt2 refer to two different objects, presumably with different state,

## Instance variables and methods

Objects encapsulate *state*, through their instance variables, and *behavior*, through their methods (notice these methods may behave differently dependiing on the objects' state).

For example, a Point object has two pieces of state, x and y. Once we have a reference to a point, we can access its instance variables (well, at least the ones it gives us access to), with the . operator; for example:
```java
		System.out.println( pt1.x );
```
would print the value of the x variable of pt1 (in our example, 10, since that's what we passed to the constructor).

Notice that, since we are getting access to the instance variable, we can *change* it; so we can do:
```java
		pt1.x=12;
```

We can also call some methods on the object using also the . operator. The method call looks like a function call, except for the object reference and the period. The Point class has a getX method (notice the X is capital here, following java naming conventions), which returns the value of the x instance variable, so we could use the following line to print that value as above:
```java
		System.out.println(pt1.getX());
```
Other classes have setX kind of methods, that allow us to change the variables, but Point does not.

## Common class methods
+ toString
+ equals

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

