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

## Access Modifiers


## getters and setters
