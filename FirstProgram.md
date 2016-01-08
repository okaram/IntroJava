Your first java program
===

Most programs involve processing some *inputs* and producing some *outputs*. In simple programs, we normally read the input from the user directly (from the keyboard), and produce the ouputs directly to the screen as simple text. This is what we will do in this program. Many times we want to store some information temporarily to be used later in the program; we say we store the information in *variables*, which have a name (so we can refer to them later), a type (which determines which kind of information we can store in it), and a value (which may change over time).

Traditionally, the first program just writes "Hello world" on the screen; I don't like this program because it doesn't have any inputs; so we will write a program that asks the user for its name, reads it (and stores it in a variable) and then  writes "Hello" followed by that name. One small problem with java is that it requires a lot of 'noise' even for the simplest programs; we will see what it all means, but for now just look at it as noise :)

Wihout furhter ado, here's the program:


```java
import java.util.Scanner; // import the scanner class

public class Hello {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Please enter your name");
        String name=input.nextLine();
        System.out.println("Hello "+name);
    }
}
```
Now let's go over the program

```Java
import java.util.Scanner; // import the scanner class
```
In Java, we organize our code in *packages* (think folders in your computer :), and separate the names with . ; many standard Java classes live in the java.util package; however, to avoid typing the full name we can import a class, and then just type the last part of its name, Scanner, instead of the full name, java.util.Scanner.

After that, we define our class:
```java 
public class Hello {
```

In Java, all of our code lives in classes; we will learn much more about classes and objects later; for now, just assume that you have to define a class :). Our class name is Hello (you could )

