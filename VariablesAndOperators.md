Variables and Operators
===

One of the most important concepts in programming is that of a *variable*, which is a named location in memory. Variables in Java have a name, a type and a value. We can change the value of a variable as our program runs.

Although you'd normally use variables in the context of full programs, you can play with variables and operators using [JavaRepl](http://javarepl.com).

## Declaring variables

We declare a variable by specifying its type and its name. Let's start with int variables, which can contain whole numbers (integers). Java supports integers as a primitive type, and names the type *int* (we will later see ints are related to the java.lang.Integer class). For example:

```java
int a;
```
Declares a variable a of type int. Notice the statement ends in a semicolon, like most statements in Java.

In Java, we have to declare a variable before we can use it, and we have to specify its type. The type of a variable can never change, but we can change its value as many times as we need or want.

## Assigning

We can assign a value to a variable with the assignment operator, = . For example, to assign the value 10 to the variable a we would do:
```java
a=10;
```

We can use more complicated expressions on the right-hand side of the assignment; for ints, the usual math operators work:
```java
a=3+4;
```

