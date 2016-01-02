Variables and Operators
===
## Video - [Int variables and Operators](https://youtu.be/1JEtmEthcS4)

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

Notice we can change the value of a variable as many times as we want, although we must always store values of the same type.

Also, although it looks like we're doing algebra, the assignment operator here means 'put the value into the variable'; in algebra, once we declare a variable has a certain value or property, it has to keep it forever.

In Java we can do things like this, which would be atrocious in math:
```java
int a;
int b;
a=10;
b=a+1; // b is now 11
a=b+9 // since b is 11, a is 11+9=20
```
### Declaring and initializing

We can declare a variable and give it an initial value (initialize it) in one statement, like this:
```java
int c=10;
```

Although JavaRepl does not support this syntax, in Java we can also declare several variables of the same type and initialize them at the same time, like this:
```java
int x=10, y, z=x+1;
```

### Variable names
We should always name our variables to denote their meaning (although i sometimes use short names like a or x in these notes :).

Variables in java are composed of letters, numbers (digits), dollar sign ($) and underscore (_). Variable names cannot start with a digit. Java distinguishes between lowecase and uppercase letters, so *a* is a different variable than *A*. 

There's no specific limit to the lenght of variable names (you'll get tired before the compiler does :). 

There's a strong convention to start variables with a lowecase letter, and use capitalization to separate words, so we have variable names like: *gearRatio*, *numberOfSides* etc.

## Basic Integer operators

In Java we have the standard mathematical operators, with slight variations:
* +, - (and unary minus) behave as in elementary school, with the operators being evaluated from left to right (in the order in which we read them). So, for example, 3+4-1-2 yields 4 (3+4=7, 7-1=6, 6-2=4)
* * is the multiplication operator (instead of the x symbol, since it would be confused with the letter x)
* / is the integer division operator (it calculates the integer value, like in elementary school :), so 3/4 yields 0, and 4/3 yields 1, NOT 1.333)
* % is the integer remainder or modulo operator, so 5%2 is 1, since 5 divided by 2 is 2 with a remainder of 1.

We can mix and match this, with the usual order (PEMDAS, except there's no operator for exponents :), and use parenthesis to modify the order of operations. If you can't remember the apropriate order, it is perfectly ok to use extra parenthesis.

### Shorthand operators
Java supports several shorthand operators; we write the operator followed by the = sign, to avoid repeating a variable; so instead of:
```java
a=a+5;
```
We can write
```java
a+=5;
```
We can also use:
```java
b*=3; // instead of b=b+3
b++; // instead of b+=1, meaning b=b+1
b--; // instead of b-=1, meaning b=b-1
```
# Exercises 
* hint: feel free to use [JavaRepl](http://javarepl.com) to verify these. Make sure you understand why they work; try other combinations

1. What would be the value of *x* at the end of this code fragment ?
    ```java
    int a=10;
    int b=3*a;
    int x=b-5;
    ```
    
2. What would be the value of *ans* at the end of this code fragment ?
    ```java
    int a=5;
    int b=a+1;
    int ans=a*b;
    ans++;
    ```
