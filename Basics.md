Programming Basics
===

You program in a **Programming Language** (which looks somewhat like English), but computers only understand **machine language**; you need a **compiler**, which translates the program into machine language. We will be using the Java programming language. Since each different kind of computer has its own machine language, Java (as many other technologies) uses a **virtual machine**. 

## Compilers, editors and IDEs

Your program is just a bunch of text, so you use a **text editor** (like Notepad, or better Notepad++ on Windows) to edit it. You then use a **compiler** to translate that text into something the machine can understand.


## Compiling

The Java compiler is called *javac*. Usually we name our java files with the .java extension, so you'd use a command like javac Hello.java , which would generate a Hello.class file. You'd then be able to execute that file with java Hello.

## IDEs
Many times, you want a program that does more than a simple text editor; we many times use an Integrated Development Environment, or IDE, which understands our programming langugage and can help us with syntax highlighting and auto-completing options.

There are many IDEs available for java; the most popular educational IDEs are [DrJava](http://drjava.org) and JGrasp, and the most popular professional IDEs are [Eclipse](http://www.eclipse.org), [Netbeans](https://netbeans.org/) and [IntelliJ Idea](https://www.jetbrains.com/idea/). I will be using Eclipse in this class, but you're free to use whichever IDE or text editor you prefer.

## make and gradle
Many times you end up with more than one file, and you need to compile them in a certain order and bundle them. One of the first programs to do so (for unix and the C language) was *make*, and it is commonly used as a generic term for all those programs. In the Java world, we normally use ant, maven or gradle. In this class, I will be using [gradle](http://gradle.org).

## Version control and git

When you work on a program, you will make many revisions; in order to keep track of all your revision (and if you work as a team, to keep track of who changed what), you normally use a version control system. One of the most popular ones is git, and we will use it in this class. I will ask you to create an account on bitbucket to share your code with me, and I will use github to share my code with everybody (they are both git servers; github is free only for public repositories, but is very popular, while bitbucket allow for provate repositories also for free).

# Getting started

You need to install a few programs for this class:
* The Java Development Kit - JDK (from [http://www.oracle.com/technetwork/java/javase/downloads/index.html](http://www.oracle.com/technetwork/java/javase/downloads/index.html). Make sure to install the JDK, not just the JRE. Java 8 is the current version, so just install the latest minor number for java 8.
* A Git client (you can find good ones at [http://www.git-scm.com/downloads](http://www.git-scm.com/downloads)).
* [Eclipse](http://www.eclipse.org/). This is an IDE, and all my videos etc will use it; if you prefer to use a different one it is OK.

    