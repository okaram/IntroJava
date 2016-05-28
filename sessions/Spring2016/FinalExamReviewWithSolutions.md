Final Exam Review 
===

Note: This focuses more on the latest material; please also review the material for the midterm. Also, solutions are not necessarily unique; there are several variations you could do, and many small differences (static, public vs protected vs private ...).

We covered solutions in the May 2nd [lecture](https://youtu.be/7MSgLYNeixg)

1. Write a class called Fraction with the following methods/constructor:

    * A constructor that takes two int parameters, the numerator and denominator, respectively
    * a method called getNumerator, that returns an int, the numerator
    * a method called getDenominator, that returns an int, the denominator
    * a method called toDouble, that returns a double, the equivalent decimal to the fraction.
```java
	static class Fraction {
		private int numerator, denominator;
		public Fraction(int numerator, int denominator){
			this.numerator=numerator;
			this.denominator=denominator;
		}
		
		public int getNumerator(){
			return numerator;
		}
		
		public int getDenominator(){return denominator;}
		public double toDouble(){return numerator/(double)denominator;}
	}
```

2. Given the following interface:
```java
interface Product {
    public String getName();
    public String getType();
    public double getPrice();
}
```
Create a class Book that implements the Product interface; it should return "Book" for getType(), and have a constructor taking the other two fields.

```java
	class Book implements Product {
		String name;
		double price;
		
		public Book(String name, double price) {
			this.name=name;
			this.price=price;
		}
		
		public String getName(){return name;}
		public String getType(){return "Book";}
		public double getPrice(){return price;}
	}
```
3. Write a Java code fragment to create a variable called b1, of type Book (defined above) and assign it to a Book instance with name "Catch 22" and price 7.95
```java
	Book b1=new Book("Catch 22",7.95);
```

4. Given the Product interface above, write a function called AveragePrice, that takes an array of Product, and returns a double, the average price of the product.
```java
 	public static double AveragePrice(Product[] products) {
 		double sum=0;
 		for(Product p : products) {
 			sum+=p.getPrice();
 		}
 		return  sum/products.length;
 	}
```

5. Given the Product interface above, write a function called HighestPricedProduct, that takes a List of Product, and returns a Product, the product with the highest price.
```java
 	public static Product HighestPricedProduct(List<Product>products){
 		Product high=products.get(0);
 		for(Product p : products) {
 			if(p.getPrice() > high.getPrice())
 				high=p;
 		}
 		
 		return high;
 	}
```

6. Java has an Integer class, with a static method parseInt, that takes a string and returns an int.
This function throws a NumberFormatException if the string does not represent a valid int. Write a static function called parseInt, which takes two arguments, a String and an int (the int represents the default value), and returns an int. This function calls Integer.parseInt, and handles the exception so that, if parseInt raises a NumberFormatException the function would return the default value.
```java
 	static int parseInt(String in, int defVal){
 		try {
 			return Integer.parseInt(in);
 		} catch(Exception e) {
 			return defVal;
 		}
 	}
```

7. Given the Fraction class you created above, write a static createFraction method, that takes two integers, the numerator and denominator, and returns a Fraction with that numerator and denominator; however, if the denominator is zero, the function will throw an IllegalArgumentException (this class is defined by java and has a constructor with no arguments and one which takes a String argument for an error message, if you prefer).
```java
 	static Fraction createFraction(int numerator,int denominator) throws IllegalArgumentException {
 		if(denominator==0)
 			throw new IllegalArgumentException("Denominator cannot be 0");
 		return new Fraction(numerator,denominator);
 	}
```

8. Write a function called ArrayFrequencies, that takes a List of Strings, and returns a Map of String to Int. The function maps every String in the array to its frequency (so if the string appears 3 times, it would be in the map paired with a value of 3).
Hint- HashMap is the standard class for Maps. Map has methods containsKey, put and get.
```java
 	static Map<String,Integer> ArrayFrequencies(List<String> words) {
 		Map<String,Integer> frequencies=new HashMap<String,Integer>();
 		for(String word:words) {
 			if(!frequencies.containsKey(word))
 				frequencies.put(word, 1);
 			else
 				frequencies.put(word, frequencies.get(word)+1);
 		}
 		
 		return frequencies;
 	}
```

9. Write a function called MostCommonWord, that takes a List of Strings and returns the String which occurs more frequently in the list. You can assume the array contains no null values.
Hint-Can call function above. Map also has methods keySet and entrySet which may be useful. EntrySet returns a Collection of Map.Entry ; Map.Entry has getKey() and getValue().
```java
 	static String MostCommonWord(List<String> words) {
 		Map<String,Integer> frequencies=ArrayFrequencies(words);
 		int highFreq=0; 
 		String high="";
 		for(Map.Entry<String, Integer> entry : frequencies.entrySet()) {
 			if(entry.getValue()>highFreq) {
 				highFreq=entry.getValue();
 				high=entry.getKey();
 			}
 		}
 		return high;
 	}
```