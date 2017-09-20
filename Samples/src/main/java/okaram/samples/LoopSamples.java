package okaram.samples;

import java.util.Scanner;

public class LoopSamples {

	/*
	 * this function returns true if a given number is prime, false otherwise
	 * it does it by checking every number from 2 to sqrt(n) to see if it
	 * perfectly divides n
	 */
	public boolean isPrime(int n)
	{
		int sq=(int)Math.sqrt(n);
		for(int i=2; i<=sq; ++i)
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
	public static int power_for(int base, int exponent)
	{
		int pow=1;
		for(int i=0; i<exponent; ++i) {
			pow*=base;
		}
		return pow;
	}

	public static int power_w2(int base, int exponent)
	{
		int pow=1;
		int i=0;
		while( i<exponent) {
			pow*=base;
			
			 ++i;
		}
		return pow;
	}

	public static int power_r(int base, int exponent, int i)
	{
		if(i>=exponent)
			return 1;
		return base*power_r(base, exponent,i+1);
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
	
	public static int numberOfAs(String s)
	{
		int count=0;
		for(int i=0; i<s.length(); ++i)
		{
			if(s.charAt(i)=='a')
				++count; 
		}
		return count;
	}

	
	public static int readAndSum(Scanner in)
	{
		int sum=0;
		int input;
		do {
			System.out.println("Please enter a number (0 to stop)");
			input=in.nextInt();
			sum+=input;
		} while(input!=0);
		return sum;
	}

	public static double readAndAverage(Scanner in)
	{
		int sum=0;
		double count=0.0;
		int input;
		do {
			System.out.println("Please enter a number (0 to stop)");
			input=in.nextInt();
			sum+=input;
			++count;
		} while(input!=0);
		return sum/(count-1);
	}
	
	public static double readAndAverage2(Scanner in)
	{
		int sum=0;
		double count=0.0;
		int input=127;
		while(input!=0){
			System.out.println("Please enter a number (0 to stop)");
			input=in.nextInt();
			sum+=input;
			++count;
		} 
		return sum/(count-1);
	}
	
	public static double readAndAverage_wb(Scanner in)
	{
		int sum=0;
		double count=0.0;
		int input=127;
		while(true){
			System.out.println("Please enter a number (0 to stop)");
			input=in.nextInt();
			if(input==0)
				break;

			sum+=input;
			++count;
		} 
		return sum/(count-1);
	}
	
	// other examples
	// readAndSum - ask whether you have more numbers
	//		readAndAverage, readAnd...
	//
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
//		int s=readAndSum(in);
		System.out.println(readAndAverage2(in));
	}

}
