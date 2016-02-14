package okaram.samples;

public class LoopSamples {

	/*
	 * this function returns true if a given number is prime, false otherwise
	 * it does it by checking every number from 2 to sqrt(n) to see if it
	 * perfectly divides n
	 */
	public boolean isPrime(int n)
	{
		int sq=(int)Math.sqrt(n);
		for(int i=2; i<sq; ++i)
			if(n%i==0)
				return false;
		return true;
	}
	
	/*
	 * calculates the factorial, using a for loop
	 */
	int factorial(int n)
	{
		int fac=1;
		for(int i=0; i<n; ++i)
			fac*=n;
		return fac;
	}
	
	/*
	 * returns true if the given number contains the given digit (but the 
	 * number 0 does not contain any digit)
	 */
	public static boolean containsDigit(int number, int digit)
	{
		while(number!=0){
			int lastDigit=number%10;
			if(lastDigit==digit)
				return true;
			number /=10;
		}
		return false;
	}

	/* 
	 * raises a number (base) to a given power. Uses a while loop
	 */
	int power(int base, int exponent)
	{
		int pow=1;
		while(exponent>0) {
			pow*=base;
			--exponent;
		}
		return pow;
	}

	/*
	 * power, using a for loop
	 */
	int power_for(int base, int exponent)
	{
		int pow=1;
		for(int i=0; i<exponent; ++i) {
			pow*=base;
		}
		return pow;
	}

	/*
	 * 
	 */
	boolean stringContains(String s, char c)
	{
		for(int i=0;i<s.length();++i)
			if(s.charAt(i)==c)
				return true;
		// if we get out of the loop, we didn't find it
		return false;
	}

	// other examples
	// readAndSum - ask whether you have more numbers
	//		readAndAverage, readAnd...
	//
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(containsDigit(1235,5));
	}

}
