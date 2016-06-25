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
	Point p1=new Point(3,4);
        Point p2=new Point(5,6);
```
creates two new points, and assigns them to the variables p1 and p2 (which are also being declared here).

Notice each point object is independent of each other (although they come from the same *class*, which works as a template for the object).


### Primitive vs Object variables 

When we create a variable for primitive values, like int or boolean, the value is actually stored in the variable; for example, for 
```java
int i=3;
int j=4;
```
We would end up with something like this:
![Primitive variables in memory](pics/IntVariables.png)

the variables directly contain the values.

When we create object variables, we have to create them with `new`; the variable contains a *reference* to the object, and the objects are created in a different location in memory; so, for the code above, where we created two points, p1 and p2, our memory looks more like this:
![Object variables are references to objects in memory](pics/ObjectVariables.png)

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

## Aliasing 
Objects have *identity* independently of the variables; we say the variables *reference* the object. Several variables can reference the same object, which can be a source of confusion.

For example, if we have:
```java
	Point p1=new Point(3,4);
        Point p2=p1;
```

Our memory now looks like this:
![Aliasing of objects](pics/Aliasing.png)

So, if we do something like:

```java
	p2.x=25;
```

p2 refers to the same object as p1, and so when we make p2.x=25, p1's value is also changing (well, p1 didn't change, it still refers to the same object, but that object has changed :). When two variables refer to the same object we say they *alias* each other.

### Aliasing Exercise
Given the following code:
```java
		Point pt1=new Point(10,10);
		Point pt2=new Point(5,5);
		
		Point alias=pt1;
		alias.x+=pt2.x;
		
		alias=pt2;
		alias.y+=5;
		
		int sumX=pt1.x+pt2.x;
		int sumY=pt1.y+pt2.y;
```
What is the value of sumX and the value of sumY ?

## Common class methods

In Java, a class serves as a template for objects; every class defines the following methods (so they are available on every object)
+ String toString() - returns a string representation of the object
+ boolean equals(Object anotherGuy) - returns true if the two objects are 'equal', usually if all their fields are equal

## Equality vs Identity

In English, when we say two things are 'the same', we may be meaning they are equal, or we may mean they are actually the same object (for example, if I say we have the same car, you would assume we each have a car, of the same make and model; whereas if I say I share the same car with my wife, you would infer we have actually one car, not two).

Since this distinction is important many times, in Java (and most programming languages), we distinguish between *identity*, two values refering to *the same* object, and equality, two objects being somehow equal (usually meaning all their fields are equal, but the semantics may be slightly different). In java we test for identity with the == operator, and for equality with the .equals method.

For example:
```java
    Point pt1=new Point(1,1);
    Point pt2=new Point(1,1);
    
    boolean areTheyIdentical= (pt1==pt2); // should be false
    boolean areTheyEqual= (pt1.equals(pt2)); // should be true
```

## Example: java.awt.Rectangle
Another useful class to play with objects is the Rectangle class, which has a point representing one corner (the top-left corner, that is the one with lowest x and y, since awt uses screen coordinates, with the y growing downwards, instead of the usual math coordinates where y grows up).

A rectangle has the x and y coordinates of its top-left corner, plus a width and a height. We can create one like this:
```java
		Rectangle r=new Rectangle(10, 12, 5, 7);
```
Where x=10, y=12, width=5 and height=7.

## Examples: functions with objects

We may want to define a function that checks whether a point is to the left of another (that is, its x coordinate is less than the other). We could do:
```java
	public static boolean isToTheLeft(Point p1, Point p2)
	{
		return p1.x < p2.x;
	}
```

And a function to calculate the area of a rectangle:
```java
	public static int getArea(Rectangle r)
	{
		return r.width+r.height;
	}
```

## Pass-By-Reference
In Java, when we pass primitive values (like ints) to functions, the compiler makes a copy; however, objects are passed by reference; this can be used to write functions that *modify* their parameters, which is dangerous, but sometimes useful.

For example, we can write a function to grow the width and height of a rectangle by a given factor:
```java
	public static void growRectangle(Rectangle r, int factor)
	{
		r.width *= factor;
		r.height *= factor;
	}
```


