File Input and Output
===

We have used System.in and System.out (and the Scanner class) for Input and output, but up until now we've only read from the keyboard, and written to the screen. Now we will see how to work directly with files.

Java has many classes to do I/O, including for dealing directly with binary data (which is how data is represented in memory), but here we will cover only basic classes for dealing with files.

Many times, when we read a file, we don't go back and forth into it, but we read it sequentially from beginning to end; we treat it like a *stream* of bytes; this concept of a stream is more general than a file, since it can cover the keyboard, network sockets and other devices like tape. Here we will describe streams.

## Input with FileInputStream
We have seen The [InputStream](http://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html) class, of which System.in is an instance (although we usually use the Scanner class).

If your input requirements are simple, you can just create a [FileInputStream](http://docs.oracle.com/javase/8/docs/api/java/io/FileInputStream.html), and use it as System.in (which usually involves just passing it to a [Scanner](http://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html) :)

The only caveat is that  the FileInputStream's constructor can throw FileNotFoundException (and a bunch of its methods can throw IOException, which is the generic exception for 'something went wrong when accessing the file'). So, a function that reads all lines from a file, and returns them as a List of Strings would be:

```java
    public static ArrayList<String> readAllLinesFromFile(String fileName) throws FileNotFoundException, IOException
    {
        ArrayList<String> arr=new ArrayList<String>();
        InputStream inS=new FileInputStream(fileName);
        Scanner s=new Scanner(inS);
        while(s.hasNext()) {
            arr.add(s.nextLine());            
        }
        inS.close();
        s.close();
        return arr;
    }
```

## Output with FileOutputStream

Writing to a file is similar, except that we use a [FileOutputStream](http://docs.oracle.com/javase/8/docs/api/java/io/FileOutputStream.html) and a [Writer](http://docs.oracle.com/javase/8/docs/api/java/io/Writer.html) to write.

