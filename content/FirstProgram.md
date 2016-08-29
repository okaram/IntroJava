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

In Java, all of our code lives in classes; we will learn much more about classes and objects later; for now, just assume that you have to define a class :). Our class name is Hello (you could name your class anything you want; it is customary in java to have one file per class, and to name your file with the same name as the class).

Then we define our main method; Java programs always start on the main method, which has to be defined exactly as follows (except for naming the arguments):

```java
    public static void main(String[] args) {
```

Inside main, we create a variable of the Scanner class:

```java
        Scanner input=new Scanner(System.in);
```

The System class is part of the standard library, and it has an instance variable calle `in`, which represents the standard input (the keyboard :). Java defined several Stream classes for input and Output (I/O), but has later defined more classes; the Scanner class is relatively new, and it allows for fairly easy input, as we will see below. Our variable of type Scanner is called input.

We then print a message (we have System.out, similar to System.in)
```java
        System.out.println("Please enter your name");
```

And read from the user:
```java
        String name=input.nextLine();
```
Here we use the nextLine method of the Scanner class, to get a String ; this method will read a whole line (until the user enters a newline, usually by pressing the enter key). The Scanner class has other methods, like nextInt, which read values of different types.

Finally, we print the `"Hello "` concatenated with the value we got from the user.

```java
        System.out.println("Hello "+name);
``` 
## Now with functions

We could want to encapsulate how do we say Hello; so we can later change the actual phrasing; we could create a function, let's call it sayHi; we would pass it the name, and, to make it able to write to other places rather than the screen, we will pass it the PrintStream to write to, rather than write to System.out; we could define the function as follows:

```java
	public static void sayHi(String name, PrintStream out){
		out.println("Hello " + name);
	}
```

And we could also replace the first part, when we ask for the name and read it; those two lines are related (we wouldn't do one without the other), so let's define a function that writes the message, then reads and *returns* the name read. It would look like this:

```java
	public static String getNameFromUser(PrintStream out, Scanner in){
        out.println("Please enter your name");
        String name=in.nextLine();
		return name;
	}
```

And main would now look a little cleaner:
```java
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        String name=getNameFromUser(System.out, input);
        sayHi(name,System.out);
    }
```

## Full program with functions
Just for reference, here's the full program with functions

```java
import java.io.PrintStream; // System.out is a PrintStream
import java.util.Scanner; // import the scanner class

public class Hello{
	public static void sayHi(String name, PrintStream out){
		out.println("Hello "+name +"");
	}
	
	public static String getNameFromUser(PrintStream out, Scanner in){
        out.println("Please enter your name");
        String name=in.nextLine();
		return name;
	}
	
	
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        String name=getNameFromUser(System.out, input);
        sayHi(name,System.out);
    }
}
```





