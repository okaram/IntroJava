Arrays
===

As you program, yo probably have come up with situations where you wish you could deal with a bunch of objects at a time; in Java, the most basic way of dealing with many objects at a time is by using *arrays*.

An *array* is a fixed-type collection of objects all of the same time. Array types are denoted by having `[]` after the base type (the type of all the objects in the array).Arrays have a property, `length`, which tells you the number of elements in the array, and a special operator,`[]` which gets you a given element from the array.

## Declaring and initializing
For example, we can declare an array variable and initialize it to an array of 3 elements like this (notice the [] on both sides):
```java
int arr[] = new int[3];
```

When declaring a variable only, we can create an array constant, enclosing the values in `{}` and separating with commas, as in:
```java
int arr2[] = {1,2,3,4,5};
```

## Length

Arrays have a property, `length`, which gives you the number of elements in the array.

## accessing elements (start at 0 !!)
We can access the elements in an array with the `[]` operator, passing it the index of the element we want. For example, if we want to print the *first* element of the array arr2 (which has index 0, arrays start at 0 in java), we would use:
```java
System.out.println(arr2[0])
```

We can also assign values to the elements of an array, with the same notation, so we could do something like this to set the first element to 50:
```java
arr2[0]=50;
```

## Arrays as parameters

We can pass arrays as parameters; as arrays are objects, they are passed by reference, so we can change the elements in the array.

A function that prints all elements in an array of ints, using a `for` loop to go through all the elements, would be:
```java
	public static void printArray(int[] arr){
		for(int i=0; i<arr.length; ++i) {
			System.out.println(arr[i]);
		}
	}
```
And one that multiplies all elements of the array by 2 (showing you can change them) would be:
```java
	public static void multiplyBy2(int[] arr){
		for(int i=0; i<arr.length; ++i) {
			arr[i]=arr[i]*2;
		}
	}
```

## foreach loop

Most of our loops over arrays, end up looking like those above; using a variable for the index; given this, Java added a special loop to iterate through collections; we declare a variable for *the element* and we use a : to separate this variable from the array, as follows:
```java
	public static void printArrayForeach(int[] arr){
		for(int elem: arr) {
			System.out.println(elem);
		}
	}
```

```java
	public static void multiplyBy2(int[] arr){
		for(int elem: arr) {
			elem=elem*2;
		}
	}
```
# More examples
```java
	public static int min(int[] arr) {
		// we assume the array is not empty
		int theMin=arr[0];
		for(int i=1; i<arr.length; ++i) {
			if(arr[i]<theMin)
				theMin=arr[i];
		}
		return theMin;
	}
```
```java
	public static boolean isSorted(int[] arr) {
		for(int i=1; i<arr.length; ++i) {
			if(arr[i]>arr[i-1])
				return false;
		}
		return true;
	}
```
# Array Problem patterns
+ do something with all the elements
+ do something to all the elements
+ use an accumulator

# Common problems
+ min / max
+ sorting