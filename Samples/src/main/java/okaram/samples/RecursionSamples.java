package okaram.samples;

public class RecursionSamples {
	
	public static String stringTimes(String base, int times) {
		if(times<=0)
			return "";
		else
			return base + stringTimes(base, times-1);
	}
	
	public static String stringTimesAccum(String base, int times, String Accum) {
		if(times<=0)
			return Accum;
		else
			return stringTimesAccum(base, times-1, base+Accum);
	}
	
	public int pow(int base, int exponent) {
		if(exponent<=0)
			return 1;
		else
			return base*pow(base,exponent-1);
	}
	
	public int factorial(int n) {
		if(n<=0)
			return 1;
		else
			return n*factorial(n-1);
	}

	public static void printCountDown(int from)
	{
		if(from<0)
			return;
		else {
			System.out.println(from);
			printCountDown(from-1);
		}
	}
	
	public static void printCountUp(int from, int to)
	{
		if(from>to)
			return;
		else {
			System.out.println(from);
			printCountUp(from+1,to);
		}
	}
	
	public static int addFromToBy(int from, int to, int by)
	{
		if(from>to)
			return 0;
		else
			return from+addFromToBy(from+by,to,by);
	}
	
	// returns true if the string contains the character
	// we start looking at the char with index from (so if from is 3, we just care whether the string
	// contains the c in its 4th through last characters
	private static boolean stringContains(String s, char c, int from)
	{
		if(from>=s.length())
			return false;
		else if (s.charAt(from)==c)
			return true;
		else
			return stringContains(s,c,from+1);
	}
	
	public static boolean stringContains(String s, char c)
	{
		return stringContains(s,c,0);
	}
	
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

	public static void main(String[] args) {
		printCountDown(10);
		System.out.println("\n\nNow up" );
		printCountUp(5,10);
	}
}
