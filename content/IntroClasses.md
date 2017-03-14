Defining our own classes
===

In Java, we can define our own classes, our own datatypes; if we create the right classes, which correspond to our problem domain, we can then express our problem in natural terms. Creating classes is like creating our own vocabulary (and closer to English and Writing than to math, which makes it really hard:).

We need to distinguish between *classes* and individual *objects* or *instances*; the classes (String, Point, Person) act as templates defining what our objects can look like; we still need to create individual objects (most times stored in variables) that would represent our domain. We may have a class Person, and then we would have instances representing Jane or John.

## File names and naming conventions
In Java, public classes should be in a file with the same name as the class; so if you have a class named Person, it should be in a file named Person.java (and, although gradle will do magic, it should be in a folder structure that follows the package naming; so if your class' full name is kennesaw.assignment.Person, it should be in a file with path kennesaw/assignment/Person.java, or, following gradle's convention, src/main/kennesaw/assignment/Person.java).

If the class is not public, then it should not be defined on its own file.

## Basic syntax
You define a class with the keyword `class`; then the name of the class, braces {} and inside the braces you define *members*; either *member variables* (which, unless they are static, I tend to call *instance variables*) or *member functions*, which we usually call methods. For each member, you define its *visibility* and then the member.

For example, a simple class for representing a person, with only public instance variables would look like this:
```java
class Person {
	public String firstName, lastName;
	public int age;
}
```

Once we have defined a class, we can use it as a type, and can create instances with the keyword `new`. For example, we could create a variable of type Person, and assign values to its fields as follows:
```java
Person p = new Person();
p.firstName="Joe";
p.lastName="Smith";
p.age=30;
```

## Defining methods

We can also define *methods*; operations that are defined within our class, and have access to the object's instance variables. 

Within a method, we can refer to the instance variables by using the pseudo-variable `this` (and using the . operator), or simply by using the variable's name (and similarly we can call other methods). For example, we could add methods getFullName and getFormalFullName to our person class as follows (notice on one we use this and on the other we don't, to illustrate).

```java
class Person {
	public String firstName, lastName;
	public int age;
	
	public String getFullName() {
		return this.firstName+" "+this.lastName; // you can use this. to access instance variables (but don't have to)
	}
	
	public String getFormalFullName() {
		return lastName+", "+firstName; // you can reference instance variables without the this.
	}
}
```

## Constructors

We have seen we can pass arguments to a constructor; to define such a constructor, we define it like a method, but it does not have a return type and it has the same name as the class. For example, we could add a constructor to our Person class:

```java
	public Person(String firstName, String lastName, int age)
	{
		this.firstName=firstName; // the ones without this are the parameters
		this.lastName=lastName;
		this.age=age;
	}
```

Constructors allow us to define how instances of our classes are initialized. If we do not define *any* constructors at all, Java will define an empty constructor that takes no parameters and does nothing; however, if we define one or more constructors, Java will *not* define any, so instances would need to be created through our constructors. We can *overload* constructors, just like methods, by defining several constructors that take different parameters.

## Access Modifiers

By default, fields and methods (members in general) in a class have *package* access, meaning only classes within the same package can access them; we can also explicitly specify what kind of access we want; we can use the following access modifiers:

+ `private`: members can only be accessed by methods within this class
+ `public`: members can be accessed by anybody
+ `protected`: members can be accessed by methods withhin this class and its subclasses.

## Static modifier

We can also mark members with `static`; static variables belong to the whole class, and all instances of the class share the same variable. Static methods are not associated with a particular instance (they don't have a pseudo-variable `this`). 

## getters and setters

It is common practice to define all your fields private and have methods named getXXXX and setXXXX to read and write those values. So, for example, if you have a field age, rather than doing:

```java
	public int age;
```
you'd do:
```java
	private int age;
	public getAge() { return age;}
	private setAge(int age) { this.age=age;}
```

The advantage of this is that, if you were to ever change how you implement this (say, store the year a person is born, instead of its age), then you could still support the same public interface (getAge and setAge), and so the clients of the class would not need to change. This seldom happens, but this is still common practice.

## Encapsulation

Encapsulation refers to the combination of data and methods (or state and behavior) into one unit, the class. It also refers to the facilities to only allow the data to be accessed by the method (basically, declaring variables as private).

Encapsulation is one of the bases of object-oriented programming (along with inheritance, and polymorphism, which we cover later).


## System an example of static variables

We have been using a few static fields of the System class, without really knowing why they worked; System.in and System.out are static fields or variables of the System class (which are made public).

## Enums

Enumerated types allow us to 