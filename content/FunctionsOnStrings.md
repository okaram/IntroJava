Functions on Strings
===

As a way to practice, let's define some functions that take Strings or return Strings; remember, given a String variable, say s, we can call the following methods:
* .length - returns the lenght of the String
* .substring(first, last+1) - returns a piece of the string (another string) -- numbering starts at 0
* .toLowerCase, .toUpperCase - returns the string with all upper or all lowercase
* .charAt(place) - returns the character at a given place (this is one character, not a String) -- remember numbering starts at 0
* .equals - tells if the string is equal to another

## First character
We can define a function that will return the first character of a string; we can use charAt (notice this will fail if the string is empty)
```java
public static char firstCharacter(String s)
{
    return s.charAt(0);
}
```

## Last character
We can define a function that will return the *last* character of a string, by using length to get the place, and then charAt
```java
public static char lastCharacter(String s)
{
    return s.charAt( s.length()-1 );
}
```
* can you try middleCharacter, which would return the character in the middle (or the lowest one, if the string has an even lenght, and so two characters in the middle).

## isAllUppercase
We can use toUpperCase case to see if a string is all uppercase; if it is, it will be equal to its uppercase version
```java
public static boolean isAllUppercase(String s)
{
    return s.equals(s.toUpperCase());
}
```
isAllLowercase left as exercise to the reader :)