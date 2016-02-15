package okaram.samples;

public class IfSamples {

	public static String booleanToYesNo(boolean b)
	{
	    if( b ) {
	        return "Yes";
	    } else {
	        return "No";
	    }
	}
	
	public static int abs(int number)
	{
		if(number<0) {
			return -number;
		} else {
			return number;
		}
	}
	
	public static int sign(int number)
	{
		if( number<0 ) {
			return -1;
		} else {
			if ( number>0 ) {
				return 1;
			} else {
				return 0;
			}
		}
	}

	public static int sign_chained(int number)
	{
		if( number<0 ) {
			return -1;
		} else if ( number>0 ) {
			return 1;
		} else {
			return 0;
		}
	}

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
			return "Fizz";
		} else if( number%5 == 0 ) {
			return "Buzz";
		} else {
			return ""+number;
		}
	}

	/** 
	 * @return the biggest of its two parameters (or the value of both if there's a tie)
	 */
	public static int max2(int n1, int n2) {
		if(n1>=n2) {
			return n1;
		} else {
			return n2;
		}
	}
	
	/** 
	 * Implementing using chained if statements
	 * @return the biggest of its three parameters. 
	 */
	public static int max3_chained(int n1, int n2, int n3) {
		if(n1>=n2 && n1>=n3){
			return n1;
		} else if (n2>=n1 && n2>=n3) {
			return n2;
		} else {
			return n3;
		}
	}

	/** 
	 * Implementing using nested if statements
	 * @return the biggest of its three parameters. 
	 */
	public static int max3_nested(int n1, int n2, int n3) {
		if(n1>=n2)  { // we know it's either n1 or n3
			if(n1>=n3)
				return n1;
			else
				return n3;
		} else { // not n1, so n2 or n3 
			if (n2>=n3) {
				return n2;
			} else {
				return n3;
			}
		}
	}
	// it is easier when we build in pieces :)
	public static int max3(int n1, int n2, int n3)
	{
		return max2(max2(n1,n2), n3);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(String.format("{1}, {2}", 10,20));
	}

}
