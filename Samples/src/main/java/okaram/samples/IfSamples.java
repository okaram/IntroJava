package okaram.samples;

public class IfSamples {

	/**
	 * Ages above 60 are old. Returns "Old" or "Young" depending on the age
	 */
	public static String ageToCategory1(int age) {
		if(age>60) {
			return "Old";
		} else {
			return "Young";
		}
	}
	
	/** 
	 * If the number is divisible by 3 return "Fizz"
	 * If the number is divisible by 5 return "Buzz"
	 * If the number is divisible by both 3 and 5 return "FizzBuzz"
	 * If it's not divisible by either, return the string representation of the number (123, for example)
	 * Using nested if statements
	 */
	public static String FizzBuzzNested(int number) {
		if(number % 3 ==0) {
			if(number % 5 == 0) {
				return "FizzBuzz";
			} else {
				return "Fizz";
			}
		} else {
			if(number % 5 ==0) {
				return "Buzz";
			} else {
				return ""+number;
			}
		}
	}
	
	/** 
	 * If the number is divisible by 3 return "Fizz"
	 * If the number is divisible by 5 return "Buzz"
	 * If the number is divisible by both 3 and 5 return "FizzBuzz"
	 * If it's not divisible by either, return the string representation of the number (123, for example)
	 * Using chained if statements
	 */
	public static String FizzBuzzChained(int number) {
		if( (number%3==0) && (number%5==0)) { // or if (number%15==0), but ...
			return "FizzBuzz";
		}
		else if( number%3 == 0 ) {
			return "FizzBuzz";
		} else if( number%5 == 0 ) {
			return "Buzz";
		} else {
			return ""+number;
		}
	}

	/** 
	 * @return the bigger of its two parameters
	 */
	public static int max2(int n1, int n2) {
		if(n1>=n2) {
			return n2;
		} else {
			return n1;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
