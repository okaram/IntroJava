Interfaces and Poymorphism
===

If we define our objects only by their behaviour, that is, if we make all fields private (or protected) and allow access only through methods, we may end up with different classes having common methods, and we might come up with concepts that correspond to those methods; Java gives us *interfaces* to allow us to describe and use this grouping of common methods.

For example, imagine we're doing an elementary school geometry program; we want to teach the kids how to calculate areas and perimeters of geometric figures; we may end up with a Rectangle class like this:

```java
class Rectangle {
	private double width, height;
	public Rectangle(double width, double height) {
		this.width=width;
		this.height=height;
	}
	
	public double getArea() { return width*height; }
	public double getPerimeter() { return 2*(width+height); } 
	public String toString(){ return "Rectangle[width:"+width+" height:"+height+"]"; }
}
```
And a Circle class like this:
```java
class Circle  {
	private double radius;
	public Circle(double radius) {
		this.radius=radius;
	}
	
	public double getArea() { return Math.PI*radius*radius;}
	public double getPerimeter() {return 2*radius*Math.PI;} 
	public String toString(){ return "Circle[radius:"+radius+"]"; }
}
```

As you can see, these classes have several methods in common; `double getArea()`, `double getPerimeter()` and `String toString()`; every object has a toString method, so we don't really need to worry about it, but we may want to give a name to the notion of 'certain classes should have a getArrea and getPerimeter methods'. In Java, this is called an interface. A decent name for this interface could be *Shape*; I like to give special names to my interfaces, starting with a capital I, so let me call it IShape.
In Java, we can define an interface like this:
```java
interface IShape {
	double getArea();
	double getPerimeter();
}
```

Syntactically, notice we use the keyword `interface` instead of class, and we do not need to declare our methods public, since in Java interfaces can only declare public methods (you cannot have fields or private methods, although, starting in Java 7, you can define constants and default methods). Notice also the methods end with a ; instead of having the method implementation; we call these `abstract` methods, since they will be defined by the implementing class.

Once we have defined an interface, we can change our class definitions, declaring the class *implements* the interface; for the rectangle:
```java
class Rectangle implements IShape {
	private double width, height;
	public Rectangle(double width, double height) {
		this.width=width;
		this.height=height;
	}
	
	public double getArea() { return width*height; }
	public double getPerimeter() { return 2*(width+height); } 
	public String toString(){ return "Rectangle[width:"+width+" height:"+height+"]"; }
}
```

With this, Java will force your class to implement those methods, and signal a compile error if they don't exist. If you end up with many methods, and only some are parts of an interface, it may be a good idea to mark which methods are from interfaces; Java gives us the `@Override` keyword to mark that a given method is defined in an interface (or superclass), and the compiler will signal an error if this is not the case, so we can define our class as:

```java
class Rectangle implements IShape {
	private double width, height;
	public Rectangle(double width, double height) {
		this.width=width;
		this.height=height;
	}
	
	@Override
	public double getArea() { return width*height; }
	
	@Override
	public double getPerimeter() { return 2(width+height); } 
	
	public String toString(){ return "Rectangle[width:"+width+" height:"+height+"]"; }
}
```

If the situation arises, you can define your class as implementing more than one interface.

## Polymorphism

Besides enforcing we have the right methods, defining an interface allows us to define variables and parameters with the type of the interface, and this variable can hold a reference any instance of a class that implements the interface. On this variable, we can call the interface's methods, and the methods of the underlying class will be calles.

For example, given our interface and classes above, we can write code like:
```java
		IShape shp=new Rectangle(3,4);
		System.out.println ("Area: "+shp.getArea()+ " perimeter:" +shp.getPerimeter());
		shp=new Circle(3);
		System.out.println("Area: "+shp.getArea()+ " perimeter:" +shp.getPerimeter());
```

And we can define functions using the interface as parameres; for example, if we define:
```java
	public static String formatAreaAndPerimeter( IShape s) {
		return s.toString()+" - Area: "+s.getArea()+" Perimeter: "+s.getPerimeter();
	}
```
And call such a function with an instance of any class that implements the interface (a Rectangle or a Circle in our example).

We can also define arrays of the interface type, and put references to any of the implementing classes inside the array.

## Inheritance of interfaces

Although we will not be using it in this class, you should know that interfaces can *extend* each other, forming hierarchies; for example, instead of defining our IShape interface as we did, we could have done something like:
```java
interface IShapeWithArea {
	double getArea();
}
interface IShapeWithPerimeter {
	double getPerimeter();
}

interface IShape extends IShapeWithArea, IShapeWithPerimeter {
}
```
